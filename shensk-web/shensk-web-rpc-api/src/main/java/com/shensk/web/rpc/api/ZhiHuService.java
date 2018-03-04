package com.shensk.web.rpc.api;

import com.shensk.web.dao.model.ZhiHu;

/**
 * Service Interface
 *
 * @author shenshaokuai
 * @date 2018/3/4
 */
public interface ZhiHuService {

    /**
     * 通过zid获取详情
     *
     * @param zid zid
     * @return ZhiHu
     */
    ZhiHu getDetailByZid(Integer zid);
}
