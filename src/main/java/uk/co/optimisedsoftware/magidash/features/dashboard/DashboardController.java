package uk.co.optimisedsoftware.magidash.features.dashboard;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(DashboardController.ENDPOINT)
@RequiredArgsConstructor
public class DashboardController {
    public static final String ENDPOINT = "/dashboards";

    private final DashboardService dashboardService;
    private final DashboardOutDtoMapper mapper;

    @GetMapping
    public ResponseEntity<List<DashboardOutDto>> getDashboards() {
        List<Dashboard> dashboards = dashboardService.getDashboards();

        return ResponseEntity.ok(mapper.fromEntity(dashboards));
    }

    @GetMapping("/{id}")
    public ResponseEntity<DashboardOutDto> getDashboardById(@PathVariable("id") Long id) {
        Dashboard dashboard = dashboardService.getDashboardById(id);

        return ResponseEntity.ok(mapper.fromEntity(dashboard));
    }
}
