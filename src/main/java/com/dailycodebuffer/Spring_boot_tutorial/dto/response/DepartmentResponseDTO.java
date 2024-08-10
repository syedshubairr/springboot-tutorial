package com.dailycodebuffer.Spring_boot_tutorial.dto.response;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class DepartmentResponseDTO {
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
