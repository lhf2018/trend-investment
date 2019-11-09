package bupt.job;

import bupt.pojo.Index;
import bupt.service.IndexDataService;
import bupt.service.IndexService;
import cn.hutool.core.date.DateUtil;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

import java.util.List;

public class IndexDataSyncJob extends QuartzJobBean {
    @Autowired
    private IndexService indexService;
    @Autowired
    private IndexDataService indexDataService;
    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        System.out.println("定时启动：" + DateUtil.now());
        List<Index> indexes=indexService.fresh();
        for(Index index:indexes){
            indexDataService.fresh(index.getCode());
        }
    }
}
