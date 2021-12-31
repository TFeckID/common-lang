package info.fangou.util;

import java.sql.SQLOutput;
import java.util.Collection;
import java.util.Map;

/**
 * Auther: try  <br/>
 * Description : 通用校验类  <br/>
 * ChangeLog : 1. 创建 (2021/12/31 22:44 [try]); <br/>
 */
public class ValidateUtil {

    private ValidateUtil(){}

    /**
     * Description : 判断对象是否为空，可支持字符串及集合类，数组。不能判断字符串全为空格的情况  <br/>
     * ChangeLog : 1. 创建 (2021/12/31 22:51 [try]);
     * @param source
     * @return boolean
    */
    public static boolean isNotEmpty(Object source){

        if (source == null){
            return false;
        }else if (source instanceof CharSequence){
            return ((CharSequence)source).length() != 0;
        }else if (source instanceof Object[]){
            return ((Object[])source).length != 0;
        }else if (source instanceof Collection){
            return ((Collection)source).size() != 0;
        }else if (source instanceof Map){
            return ((Map)source).size() != 0;
        }else {
            return true;
        }
    }

    

}
