package uk.co.optimisedsoftware.magidash.features.dashboard;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uk.co.optimisedsoftware.magidash.features.dashboard.exception.DashboardNotFoundException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DashboardService {

    private final DashboardRepository dashboardRepository;

    public List<Dashboard> getDashboards() {
        return dashboardRepository.findAll();
    }

    public Dashboard getDashboardById(Long id) {
        return dashboardRepository.findById(id).orElseThrow(() -> new DashboardNotFoundException(id));
    }

}
