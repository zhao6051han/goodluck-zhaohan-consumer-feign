package com.bw;

import org.springframework.stereotype.Component;

/**
 * Created by 赵翰 on 2017/7/28.
 */
@Component
public class User {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
