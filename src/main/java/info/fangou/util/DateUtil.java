package info.fangou.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Auther: try  <br/>
 * Description : 日期工具类  <br/>
 * ChangeLog : 1. 创建 (2021/12/31 23:05 [try]); <br/>
 */
public class DateUtil {

    private DateUtil(){}

    public static final String DEFAULT_DATE_FORMAT = "yyyy-mm-dd";

    public static final String DEFAULT_TIME_FORMAT = "hh:MM:ss";

    public interface DateFormat{



    }

    /**
     * Description : 日期对象序列化为字符串  <br/>
     * ChangeLog : 1. 创建 (2021/12/31 23:29 [try]);
     * @param sourceDate 日期对象
     * @param dateFormat  日期格式
     * @return java.lang.String 日期字符串
    */
    public static String dateToStr(Date sourceDate,String dateFormat){

        if (ValidateUtil.isEmpty(dateFormat)){
            dateFormat = DEFAULT_DATE_FORMAT;
        }

        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);

        return sdf.format(sourceDate);

    }

    public static Date strToDate(String sourceStr,String dateFormat) throws ParseException {
        if (ValidateUtil.isEmpty(dateFormat)){
            dateFormat = DEFAULT_DATE_FORMAT;
        }

        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);

        return sdf.parse(sourceStr);

    }

}
