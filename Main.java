package com.company;

import java.text.NumberFormat;
c
public class Main {

    public static void main(String[] args) {
	// write your code here
      /* NumberFormat currency = NumberFormat.getCurrencyInstance();
       String result = currency.format(1234567.891);
       System.out.println(result);*/

       String percent = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(percent);
    }
}
