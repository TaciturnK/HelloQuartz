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
 * TODO ��������֮��ʱ����ÿ���������һ����Hello World Quartz!��
 * 2017��8��12�� ����5:02:42
 */
public class HelloSchedule {

	public static void main(String[] args) throws SchedulerException {

		// ����һ��JobDetailʵ����������ʵ����HelloJob Class��
		JobDetail jobDetail = JobBuilder.newJob(HelloJob.class).withIdentity("myJob", "group1").build();

		// ����һ��Triggerʵ���������Job����ִ�У�����ÿ���������ظ�ִ��һ�Σ�ֱ����Զ
		Trigger trigger = TriggerBuilder.newTrigger().withIdentity("myTrigger", "group1").startNow()
				.withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(2).repeatForever()).build();

		// ����Schedulerʵ��
		SchedulerFactory sfact = new StdSchedulerFactory();
		Scheduler scheduler = sfact.getScheduler();
		scheduler.start();
		System.out.println("������ʱ����ʱ�䣺" + DataUtils.getCurrentDate());
		scheduler.scheduleJob(jobDetail, trigger);

	}

}
