//*****************************************************************************
//
// File Name       :  org.fangsj.learn.spring.boot.jta.config.DaoConfig
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

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jta.atomikos.AtomikosDataSourceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.alibaba.druid.pool.xa.DruidXADataSource;
import com.baomidou.mybatisplus.autoconfigure.MybatisPlusProperties;

/**
 * 说明
 *
 * @author fangshijie
 * @date 2019-05-23 08:46
 */
public class DaoConfig {
    public DaoConfig() {
        System.out.println("init DaoConfig");
    }

    @Bean("druidXADataSource1")
    public DruidXADataSource druidXADataSource1() {
        DruidXADataSource druidXADataSource = new DruidXADataSource();
        druidXADataSource.setUsername("root");
        druidXADataSource.setPassword("Admin123");
        druidXADataSource.setUrl("jdbc:mysql://192.168.2.253:3306/koss_dev?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull");
        druidXADataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return druidXADataSource;
    }

    @Bean("druidXADataSource2")
    public DruidXADataSource druidXADataSource2() {
        DruidXADataSource druidXADataSource = new DruidXADataSource();
        druidXADataSource.setUsername("root");
        druidXADataSource.setPassword("Admin123");
        druidXADataSource.setUrl("jdbc:mysql://192.168.2.253:3306/koss_2?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull");
        druidXADataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return druidXADataSource;
    }


    @Primary
    @Bean("db1")
    public AtomikosDataSourceBean atomikosDataSourceBean(@Qualifier("druidXADataSource1")DruidXADataSource druidXADataSource1) {
        AtomikosDataSourceBean atomikosDataSourceBean = new AtomikosDataSourceBean();
        atomikosDataSourceBean.setXaDataSource(druidXADataSource1);
        return atomikosDataSourceBean;
    }

    @Bean("db2")
    public AtomikosDataSourceBean atomikosDataSourceBean2(@Qualifier("druidXADataSource2") DruidXADataSource druidXADataSource2) {
        AtomikosDataSourceBean atomikosDataSourceBean = new AtomikosDataSourceBean();
        atomikosDataSourceBean.setXaDataSource(druidXADataSource2);
        return atomikosDataSourceBean;
    }
}
