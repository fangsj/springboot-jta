//*****************************************************************************
//
// File Name       :  org.fangsj.learn.spring.boot.jta.config.MyBatis1Config
// Created Date    :  2019-05-23
// Created By      :  fangshijie
// Last Changed By :  fangshijie
// Last Changed On :  2019-05-23
// Description     :  MyBatis2Config
//
// Keisdom Pte Ltd.  Copyright (c) 2019.  All Rights Reserved.
//
//*****************************************************************************
package org.fangsj.learn.spring.boot.jta.config;

import javax.sql.DataSource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

import com.baomidou.mybatisplus.autoconfigure.MybatisPlusProperties;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;

/**
 * 说明
 *
 * @author fangshijie
 * @date 2019-05-23 09:20
 */
@MapperScan(value = "org.fangsj.learn.spring.boot.jta.dao.koss2", sqlSessionFactoryRef = "ssfr2")
public class MyBatis2Config extends MyBatisConfig{
    @Bean("ssfr2")
     public MybatisSqlSessionFactoryBean sqlSessionFactory(
            @Qualifier("db2") DataSource dataSource,
            MybatisPlusProperties properties)
    {
        return super.sqlSessionFactoryBean(dataSource, properties);
    }
}
