package com.example.compactnumberformattingsupport;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormattingSupport {
	public static void main(String[] args) {
		
		// SHORT format style
		NumberFormat fmt = NumberFormat.getCompactNumberInstance(Locale.ENGLISH, NumberFormat.Style.SHORT);
		System.out.println(fmt.format(1000));
		System.out.println(fmt.format(100000));
		System.out.println(fmt.format(1000000));
		System.out.println(fmt.format(10000000));
		System.out.println(fmt.format(100000000));
		System.out.println(fmt.format(1000000000));
		
		
		// LONG format style
		fmt = NumberFormat.getCompactNumberInstance(Locale.ENGLISH, NumberFormat.Style.LONG);
		System.out.println(fmt.format(1000));
		System.out.println(fmt.format(100000));
		System.out.println(fmt.format(1000000));
		System.out.println(fmt.format(10000000));
		System.out.println(fmt.format(100000000));
		System.out.println(fmt.format(1000000000));
	}
}
