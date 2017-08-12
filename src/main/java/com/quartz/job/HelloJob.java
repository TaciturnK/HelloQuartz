package com.quartz.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.quartz.commons.DataUtils;

public class HelloJob implements Job {

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		// 打印当前时间
		System.out.println("定时任务执行时间：" + DataUtils.getCurrentDate());

		// 编写具体的业务类
		System.out.println("Hello World Quartz!");

	}

}
