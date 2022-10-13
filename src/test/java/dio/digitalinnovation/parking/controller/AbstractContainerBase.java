package dio.digitalinnovation.parking.controller;

import org.testcontainers.containers.PostgreSQLContainer;

public abstract class AbstractContainerBase {
    static final PostgreSQLContainer POSTGRE_SQL_CONTAINER;
    static  {
       POSTGRE_SQL_CONTAINER = new PostgreSQLContainer("postgres:10-alpine");
       POSTGRE_SQL_CONTAINER.start();
        System.setProperty("spring.datasoucer.url",POSTGRE_SQL_CONTAINER.getJdbcUrl());
        System.setProperty("spring.datasoucer.username",POSTGRE_SQL_CONTAINER.getUsername());
        System.setProperty("spring.datasoucer.password",POSTGRE_SQL_CONTAINER.getPassword());
    }
}
