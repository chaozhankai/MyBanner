import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyBanner {
    public static void main(String[] args) {
        String MYBANNER = "xiaozhankai.txt";
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
















