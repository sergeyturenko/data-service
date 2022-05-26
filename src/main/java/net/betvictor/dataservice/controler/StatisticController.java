package net.betvictor.dataservice.controler;

import lombok.RequiredArgsConstructor;
import net.betvictor.dataservice.dto.StatisticDto;
import net.betvictor.dataservice.service.StatisticService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/betvictor/history", produces = MediaType.APPLICATION_JSON_VALUE)
public class StatisticController {

    private final StatisticService statisticService;

    @GetMapping
    public List<StatisticDto> getLastMessages() {
        return statisticService.getLast(10);
    }
}
