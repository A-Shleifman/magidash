package uk.co.optimisedsoftware.magidash.features.dashboard;

import lombok.*;

import java.time.LocalDateTime;

@Data
public class DashboardOutDto {
    Long id;
    String title;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
}
