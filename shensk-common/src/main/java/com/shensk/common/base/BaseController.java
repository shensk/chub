package com.shensk.common.base;


import com.shensk.common.util.PropertiesFileUtil;

public abstract class BaseController {

//    private final static Logger _log = LoggerFactory.getLogger(BaseController.class);


    /**
     * 返回jsp视图
     * @param path
     * @return
     */
    public static String jsp(String path) {
        return path.concat(".jsp");
    }

    /**
     * 返回thymeleaf视图
     * @param path
     * @return
     */
    public static String thymeleaf(String path) {
        String folder = PropertiesFileUtil.getInstance().get("app.name");
        return "/".concat(folder).concat(path).concat(".html");
    }


}
