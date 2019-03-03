package vip.anjun.myshop.commons.mapper;

import vip.anjun.myshop.commons.domain.TbUser;
import vip.anjun.myshop.commons.utils.RedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import tk.mybatis.mapper.MyMapper;

@CacheNamespace(implementation = RedisCache.class)
public interface TbUserMapper extends MyMapper<TbUser> {
}