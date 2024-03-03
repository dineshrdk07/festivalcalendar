package com.proj.festivalcalendar.service;


import com.proj.festivalcalendar.model.Festival;
import com.proj.festivalcalendar.model.State;
import com.proj.festivalcalendar.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FestivalService {
    @Autowired
    StateRepository stateRepository;

    public State saveState(State state){
        return stateRepository.save(state);
    }

    public List<State> getStates(){
        return stateRepository.findAll();
    }
}
