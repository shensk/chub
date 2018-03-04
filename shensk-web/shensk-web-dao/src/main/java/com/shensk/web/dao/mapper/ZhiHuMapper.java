package com.shensk.web.dao.mapper;

import com.shensk.web.dao.model.ZhiHu;
import com.shensk.web.dao.model.ZhiHuExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface ZhiHuMapper {
    int countByExample(ZhiHuExample example);

    int deleteByExample(ZhiHuExample example);

    @Delete({
        "delete from zhihu",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into zhihu (zid, title, ",
        "image, user_avatar, ",
        "user_name, created_at, ",
        "body)",
        "values (#{zid,jdbcType=INTEGER}, #{title,jdbcType=VARCHAR}, ",
        "#{image,jdbcType=VARCHAR}, #{userAvatar,jdbcType=VARCHAR}, ",
        "#{userName,jdbcType=VARCHAR}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{body,jdbcType=LONGVARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(ZhiHu record);

    int insertSelective(ZhiHu record);

    List<ZhiHu> selectByExampleWithBLOBs(ZhiHuExample example);

    List<ZhiHu> selectByExample(ZhiHuExample example);

    @Select({
        "select",
        "id, zid, title, image, user_avatar, user_name, created_at, body",
        "from zhihu",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("ResultMapWithBLOBs")
    ZhiHu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZhiHu record, @Param("example") ZhiHuExample example);

    int updateByExampleWithBLOBs(@Param("record") ZhiHu record, @Param("example") ZhiHuExample example);

    int updateByExample(@Param("record") ZhiHu record, @Param("example") ZhiHuExample example);

    int updateByPrimaryKeySelective(ZhiHu record);

    @Update({
        "update zhihu",
        "set zid = #{zid,jdbcType=INTEGER},",
          "title = #{title,jdbcType=VARCHAR},",
          "image = #{image,jdbcType=VARCHAR},",
          "user_avatar = #{userAvatar,jdbcType=VARCHAR},",
          "user_name = #{userName,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "body = #{body,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(ZhiHu record);

    @Update({
        "update zhihu",
        "set zid = #{zid,jdbcType=INTEGER},",
          "title = #{title,jdbcType=VARCHAR},",
          "image = #{image,jdbcType=VARCHAR},",
          "user_avatar = #{userAvatar,jdbcType=VARCHAR},",
          "user_name = #{userName,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ZhiHu record);
}