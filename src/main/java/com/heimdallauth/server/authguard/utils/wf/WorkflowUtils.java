package com.heimdallauth.server.authguard.utils.wf;

import com.heimdallauth.commons.models.wf.StageApproval;
import com.heimdallauth.commons.models.wf.WorkflowStage;
import com.heimdallauth.commons.models.wf.WorkflowTransition;

import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicInteger;

public class WorkflowUtils {
    private static final AtomicInteger stageIdCounter = new AtomicInteger(0);
    private static final AtomicInteger transitionIdCounter = new AtomicInteger(0);
    private static final AtomicInteger approvalIdCounter = new AtomicInteger(0);

    public static void generateAndAssignId(Object object, String workflowId){
        if(object == null) return;
        Class<?> clazz = object.getClass();
        String prefix = getPrefixForClass(clazz, workflowId);
        int nextId = getNextId(clazz);
        if(prefix != null &&  nextId >0 ){
            Field idField =
        }

    }
    private static String getPrefixForClass(Class<?> clazz, String workflowId){
        return "";
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
