package com.myprogramming.SpringApp.Manager;

import com.myprogramming.SpringApp.Model.Travel;
import com.myprogramming.SpringApp.Records.Records;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TravelManager {

    @Autowired
    private Records records;

    @PostMapping("addTravel")
    public Travel addTravel(@RequestBody Travel travel){
        return records.save(travel);
    }

    @GetMapping("travel")
    public List<Travel> getAllList(){
        return records.findAll();
    }

    @GetMapping("travel/{id}")
    public Optional<Travel> getTravelById(@PathVariable int id){
        return records.findById(id);
    }

    @DeleteMapping("travel/{id}")
    public String deleteById(@PathVariable int id){
        String result;
        try{
            records.deleteById(id);
            result="Travel Deleted Successfly !" + id;
        }catch(Exception e){
            result="Error";
        }
        return result;
    }
}
