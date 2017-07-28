package com.bw;

import com.google.common.collect.Maps;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * Created by 赵翰 on 2017/7/28.
 */
@RestController
public class DcController {
    @Autowired
    private DcClient dcClient;
    @Autowired
    private UserFeignClient userFeignClient;


    @GetMapping("/consumer")
    public String dc() {
        return dcClient.consumer();
    }

    @GetMapping("/getuser")
    @ResponseBody
    public User getUser(Long id, String name){
        return userFeignClient.get1(id,name);
    }

    @GetMapping("/getMap")
    @ResponseBody
    public User getMap(){
        HashMap<String, Object> map = Maps.newHashMap();
        map.put("id", "1");
        map.put("username", "张三");
        return userFeignClient.getmap(map);
    }


    @GetMapping("/postUser")
    @ResponseBody
    public User postUser(@RequestParam User user){
        User user1 = userFeignClient.post1(user);
        return user1;
    }

}
