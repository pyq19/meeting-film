package com.stylefeng.guns.api.cinema.vo;

import lombok.Data;

import java.io.Serializable;

// 查询影院列表
// 根据 CinemaQueryVO 查询影院列表
@Data
public class CinemaVO implements Serializable {
    private String uuid;
    private String cinemaName;
    private String address;
    private String minimumPrice;
}
