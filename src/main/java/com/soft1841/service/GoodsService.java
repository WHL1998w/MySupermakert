package com.soft1841.service;

import com.soft1841.entity.Goods;

import java.util.List;

public interface GoodsService {
    /**获取所有商品
     *
     * @return
     */

    List<Goods> getAllGoods();

    /**新增商品
     *
     * @param goods
     * @return
     */
    Long addGoods(Goods goods);

    /**根据id删除商品
     *
     * @param id
     */
    void deleteGoodsByID(long id);

    /**根据id查询商品
     *
     * @param id
     * @return
     */
    List<Goods> getGoodsById(long id);

    /**修改商品
     *
      * @param goods
     */
    void updateGoods(Goods goods);

    /**根据商品名模糊查询
     *
     * @param keywords
     * @return
     */
    List<Goods> getGoodsLike(String keywords);

    /**根据商品类别查询商品
     *
     * @param typeId
     * @return
     */
    List<Goods> getGoodsByTypeId(long typeId);

    /**根据条码查询商品
     *
     * @param barCode
     * @return
     */
    List<Goods> getGoodsByBarCode(String barCode);
}
