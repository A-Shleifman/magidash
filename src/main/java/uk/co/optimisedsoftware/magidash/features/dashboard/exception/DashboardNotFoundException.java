package uk.co.optimisedsoftware.magidash.features.dashboard.exception;

public class DashboardNotFoundException extends RuntimeException {

    public DashboardNotFoundException(Long id) {
        super("Dashboard with id " + id + " could not be found");
    }

}
