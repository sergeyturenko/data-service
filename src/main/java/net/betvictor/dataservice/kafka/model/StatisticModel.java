package net.betvictor.dataservice.kafka.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
//TODO This class can be move to common libs
public class StatisticModel {
    @JsonProperty("freq_word")
    private String freqWord;
    @JsonProperty("avg_paragraph_size")
    private int avgParagraphSize;
    @JsonProperty("avg_paragraph_processing_time")
    private Long avgParagraphProcessingTime;
    @JsonProperty("total_processing_time")
    private Long totalProcessingTime;
}
