package basics;

import java.sql.SQLOutput;

public class Main {
    static void copyArrayExample()
    {
        char[] copyFrom ={'a','b','c','d','e','f','g','h','i'};
        char[] copyTo= new char[7];
        System.arraycopy(copyFrom,2,copyTo,0,7);
        System.out.println(new String(copyTo));
    }
    public static void main(String[] args) {
        copyArrayExample();
        System.out.println("Hello world!");
    }
}