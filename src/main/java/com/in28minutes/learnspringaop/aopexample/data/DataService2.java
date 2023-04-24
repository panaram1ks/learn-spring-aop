package com.in28minutes.learnspringaop.aopexample.data;

import com.in28minutes.learnspringaop.aopexample.annotations.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class DataService2 {

    @TrackTime
    public int[] retrieveData(){
        return new int[] {11,22,33,44,55};
    }
}
