package org.yhy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.yhy.model.TemplatePojo;
import org.yhy.persistence.Persistent;

/***
 * 消息模板类 ws 进行网页通知
 */

@RequestMapping("/messageTemplate")
@RestController
public class MsgTemplateController {

    @Autowired
    private Persistent persistent;

    @GetMapping("/head")
    public String test(){
        return "0k";
    }

    @PostMapping
    //http 请求方法为post，请求体文本格式为json string
    public String saveTemplate(@RequestBody TemplatePojo templatePojo){
        persistent.save(templatePojo);
        return HttpStatus.OK.getReasonPhrase();
    }

}
