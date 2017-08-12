package com.quartz.commons;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtils {

	/**
	 * ���ܣ���ȡһ����ʽΪ��yyyy-MM-dd HH:mm:ss�ĵ�ǰ�����ַ���
	 * 
	 * @return
	 */
	public static String getCurrentDate() {
		Date date = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		return sf.format(date);
	}

}
