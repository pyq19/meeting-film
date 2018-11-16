package com.stylefeng.guns.rest.modular.film.vo;

import lombok.Data;

import java.util.List;

@Data
public class FilmIndexVO {
    private List<BannerVO> banner;
    private FilmVO hotFilm;
    private FilmVO soonFilm;
    private List<FilmInfo> boxRanking;
    private List<FilmInfo> expectRanking;
    private List<FilmInfo> top100;
}
