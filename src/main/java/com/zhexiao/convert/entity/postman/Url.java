package com.zhexiao.convert.entity.postman;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @Auther: zhe.xiao
 * @Date: 2020/09/16
 * @Description
 */
@Data
@Accessors(chain = true)
public class Url {
    private String raw;

    private List<String> host;

    private List<String> path;

    private List<Parameter> query;
}
