package com.pgz.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Table(name = "news")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class News {

    @Id
    private Integer id;
    @Column(name="content")
    private String content;
    @Column(name="topimg")
    private String topimg;
    @Column(name="title")
    private String title;
    @Column(name="releasetime")
    private Date releasetime;
    @Column(name="reading")
    private Integer reading;
    @Column(name="tid")
    private Integer tid;
}
