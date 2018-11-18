package com.stylefeng.guns.api.cinema.vo;


import lombok.Data;

import java.io.Serializable;

// 影院模块 - 条件接口 - 行政区域
@Data
public class AreaVO implements Serializable {
    private String areaId;
    private String areaName;
    private boolean isActive;
}
