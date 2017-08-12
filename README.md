# HelloQuartz
开源任务调度框架Quartz的学习记录

# 概要
1. OpenSymphony提供的强大的开源任务调度框架

# 简介
1. 强大的调度功能；
2. 灵活的应用方式；
3. 分布式和集群能力；

# Quartz的使用模式
1. Builder模式；
2. Factory模式；
3. 组件模式；
4. 链式写法；

# Quartz的核心概念
1. 调度器(scheduler)
2. 任务(JobDetail)
3. 触发器（trigger）--> SimpleTrigger ;  CronTrigger

# Quartz的重要组成
1. Job
2. JobDetail
3. JobBuilder（用于创建JobDetail实例）
4. JobStore
5. Trigger
6. TriggerBuilder
7. ThreadPool
8. Scheduler
9. Calendar（一个Trigger可以和多个Calendar关联，以排除或包含某些时间点）
10. 监听器（JobListener,TriggerListener,SchedulerListener）	



	

