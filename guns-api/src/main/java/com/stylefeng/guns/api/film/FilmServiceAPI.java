package com.stylefeng.guns.api.film;

import com.stylefeng.guns.api.film.vo.*;

import java.util.List;

public interface FilmServiceAPI {

    // 获取 benner
    List<BannerVO> getBanners();

    // 获取热映影片
    FilmVO getHotFilms(boolean isLimit, int nums);

    // 获取即将上映影片【按受欢迎程度排序
    FilmVO getSoonFilms(boolean isLimit, int nums);

    // 获取票房排行榜
    List<FilmInfo> getBoxRanking();

    // 获取人气排行榜
    List<FilmInfo> getExpectRanking();

    // 获取 top100
    List<FilmInfo> getTop();

    // ============ 获取影片条件接口
    // 分类条件
    List<CatVO> getCats();

    // 片源条件 (欧美、日韩、大陆。。。。
    List<SourceVO> getSources();

    // 获取年代
    List<YearVO> getYears();

}
