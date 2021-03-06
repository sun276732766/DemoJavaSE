package cn.edu.tsinghua.training.javase.basic;

import java.io.*;

/**
 * Created at 221
 * 16-7-7 下午3:01.
 */
public class InputOutputTest {
    private static final String INPUT = "D:\\back_up\\software\\ideaIU-15.0.5.win.zip";
    private static final String OUTPUT = "D:\\idea-new.zip";

    public static void main(String[] args) {

//        BufferedReader
//        BufferedWriter
        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(INPUT));
             BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(OUTPUT))) {
            int i;
            long start = System.currentTimeMillis();
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
            System.out.println("total time: " + (System.currentTimeMillis() - start) / 1000);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// 464,646,959 字节
// total time: 1322 seconds vs 49 seconds