package com.stylefeng.guns.rest.modular.cinema.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.stylefeng.guns.api.cinema.CinemaServiceAPI;
import com.stylefeng.guns.api.cinema.vo.*;
import com.stylefeng.guns.rest.common.persistence.dao.*;
import com.stylefeng.guns.rest.common.persistence.model.MoocCinemaT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Service(interfaceClass = CinemaServiceAPI.class)
public class DefaultCinemaServiceImpl implements CinemaServiceAPI {

    @Autowired
    private MoocCinemaTMapper moocCinemaTMapper;

    @Autowired
    private MoocAreaDictTMapper moocAreaDictTMapper;

    @Autowired
    private MoocBrandDictTMapper moocBrandDictTMapper;

    @Autowired
    private MoocHallDictTMapper moocHallDictTMapper;

    @Autowired
    private MoocHallFilmInfoTMapper moocHallFilmInfoTMapper;

    @Autowired
    private MoocFieldTMapper moocFieldTMapper;

    // 1、根据CinemaQueryVO，查询影院列表
    @Override
    public Page<CinemaVO> getCinemas(CinemaQueryVO cinemaQueryVO) {
        // 业务实体集合
        List<CinemaVO> cinemas = new ArrayList<>();
        Page<MoocCinemaT> page = new Page<>(cinemaQueryVO.getNowPage(), cinemaQueryVO.getPageSize());
        // 判断是否传入查询条件 -> brandId，distId，hallType 是否 == 99
        EntityWrapper<MoocCinemaT> entityWrapper = new EntityWrapper<>();
        if (cinemaQueryVO.getBrandId() != 99) {
            entityWrapper.eq("brand_id", cinemaQueryVO.getBrandId());
        }
        if (cinemaQueryVO.getDistrictId() != 99) {
            entityWrapper.eq("area_id", cinemaQueryVO.getDistrictId());
        }
        if (cinemaQueryVO.getHallType() != 99) {  // %#3#%
            entityWrapper.like("hall_ids", "%#+" + cinemaQueryVO.getHallType() + "+#%");
        }

        // 将数据实体转换为业务实体
        List<MoocCinemaT> moocCinemaTS = moocCinemaTMapper.selectPage(page, entityWrapper);
        for (MoocCinemaT moocCinemaT : moocCinemaTS) {
            CinemaVO cinemaVO = new CinemaVO();
            cinemaVO.setUuid(moocCinemaT.getUuid() + "");
            cinemaVO.setMinimumPrice(moocCinemaT.getMinimumPrice() + "");
            cinemaVO.setCinemaName(moocCinemaT.getCinemaName());
            cinemaVO.setAddress(moocCinemaT.getCinemaAddress());
            cinemas.add(cinemaVO);
        }
        // 根据条件判断影院列表总数
        long counts = moocCinemaTMapper.selectCount(entityWrapper);
        // 组织返回值对象
        Page<CinemaVO> result = new Page<>();
        result.setRecords(cinemas);
        result.setSize(cinemaQueryVO.getPageSize());
        result.setTotal(counts);
        return result;
    }

    // 2、根据条件获取品牌列表 [除了就 99 以外，其他的数字为 isActive(前端渲染选中时红圈) ]
    @Override
    public List<BrandVO> getBrands(int brandId) {
        return null;
    }

    // 3、获取行政区域列表
    @Override
    public List<AreaVO> getAreas(int areaId) {
        return null;
    }

    // 4、获取影厅类型列表
    @Override
    public List<HallTypeVO> getHallTypes(int hallType) {
        return null;
    }

    // 5、根据影院编号，获取影院信息
    @Override
    public CinemaInfoVO getCinemaInfoById(int cinemaId) {
        return null;
    }

    // 6、获取所有电影的信息和对应的*放映场次*信息，根据影院编号
    @Override
    public List<FilmInfoVO> getFilmInfoByCinemaId(int cinemaId) {
        return null;
    }

    // 7、根据放映场次ID获取放映信息
    @Override
    public HallInfoVO getFilmFieldInfo(int fieldId) {
        return null;
    }

    // 8、根据放映场次查询播放的电影编号，然后根据电影编号获取对应的电影信息
    @Override
    public FilmInfoVO getFilmInfoByFieldId(int fieldId) {
        return null;
    }
}
