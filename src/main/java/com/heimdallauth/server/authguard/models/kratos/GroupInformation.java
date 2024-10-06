package com.heimdallauth.server.authguard.models.kratos;

import lombok.*;

import java.time.Instant;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GroupInformation {
    private String groupId;
    private String groupDescription;
    private List<String> members;
    private List<String> roles;
    private Instant groupCreationTimestamp;
}
