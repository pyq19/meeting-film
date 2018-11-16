package com.stylefeng.guns.rest.modular.film;

import com.stylefeng.guns.rest.modular.film.vo.BannerVO;
import com.stylefeng.guns.rest.modular.vo.ResponseVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/film/")
public class FilmController {
    // 获取首页信息（网关 API 聚合
    @RequestMapping(value = "getIndex", method = RequestMethod.GET)
    public ResponseVO getIndex() {
        // 获取 banner 信息

        // 获取 正在热映 的电影

        // 获取 即将上映 的电影

        // 获取 票房排行榜

        // 获取 受欢迎的榜单

        // 获取 排名前100 的电影

        return null;
    }
}
