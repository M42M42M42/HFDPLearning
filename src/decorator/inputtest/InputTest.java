package decorator.inputtest;

import java.io.*;

/**
 * Author: XLee
 * Date: 2021/8/14 19:50
 * Description:
 */
public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("src/decorator/inputtest/test.txt")));

            while((c = in.read()) >= 0) {
                System.out.print((char)c);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
