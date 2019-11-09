package bupt.service;

import bupt.pojo.IndexData;
import cn.hutool.core.collection.CollUtil;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@CacheConfig(cacheNames = "index_datas")
public class IndexDataService {
    @Cacheable(key = "'indexData-code-'+#p0")
    public List<IndexData> get(String code){
        return CollUtil.toList();
    }
}
