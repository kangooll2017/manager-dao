package com.chilema.manager.dao;

import com.chilema.manager.bean.OrderFood;
import com.chilema.manager.bean.OrderFoodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderFoodMapper {
    long countByExample(OrderFoodExample example);

    int deleteByExample(OrderFoodExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderFood record);

    int insertSelective(OrderFood record);

    List<OrderFood> selectByExample(OrderFoodExample example);

    OrderFood selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderFood record, @Param("example") OrderFoodExample example);

    int updateByExample(@Param("record") OrderFood record, @Param("example") OrderFoodExample example);

    int updateByPrimaryKeySelective(OrderFood record);

    int updateByPrimaryKey(OrderFood record);
}