package net.betvictor.dataservice.service;

import lombok.RequiredArgsConstructor;
import net.betvictor.dataservice.data.Statistic;
import net.betvictor.dataservice.dto.StatisticDto;
import net.betvictor.dataservice.kafka.model.StatisticModel;
import net.betvictor.dataservice.mapper.StatisticMapping;
import net.betvictor.dataservice.repository.StatisticRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StatisticService {

    private final StatisticMapping statisticMapping;
    private final StatisticRepository statisticRepository;

    public List<Statistic> getLimitedResult(int limit) {
        Pageable sorted = PageRequest.of(0, limit, Sort.by("createdDate").descending());
        return statisticRepository.limit(sorted);
    }

    public List<StatisticDto> getLast(int limit) {
        return getLimitedResult(limit)
                .stream()
                .map(statisticMapping::toDto)
                .collect(Collectors.toList());
    }

    public void add(StatisticModel statisticModel) {
        statisticRepository.save(statisticMapping.toEntity(statisticModel));
    }

}
