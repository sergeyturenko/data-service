package net.betvictor.dataservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StatisticDto {
    @JsonProperty("freq_word")
    private String freqWord;

    @JsonProperty("avg_paragraph_size")
    private int avgParagraphSize;

    @JsonProperty("avg_paragraph_processing_time")
    private Long avgParagraphProcessingTime;

    @JsonProperty("total_processing_time")
    private Long totalProcessingTime;
}
