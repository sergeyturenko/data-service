package net.betvictor.dataservice.mapper;

import net.betvictor.dataservice.data.Statistic;
import net.betvictor.dataservice.dto.StatisticDto;
import net.betvictor.dataservice.kafka.model.StatisticModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StatisticMapping {
    Statistic toEntity(StatisticModel dto);
    StatisticDto toDto(Statistic entity);
}
