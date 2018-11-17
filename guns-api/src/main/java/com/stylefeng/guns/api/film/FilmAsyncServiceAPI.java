package com.stylefeng.guns.api.film;

import com.stylefeng.guns.api.film.vo.*;

import java.util.List;

public interface FilmAsyncServiceAPI {
    // 获取影片描述信息
    FilmDescVO getFilmDesc(String filmId);

    // 获取图片地址 img
    ImgVO getImgs(String filmId);

    // 获取导演信息
    ActorVO getDectInfo(String filmId);

    // 获取演员信息 actor
    List<ActorVO> getActors(String filmId);
}
