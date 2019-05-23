//*****************************************************************************
//
// File Name       :  org.fangsj.learn.spring.boot.jta.config.MyBatis1Config
// Created Date    :  2019-05-23
// Created By      :  fangshijie
// Last Changed By :  fangshijie
// Last Changed On :  2019-05-23
// Description     :  //TODO To fill in a brief description of the purpose of
//                    this class.
//
// Keisdom Pte Ltd.  Copyright (c) 2019.  All Rights Reserved.
//
//*****************************************************************************
package org.fangsj.learn.spring.boot.jta.config;

import javax.sql.DataSource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.baomidou.mybatisplus.autoconfigure.MybatisPlusProperties;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;

/**
 * 说明
 *
 * @author fangshijie
 * @date 2019-05-23 09:20
 */
@MapperScan(value = "org.fangsj.learn.spring.boot.jta.dao.koss6", sqlSessionFactoryRef = "ssfr1")
public class MyBatis1Config extends MyBatisConfig {


    @Primary
    @Bean("ssfr1")
    public MybatisSqlSessionFactoryBean sqlSessionFactory(@Qualifier("db1") DataSource dataSource, MybatisPlusProperties properties) {
       return super.sqlSessionFactoryBean(dataSource, properties);
    }
}
