import java.text.SimpleDateFormat;
import java.util.Date;

public class wi {
    /**
     * 将多个字符串拼接成一个字符串，使用指定的分隔符
     *
     * @param separator 分隔符
     * @param strings   要拼接的字符串
     * @return 拼接后的字符串
     */
    public static String join(String separator, String... strings) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            result.append(strings[i]);
            if (i < strings.length - 1) {
                result.append(separator);
            }
        }
        return result.toString();
    }

    /**
     * 格式化日期为指定格式的字符串
     *
     * @param date   要格式化的日期
     * @param format 格式化字符串，例如 "yyyy-MM-dd HH:mm:ss"
     * @return 格式化后的日期字符串
     */
    public static String formatDate(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

    /**
     * 获取当前系统时间的字符串表示
     *
     * @return 当前系统时间的字符串表示
     */
    public static String getCurrentTime() {
        Date now = new Date();
        return formatDate(now, "yyyy-MM-dd HH:mm:ss");
    }
}
