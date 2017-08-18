package com.chilema.manager.dao;

import com.chilema.manager.bean.ManagerToken;
import com.chilema.manager.bean.ManagerTokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManagerTokenMapper {
    long countByExample(ManagerTokenExample example);

    int deleteByExample(ManagerTokenExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ManagerToken record);

    int insertSelective(ManagerToken record);

    List<ManagerToken> selectByExample(ManagerTokenExample example);

    ManagerToken selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ManagerToken record, @Param("example") ManagerTokenExample example);

    int updateByExample(@Param("record") ManagerToken record, @Param("example") ManagerTokenExample example);

    int updateByPrimaryKeySelective(ManagerToken record);

    int updateByPrimaryKey(ManagerToken record);
}