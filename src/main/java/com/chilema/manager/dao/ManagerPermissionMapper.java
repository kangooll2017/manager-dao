package com.chilema.manager.dao;

import com.chilema.manager.bean.ManagerPermission;
import com.chilema.manager.bean.ManagerPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManagerPermissionMapper {
    long countByExample(ManagerPermissionExample example);

    int deleteByExample(ManagerPermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ManagerPermission record);

    int insertSelective(ManagerPermission record);

    List<ManagerPermission> selectByExample(ManagerPermissionExample example);

    ManagerPermission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ManagerPermission record, @Param("example") ManagerPermissionExample example);

    int updateByExample(@Param("record") ManagerPermission record, @Param("example") ManagerPermissionExample example);

    int updateByPrimaryKeySelective(ManagerPermission record);

    int updateByPrimaryKey(ManagerPermission record);
    
    int assignPermission(@Param("mid")Integer mid,@Param("strings")String[] strings);
}