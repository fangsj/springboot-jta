//*****************************************************************************
//
// File Name       :  org.fangsj.learn.spring.boot.jta.MyBatisConfig
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

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.baomidou.mybatisplus.autoconfigure.MybatisPlusProperties;
import com.baomidou.mybatisplus.core.config.GlobalConfig;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;

/**
 * 说明
 *
 * @author fangshijie
 * @date 2019-05-23 11:13
 */
public class MyBatisConfig {
    public MybatisSqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource, MybatisPlusProperties properties) {
        MybatisSqlSessionFactoryBean factory = new MybatisSqlSessionFactoryBean();
        factory.setDataSource(dataSource);
        if (properties.getConfigurationProperties() != null) {
            factory.setConfigurationProperties(properties.getConfigurationProperties());
        }
        //if (!ObjectUtils.isEmpty(this.interceptors)) {
        //    factory.setPlugins(this.interceptors);
        //}
        //if (this.databaseIdProvider != null) {
        //    factory.setDatabaseIdProvider(this.databaseIdProvider);
        //}
        if (StringUtils.hasLength(properties.getTypeAliasesPackage())) {
            factory.setTypeAliasesPackage(properties.getTypeAliasesPackage());
        }
        // TODO 自定义枚举包
        if (StringUtils.hasLength(properties.getTypeEnumsPackage())) {
            factory.setTypeEnumsPackage(properties.getTypeEnumsPackage());
        }
        if (properties.getTypeAliasesSuperType() != null) {
            factory.setTypeAliasesSuperType(properties.getTypeAliasesSuperType());
        }
        if (StringUtils.hasLength(properties.getTypeHandlersPackage())) {
            factory.setTypeHandlersPackage(properties.getTypeHandlersPackage());
        }
        if (!ObjectUtils.isEmpty(properties.resolveMapperLocations())) {
            factory.setMapperLocations(properties.resolveMapperLocations());
        }
        // TODO 此处必为非 NULL
        GlobalConfig globalConfig = properties.getGlobalConfig();
        ////注入填充器
        //if (this.applicationContext.getBeanNamesForType(MetaObjectHandler.class,
        //        false, false).length > 0) {
        //    MetaObjectHandler metaObjectHandler = this.applicationContext.getBean(MetaObjectHandler.class);
        //    globalConfig.setMetaObjectHandler(metaObjectHandler);
        //}
        ////注入主键生成器
        //if (this.applicationContext.getBeanNamesForType(IKeyGenerator.class, false,
        //        false).length > 0) {
        //    IKeyGenerator keyGenerator = this.applicationContext.getBean(IKeyGenerator.class);
        //    globalConfig.getDbConfig().setKeyGenerator(keyGenerator);
        //}
        ////注入sql注入器
        //if (this.applicationContext.getBeanNamesForType(ISqlInjector.class, false,
        //        false).length > 0) {
        //    ISqlInjector iSqlInjector = this.applicationContext.getBean(ISqlInjector.class);
        //    globalConfig.setSqlInjector(iSqlInjector);
        //}
        factory.setGlobalConfig(globalConfig);
        return factory;
    }
}
