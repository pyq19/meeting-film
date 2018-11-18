package com.stylefeng.guns.rest.modular.cinema;

import com.alibaba.dubbo.config.annotation.Reference;
import com.stylefeng.guns.api.cinema.CinemaServiceAPI;
import com.stylefeng.guns.api.cinema.vo.CinemaQueryVO;
import com.stylefeng.guns.rest.modular.vo.ResponseVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cinema/")
public class CinemaController {

    @Reference(interfaceClass = CinemaServiceAPI.class, check = false)
    private CinemaServiceAPI cinemaServiceAPI;

    // 查询影院列表
    @RequestMapping(value = "getCinemas")
    public ResponseVO getCinemas(CinemaQueryVO cinemaQueryVO) {
        // 按照五个条件进行筛选

        // 判断是否有满足条件的影院

        // 如果出现异常，应该如何处理

        return null;
    }

    // 获取影院列表查询条件
    // 根据条件获取 品牌列表、行政区域列表、影厅类型列表
    @RequestMapping(value = "getCondition")
    public ResponseVO getCondition(CinemaQueryVO cinemaQueryVO) {
        return null;
    }

    // 获取播放场次接口
    // 1. 根据影院编号，获取影院信息；2. 获取所有电影的信息和对应的放映场次信息
    @RequestMapping(value = "getFields")
    public ResponseVO getFields(Integer cinemaId) {
        return null;
    }

    // 获取场次详细信息
    // 1. 根据影院编号获取影院信息
    // 2. 根据放映场次 id 获取放映信息
    // 3. 根据放映场次查询播放的电影编号，再根据电影编号获取对应的电影信息
    // 4. 根据放映场次 id 获取已售座位
    @RequestMapping(value = "getFieldInfo", method = RequestMethod.POST)
    public ResponseVO getFieldInfo(Integer cinemaId, Integer fieldId) {
        return null;
    }
}
