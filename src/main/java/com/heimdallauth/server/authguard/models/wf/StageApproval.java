package com.heimdallauth.server.authguard.models.wf;

import com.heimdallauth.server.authguard.constants.ApprovalStatus;
import lombok.*;

import java.time.Instant;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StageApproval {
    private String id;
    private String stageId;
    private String workflowId;
    private String approverUserId;
    private ApprovalStatus status;
    private String comments;
    private Instant createdAt;
    private Instant updatedAt;
}
