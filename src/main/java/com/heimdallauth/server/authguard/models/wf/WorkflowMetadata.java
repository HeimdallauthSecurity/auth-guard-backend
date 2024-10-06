package com.heimdallauth.server.authguard.models.wf;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class WorkflowMetadata {
    private String createdBy;
    private String updatedBy;
    private List<String> organizations;
    private List<String> tags;
    private Instant createdOn;
    private Instant updatedOn;
}
