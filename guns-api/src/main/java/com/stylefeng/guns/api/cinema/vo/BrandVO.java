package com.stylefeng.guns.api.cinema.vo;

import lombok.Data;

import java.io.Serializable;

// 条件列表 - 品牌
@Data
public class BrandVO implements Serializable {
    private String brandId;
    private String brandName;
    private boolean isActive;
}
