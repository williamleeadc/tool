import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // 使用 join 方法
        String result = wi.join(", ", "apple", "orange", "banana");
        System.out.println("Join result: " + result);

        // 使用 formatDate 方法
        Date today = new Date();
        String formattedDate = wi.formatDate(today, "yyyy-MM-dd");
        System.out.println("Formatted date: " + formattedDate);

        // 使用 getCurrentTime 方法
        String currentTime = wi.getCurrentTime();
        System.out.println("Current time: " + currentTime);
    }
}