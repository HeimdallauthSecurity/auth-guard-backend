package com.heimdallauth.server.authguard.utils.wf;

import com.heimdallauth.server.authguard.models.wf.StageApproval;
import com.heimdallauth.server.authguard.models.wf.WorkflowStage;
import com.heimdallauth.server.authguard.models.wf.WorkflowTransition;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicInteger;

public class WorkflowUtils {
    private static final AtomicInteger stageIdCounter = new AtomicInteger(0);
    private static final AtomicInteger transitionIdCounter = new AtomicInteger(0);
    private static final AtomicInteger approvalIdCounter = new AtomicInteger(0);

    public static void generateAndAssignId(Object object, String workflowId){
        if(object == null) return;
        Class<?> clazz = object.getClass();
        String prefix = getPrefixForClass(clazz);
        int nextId = getNextId(clazz);
        if(prefix != null &&  nextId >0 ){
            Field idField = ReflectionUtils.findField(clazz, "id");
            if(idField != null){
                ReflectionUtils.makeAccessible(idField);
                ReflectionUtils.setField(idField, object, String.format("%s-%s-%d", prefix, workflowId, nextId));
            }
        }

    }
    private static String getPrefixForClass(Class<?> clazz){
        return switch (clazz.getSimpleName()) {
            case "WorkflowStage" -> "STAGE";
            case "WorkflowTransition" -> "TRANSITION";
            case "StageApproval" -> "APPROVAL";
            default -> null;
        };
    }
    private static int getNextId(Class clazz){
        if(clazz == WorkflowStage.class){
            return stageIdCounter.incrementAndGet();
        }else if(clazz == WorkflowTransition.class){
            return transitionIdCounter.incrementAndGet();
        }else if(clazz == StageApproval.class){
            return approvalIdCounter.incrementAndGet();
        }
        return -1;
    }
}
