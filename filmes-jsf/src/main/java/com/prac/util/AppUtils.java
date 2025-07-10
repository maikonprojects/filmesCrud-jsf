package com.prac.util;

import java.util.Random;

public class AppUtils {

	public static int getRandomNumber(int min, int max) {
		Random rand = new Random();
		return (min + rand.nextInt((max - min) + 1));
	}
}
