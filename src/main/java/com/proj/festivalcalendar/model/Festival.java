package com.proj.festivalcalendar.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Festival {
    @Id
    Integer festivalId;
    String festivalName;
    String date;
    String description;
}
