package net.betvictor.dataservice.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Statistic {
    @Id
    private String id;
    @NonNull
    private String freqWord;
    private int avgParagraphSize;
    @NonNull
    private Long avgParagraphProcessingTime;
    @NonNull
    private Long totalProcessingTime;
    @CreatedDate
    private Instant createdDate;
}
