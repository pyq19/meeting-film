package com.stylefeng.guns.rest.modular.film.vo;

import lombok.Data;

import java.util.List;

@Data
public class FilmVO {
    private int filmNum;
    private List<FilmInfo> filmInfo;

}
