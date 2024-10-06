package com.heimdallauth.server.authguard.models.wf;

import com.heimdallauth.commons.constants.StageAction;
import lombok.*;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class WorkflowStage {
    private String stageId;
    private String stageName;
    private String description;
    private List<String> approvers;
    private StageAction action;
    private Boolean isTerminal;
    private List<String> nextStages;
}
