package com.stylefeng.guns.rest.modular.film;

import com.alibaba.dubbo.config.annotation.Reference;
import com.stylefeng.guns.api.film.FilmServiceAPI;
import com.stylefeng.guns.rest.modular.film.vo.FilmIndexVO;
import com.stylefeng.guns.rest.modular.vo.ResponseVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/film/")
public class FilmController {

    private static final String IMG_PRE = "http://image.impyq.com/";

    @Reference(interfaceClass = FilmServiceAPI.class)
    private FilmServiceAPI filmServiceAPI;

    // 获取首页信息（网关 API 聚合
    @RequestMapping(value = "getIndex", method = RequestMethod.GET)
    public ResponseVO getIndex() {
        FilmIndexVO filmIndexVO = new FilmIndexVO();
        // 获取 banner 信息
        filmIndexVO.setBanner(filmServiceAPI.getBanners());
        // 获取 正在热映 的电影
        filmIndexVO.setHotFilm(filmServiceAPI.getHotFilms(true, 8));
        // 获取 即将上映 的电影
        filmIndexVO.setSoonFilm(filmServiceAPI.getSoonFilms(true, 8));
        // 获取 票房排行榜
        filmIndexVO.setBoxRanking(filmServiceAPI.getBoxRanking());
        // 获取 受欢迎的榜单
        filmIndexVO.setExpectRanking(filmServiceAPI.getExpectRanking());
        // 获取 排名前100 的电影
        filmIndexVO.setTop100(filmServiceAPI.getTop());
        return ResponseVO.success(IMG_PRE, filmIndexVO);
    }

    // 影片条件列表查询接口
    @RequestMapping(value = "getConditionList", method = RequestMethod.GET)
    public ResponseVO getConditionList(
            @RequestParam(name = "catId", required = false, defaultValue = "99") String catId,
            @RequestParam(name = "sourceId", required = false, defaultValue = "99") String sourceId,
            @RequestParam(name = "yearId", required = false, defaultValue = "99") String yearId) {
        // 类型集合
            // 判断集合是否存在 catId，如果存在，则将对应的实体变成 active 状态

        // 片源集合

        // 年代集合

        return null;
    }
}
