package org.yhy.controller;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/* http 各方法请求响应示例
 * TODO REST HTTP METHOD 请求类型
 * @see org.springframework.http.HttpMethod
 */
@RestController
@RequestMapping("/httpMethods")
public class HttpMethodDemoController {

    @RequestMapping("/get")
    public String getMethod(@RequestHeader(name = "Host")String method){
        return method;
    }

}
