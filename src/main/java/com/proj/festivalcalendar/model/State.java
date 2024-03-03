package com.proj.festivalcalendar.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class State {
    @Id
    Integer stateId;
    String img;
    String stateName;
    List<Festival> festivalList;
}
