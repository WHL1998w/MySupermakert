package com.soft1841.dao;


import com.soft1841.entity.Type;

import java.sql.SQLException;
import java.util.List;

public interface TypeDAO {

    /**
     * 新增类别, 返回自增主键(Long)
     * @param type
     * @return
     */
    Long insertType(Type type) throws SQLException;

    /**
     * 根据id删除类别
     * @param id
     * @return
     */
    int deleteTypeById(long id) throws SQLException;

    /**
     * 查询所有类别
     * @return
     */
    List<Type> selectAllTypes() throws SQLException;

    /**
     * 根据名称查询类别信息
     * @param id
     * @return
     */
    Type getTypeById(long id) throws SQLException;
}

