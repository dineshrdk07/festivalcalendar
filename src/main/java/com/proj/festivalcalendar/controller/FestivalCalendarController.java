package com.proj.festivalcalendar.controller;


import com.proj.festivalcalendar.model.Festival;
import com.proj.festivalcalendar.model.State;
import com.proj.festivalcalendar.service.FestivalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class FestivalCalendarController {

    @Autowired
    FestivalService festivalService;

    @PostMapping("/save/state")
    @CrossOrigin(origins = "https://www.google.com")
    public ResponseEntity<State> saveState(@RequestBody State state){
        State res = festivalService.saveState(state);
        return new ResponseEntity<>(res, HttpStatusCode.valueOf(200));
    }

    @GetMapping("/getStates")
    public List<State> getStates(){
        List<State> res = festivalService.getStates();
        return res;
    }
}
