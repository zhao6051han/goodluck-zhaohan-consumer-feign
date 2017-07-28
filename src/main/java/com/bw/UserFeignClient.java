package com.bw;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Created by 赵翰 on 2017/7/28.
 */
@FeignClient(name = "eureka-client")
public interface UserFeignClient {
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public User get1(@RequestParam("id") Long id, @RequestParam("name") String name);

    @RequestMapping(value = "/post",method =RequestMethod.POST )
    public User post1(@RequestBody User user);

    @RequestMapping(value = "/getmap",method = RequestMethod.GET)
    public User getmap(@RequestParam Map<String,Object> map);
}
