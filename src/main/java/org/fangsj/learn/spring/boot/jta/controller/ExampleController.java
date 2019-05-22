//*****************************************************************************
//
// File Name       :  org.fangsj.learn.spring.boot.jta.controller.ExampleController
// Created Date    :  2019-05-22
// Created By      :  fangshijie
// Last Changed By :  fangshijie
// Last Changed On :  2019-05-22
// Description     :  //TODO To fill in a brief description of the purpose of
//                    this class.
//
// Keisdom Pte Ltd.  Copyright (c) 2019.  All Rights Reserved.
//
//*****************************************************************************
package org.fangsj.learn.spring.boot.jta.controller;

import org.fangsj.learn.spring.boot.jta.dao.ExampleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 说明
 *
 * @author fangshijie
 * @date 2019-05-22 15:25
 */
@Controller
@RequestMapping("/")
public class ExampleController {
    @Autowired
    private ExampleMapper exampleMapper;

    @RequestMapping
    @ResponseBody
    public Object index() {
        return exampleMapper.selectList(null);
    }
}
