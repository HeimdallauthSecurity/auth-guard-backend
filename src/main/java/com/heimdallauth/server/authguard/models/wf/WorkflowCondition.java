package com.heimdallauth.server.authguard.models.wf;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class WorkflowCondition {
    private String conditionId;
    private String conditionName;
    private String conditionDescription;
    private String conditionExpression;
    private Boolean isMandatory;
}
