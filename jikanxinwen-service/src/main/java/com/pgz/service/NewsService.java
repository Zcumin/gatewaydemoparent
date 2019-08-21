package com.pgz.service;

import com.pgz.controller.News;
import com.pgz.dao.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {

    @Autowired
    private NewsMapper newsMapper;

    public List<News> demo(){
        List<News> list = newsMapper.selectAll();
        return list;
    }

}
