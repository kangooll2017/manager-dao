package com.chilema.manager.dao;

import com.chilema.manager.bean.Complain;
import com.chilema.manager.bean.ComplainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComplainMapper {
    long countByExample(ComplainExample example);

    int deleteByExample(ComplainExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Complain record);

    int insertSelective(Complain record);

    List<Complain> selectByExample(ComplainExample example);

    Complain selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Complain record, @Param("example") ComplainExample example);

    int updateByExample(@Param("record") Complain record, @Param("example") ComplainExample example);

    int updateByPrimaryKeySelective(Complain record);

    int updateByPrimaryKey(Complain record);
}