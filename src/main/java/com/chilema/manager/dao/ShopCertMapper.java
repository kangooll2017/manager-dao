package com.chilema.manager.dao;

import com.chilema.manager.bean.ShopCert;
import com.chilema.manager.bean.ShopCertExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopCertMapper {
    long countByExample(ShopCertExample example);

    int deleteByExample(ShopCertExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopCert record);

    int insertSelective(ShopCert record);

    List<ShopCert> selectByExample(ShopCertExample example);

    ShopCert selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopCert record, @Param("example") ShopCertExample example);

    int updateByExample(@Param("record") ShopCert record, @Param("example") ShopCertExample example);

    int updateByPrimaryKeySelective(ShopCert record);

    int updateByPrimaryKey(ShopCert record);
}