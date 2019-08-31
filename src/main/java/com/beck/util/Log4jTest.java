package com.beck.util;

import org.apache.log4j.Logger;

public class Log4jTest {
    static Logger logger = Logger.getLogger(Log4jTest.class);

    public static void main(String[] args) {
        logger.info("this is info...");
        logger.warn("this is waning...");
        logger.error("this is error...");
    }

}
