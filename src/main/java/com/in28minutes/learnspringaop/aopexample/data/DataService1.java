package com.in28minutes.learnspringaop.aopexample.data;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class DataService1 {

    public int[] retrieveData(){
        return new int[] {11,22,33,44,55};
    }
}
