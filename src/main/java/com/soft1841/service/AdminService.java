package com.soft1841.service;

/**收银员业务逻辑接口
 *
 */
public interface AdminService {
    /**登录功能
     *
     * @param number
     * @param password
     * @return
     */

    boolean login(String number,String password);

}
