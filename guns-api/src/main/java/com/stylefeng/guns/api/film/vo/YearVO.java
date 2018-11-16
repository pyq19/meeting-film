package com.stylefeng.guns.api.film.vo;

import lombok.Data;

import java.io.Serializable;


// 影片年代
@Data
public class YearVO implements Serializable {
    private String yearId;
    private String yearName;
    private boolean isActive;
}

