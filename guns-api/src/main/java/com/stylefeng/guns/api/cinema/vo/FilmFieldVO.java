package com.stylefeng.guns.api.cinema.vo;

import lombok.Data;

import java.io.Serializable;

// 影院模块 - 获取播放场次接口 - 场次信息
@Data
public class FilmFieldVO implements Serializable {
    private String fieldId;
    private String beginTime;
    private String endTime;
    private String language;
    private String hallName;
    private String price;
}
