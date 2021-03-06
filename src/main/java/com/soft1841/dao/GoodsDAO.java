package com.soft1841.dao;

import com.soft1841.entity.Goods;

import java.sql.SQLException;
import java.util.List;

/**
 * 商品DAO
 * @author  王欢乐
 */
public interface GoodsDAO {
    /**
     * 获取所有商品
     *
     * @return
     */
    List<Goods> selectGoods() throws SQLException;

    /**
     * 新增商品
     *
     * @param goods
     */
    Long insertGoods(Goods goods) throws SQLException;

    /**
     * 根据id删除商品
     *
     * @param id
     */
    int deleteGoodsByID(long id) throws SQLException;

    /**
     * 根据id查询商品
     * @param id
     * @return
     */
    List<Goods> getGoodsById(long id) throws SQLException;

    /**
     * 修改商品信息
     * @param goods
     */

    int updateGoods(Goods goods) throws SQLException;

    /**
     * 根据商品类别查询商品
     * @param typeId
     * @return
     * @throws SQLException
     */
    List<Goods> getGoodsByTypeId(long typeId) throws SQLException;

    /**
     * 根据关键词模糊查询图书
     * @param keywords
     * @return
     * @throws SQLException
     */
    List<Goods> selectBooksLike(String keywords) throws SQLException;

    List<Goods> getGoodsByBarCode(String barCode) throws SQLException;


}
