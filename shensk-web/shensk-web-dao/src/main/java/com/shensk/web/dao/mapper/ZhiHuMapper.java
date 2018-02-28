package com.shensk.web.dao.mapper;

import com.shensk.web.dao.model.ZhiHu;
import com.shensk.web.dao.model.ZhiHuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZhiHuMapper {
    int countByExample(ZhiHuExample example);

    int deleteByExample(ZhiHuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZhiHu record);

    int insertSelective(ZhiHu record);

    List<ZhiHu> selectByExampleWithBLOBs(ZhiHuExample example);

    List<ZhiHu> selectByExample(ZhiHuExample example);

    ZhiHu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZhiHu record, @Param("example") ZhiHuExample example);

    int updateByExampleWithBLOBs(@Param("record") ZhiHu record, @Param("example") ZhiHuExample example);

    int updateByExample(@Param("record") ZhiHu record, @Param("example") ZhiHuExample example);

    int updateByPrimaryKeySelective(ZhiHu record);

    int updateByPrimaryKeyWithBLOBs(ZhiHu record);

    int updateByPrimaryKey(ZhiHu record);
}