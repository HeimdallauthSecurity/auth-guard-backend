package com.heimdallauth.server.authguard.models.wf;

import lombok.*;

import java.time.Instant;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Workflow {
    private String workflowId;
    private String workflowName;
    private String workflowDescription;
    private List<WorkflowStage> stages;
    private WorkflowStage initialStage;
    private List<String> workflowConditions;
    private Boolean isActive;
    private Instant createdAt;
}
