package com.quartz.job;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

import com.quartz.commons.DataUtils;

/**
 * 
 * @author Taowd
 * TODO 程序启动之后定时任务，每隔两秒输出一个“Hello World Quartz!”
 * 2017年8月12日 下午5:02:42
 */
public class HelloSchedule {

	public static void main(String[] args) throws SchedulerException {

		// 创建一个JobDetail实例，并将该实例与HelloJob Class绑定
		JobDetail jobDetail = JobBuilder.newJob(HelloJob.class).withIdentity("myJob", "group1").build();

		// 创建一个Trigger实例，定义该Job立即执行，并且每隔两秒钟重复执行一次，直到永远
		Trigger trigger = TriggerBuilder.newTrigger().withIdentity("myTrigger", "group1").startNow()
				.withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(2).repeatForever()).build();

		// 创建Scheduler实例
		SchedulerFactory sfact = new StdSchedulerFactory();
		Scheduler scheduler = sfact.getScheduler();
		scheduler.start();
		System.out.println("启动定时任务时间：" + DataUtils.getCurrentDate());
		scheduler.scheduleJob(jobDetail, trigger);

	}

}
