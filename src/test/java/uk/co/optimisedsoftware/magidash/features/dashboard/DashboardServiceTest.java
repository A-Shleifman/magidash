package uk.co.optimisedsoftware.magidash.features.dashboard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class DashboardServiceTest {

    @Mock
    private DashboardRepository dashboardRepository;

    @InjectMocks
    private DashboardService dashboardService;

    @Test
    void getDashboards() {
        List<Dashboard> dashboards = Arrays.asList(
                new Dashboard(1L, "Dashboard 1", LocalDateTime.now(), LocalDateTime.now()),
                new Dashboard(2L, "Dashboard 2", LocalDateTime.now(), LocalDateTime.now())
        );

        given(dashboardRepository.findAll()).willReturn(dashboards);

        assertThat(dashboardService.getDashboards()).isEqualTo(dashboards);
    }

    @Test
    void getDashboardById() {
        Dashboard dashboard = new Dashboard(1L, "Dashboard 1", LocalDateTime.now(), LocalDateTime.now());

        given(dashboardRepository.findById(anyLong())).willReturn(Optional.of(dashboard));

        assertThat(dashboardService.getDashboardById(1L)).isEqualTo(dashboard);
    }
}