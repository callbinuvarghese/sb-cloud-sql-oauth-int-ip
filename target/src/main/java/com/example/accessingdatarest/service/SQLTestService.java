package com.example.accessingdatarest.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.time.format.DateTimeFormatter;

@Service
public class SQLTestService {
    private final Logger log = LoggerFactory.getLogger(SQLTestService.class);

    @Autowired
    JdbcTemplate jdbcTemplate;

    @PostConstruct
    public void startupProc() {
        log.info("Creating tables");

        Integer intValue = jdbcTemplate.queryForObject("SELECT 1", Integer.class);
        log.info("Query to select 1: result:{}", intValue);

        java.time.LocalDateTime now = jdbcTemplate.queryForObject("SELECT NOW()", java.time.LocalDateTime.class);
        log.info("Query to select now; result:{}", now.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

    }

    public String getNow() {
        log.info("Service  SQLTestService: getNow");
        java.time.LocalDateTime now = jdbcTemplate.queryForObject("SELECT NOW()", java.time.LocalDateTime.class);
        String nowVal = now.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        log.info("Service  SQLTestService: getNow: {}", nowVal);
        return  nowVal;
    }

    public String getCurrentUser() {
        log.info("Service  SQLTestService: getCurrentUser");
        String currentUser = jdbcTemplate.queryForObject("SELECT current_user", String.class);
        log.info("Service  SQLTestService: getCurrentUser: {}", currentUser);
        return  currentUser;
    }
    public String getSessionUser() {
        log.info("Service  SQLTestService: getSessionUser");
        String sessionUser = jdbcTemplate.queryForObject("SELECT session_user", String.class);
        log.info("Service  SQLTestService: getSessionUser: {}", sessionUser);
        return  sessionUser;
    }
}
