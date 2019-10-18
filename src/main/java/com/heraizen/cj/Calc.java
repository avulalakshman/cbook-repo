package com.heraizen.cj;

import java.util.Arrays;

public class Calc{
   
		public int add(int a, int b) {
			return a + b;
		}
		public int sum(Integer arr[]) {
			// This working much fater than normal looping
			return Arrays.asList(arr).stream().reduce(0,Integer::sum);
		}
}
