import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyBanner {
    private static String MYBANNER;
    public static void main(String[] args) {
        MYBANNER = "xiaozhankai.txt";
        // 防止文件建立或读取失败，用catch捕捉错误并打印
        // 带资源的try语句（try-with-resource）,自带关闭文件
        try(FileReader reader = new FileReader(MYBANNER);
            BufferedReader br = new BufferedReader(reader)) {
            String line;
            while ((line=br.readLine())!=null){
                Replace replace = new Replace();
                System.out.println(replace.replace(line));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
















