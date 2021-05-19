package com.ck.configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Decription:
 *
 * @author hzk
 * @Date 2021/4/27 16:22
 */
@Configuration
@EnableTransactionManagement
public class TransactionConfiguration {

    @Autowired
    private ComboPooledDataSource c3p0;

    @Bean
    public DataSourceTransactionManager transactionManager(){
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(c3p0);
        return transactionManager;
    }
}
