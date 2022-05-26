package net.betvictor.dataservice.repository;

import net.betvictor.dataservice.data.Statistic;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface StatisticRepository extends MongoRepository<Statistic, Long> {
    @Query("{}")
    List<Statistic> limit(Pageable request);
}
