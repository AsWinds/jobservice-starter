package com.codi.yourpackage.jobservice.job;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * 简单JOB类
 *
 * @author shi.pengyan
 * @date 2017-1-4 17:36:09
 */
@DisallowConcurrentExecution
public class SimpleJob extends QuartzJobBean {

    private static final Logger logger = LoggerFactory.getLogger(SimpleJob.class);

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {

        // JOB中不能使用注入@AutoWire

        // RedisTemplate<String, String> redisTemplate =
        // SpringContextHolder.getBean("redisTemplate");
        // StaticSH300Service staticSH300Service =
        // SpringContextHolder.getBean("staticSH300Service");

        logger.debug("==========================");
        logger.debug("|                        |");
        logger.debug("|   This is simple job.  |");
        logger.debug("|                        |");
        logger.debug("==========================");
    }

}
