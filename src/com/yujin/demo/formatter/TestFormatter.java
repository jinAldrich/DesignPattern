package com.yujin.demo.formatter;

import java.util.Calendar;
import java.util.Formatter;
import java.util.GregorianCalendar;

public class TestFormatter {

    public static void main(String[] args) {
      //%[argument_index$][flags][width][.precision]conversion 
        Formatter f1 = new Formatter(System.out); 
        //格式化输出字符串和数字 
        f1.format("格式化输出：%s %d", "a", 1235); 
        System.out.println("\n--------"); 
        //日期的格式化 
        Calendar c = new GregorianCalendar(); 
        f1.format("当前日期:%1$tY-%1$tm-%1$te", c); 
        System.out.println("\n--------"); 
        //日期的格式化，并将格式化结果存储到一个字符串变量中 
        String s = String.format("当前日期:%1$tY-%1$tm-%1$te", c); 
        System.out.println(s); 
        //2$：取第二个参数 
        //-: 指定为左对齐，默认右对齐 
        //5：最大输出宽度为20,不够会补空格，实际若超过则全部输出 
        //.2：在此表示输出参数2的最大字符数量，如果是浮点数字，则表示小数部分显示的位数 
        //s ：表示输入参数是字符串 
        f1.format("%2$-5.2s %1$2s", "123", "456"); 

        //将格式化的结果存储到字符串 
        System.out.println("\n--------"); 
        String fs = String.format("身高体重(%.2f , %d)", 173.2, 65); 
        System.out.println(fs); 

        //printf()本质上也是用System.out作为输出目标构造Formatter对象 
        //调用format方法，并将printf的参数传给format方法而得。 
        System.out.println("\n--------"); 
        System.out.printf("身高体重(%.2f , %d)", 180.2, 65); 
    }
}
