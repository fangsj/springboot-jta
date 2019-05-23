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

import javax.transaction.Transactional;

import org.fangsj.learn.spring.boot.jta.dao.koss2.Example2Mapper;
import org.fangsj.learn.spring.boot.jta.dao.koss6.ExampleMapper;
import org.fangsj.learn.spring.boot.jta.domain.koss2.Example2;
import org.fangsj.learn.spring.boot.jta.domain.koss6.Example;
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
    @Autowired
    private Example2Mapper example2Mapper;

    @RequestMapping
    @ResponseBody
    @Transactional
    public Object index() {
        Example2 example2 = new Example2();
        example2.setTitle("方施杰");
        example2Mapper.insert(example2);
        Example example = new Example();
        example.setTitle("方施杰2");
        exampleMapper.insert(example);
        int a = 1 / 0;
        return null;
    }
}
