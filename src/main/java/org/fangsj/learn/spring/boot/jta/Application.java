//*****************************************************************************
//
// File Name       :  org.fangsj.learn.spring.boot.jta
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
package org.fangsj.learn.spring.boot.jta;

import org.fangsj.learn.spring.boot.jta.config.DaoConfig;
import org.fangsj.learn.spring.boot.jta.config.MyBatis1Config;
import org.fangsj.learn.spring.boot.jta.config.MyBatis2Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * 说明
 *
 * @author fangshijie
 * @date 2019-05-22 14:52
 */
@SpringBootApplication
@Import({
        DaoConfig.class,
        MyBatis1Config.class,
        MyBatis2Config.class
})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
