package com.bw;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by 赵翰 on 2017/7/28.
 */
@FeignClient(name="eureka-client")
public interface DcClient {
    @GetMapping("/dc")
    String consumer();
}
