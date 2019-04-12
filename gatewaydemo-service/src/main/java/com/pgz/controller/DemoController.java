package com.pgz.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping
public class DemoController {

    @GetMapping("hello")
    public ResponseEntity<Object> demo(String userId){
        System.err.println(userId);
        List<Integer> list = new ArrayList<Integer>();
        for(int a=0;a<11;a++) {list.add(a);}
        return ResponseEntity.ok(list);
    }

    @GetMapping("no")
    public ResponseEntity<Object> hydemo(){
        System.err.println("开始熔断");
        List<String> list = new ArrayList<String>();
        for(int a=0;a<10;a++) {list.add("熔断啦!"+a);}
        return ResponseEntity.ok(list);
    }

    @GetMapping("yes")
    public ResponseEntity<Object> hdemo(){
        System.err.println("熔断测试");
        try {
            Thread.sleep(new Random().nextInt(5000)+1000);
        }catch (Exception e){}
        List<String> list = new ArrayList<String>();
        for(int a=0;a<10;a++) {list.add("熔断啦!"+a);}
        return ResponseEntity.ok(list);
    }
}
