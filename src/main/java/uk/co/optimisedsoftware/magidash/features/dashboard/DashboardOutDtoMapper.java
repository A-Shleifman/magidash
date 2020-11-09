package uk.co.optimisedsoftware.magidash.features.dashboard;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DashboardOutDtoMapper {

    @Mapping(source = "id", target = "id")
    DashboardOutDto fromEntity(Dashboard entity);

    List<DashboardOutDto> fromEntity(List<Dashboard> entity);

}
