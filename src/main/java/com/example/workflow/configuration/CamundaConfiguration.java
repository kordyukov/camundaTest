//package com.example.workflow.configuration;
//
//import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.PlatformTransactionManager;
//
//import javax.sql.DataSource;
//import java.sql.SQLException;
//
//@Configuration
//@EnableProcessApplication
//@ConditionalOnProperty("camunda.bpm.enabled")
//public class CamundaConfiguration {
//
//    private static final String CAMUNDA_BPM_DATA_SOURCE_NAME = "camundaBpmDataSource";
//    private static final String CAMUNDA_BPM_TRANSACTION_MANAGER_NAME = "camundaBpmTransactionManager";
//
//    @Bean(name = CAMUNDA_BPM_DATA_SOURCE_NAME)
//    @ConfigurationProperties(prefix = "camunda.datasource")
//    public DataSource camundaBpmDataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean(name = CAMUNDA_BPM_TRANSACTION_MANAGER_NAME)
//    public PlatformTransactionManager camundaBpmTransactionManager(@Qualifier(CAMUNDA_BPM_DATA_SOURCE_NAME) DataSource dataSource) throws SQLException {
//
//        // FIXME Говна кусок.
//        // Проводим тут создание схемы postgres, т.к. стандартные средства spring(DataSourceInitializizer)
//        // начинают работать после попытки camunda создать схему данных.
//        try (var statement = dataSource.getConnection().prepareStatement("CREATE SCHEMA IF NOT EXISTS camunda;")) {
//            statement.execute();
//        }
//
//        return new DataSourceTransactionManager(dataSource);
//    }
//}
