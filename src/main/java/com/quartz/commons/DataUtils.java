package com.quartz.commons;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtils {

	/**
	 * 功能：获取一个格式为：yyyy-MM-dd HH:mm:ss的当前日期字符串
	 * 
	 * @return
	 */
	public static String getCurrentDate() {
		Date date = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		return sf.format(date);
	}

}
