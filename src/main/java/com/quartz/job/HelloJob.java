package com.quartz.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.quartz.commons.DataUtils;

public class HelloJob implements Job {

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		// ��ӡ��ǰʱ��
		System.out.println("��ʱ����ִ��ʱ�䣺" + DataUtils.getCurrentDate());

		// ��д�����ҵ����
		System.out.println("Hello World Quartz!");

	}

}
