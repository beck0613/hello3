package com.beck.log4j;

import org.apache.log4j.Logger;

public class Log4jTest1 {
    static Logger logger = Logger.getLogger(Log4jTest1.class);

    public static void main(String[] args) {
        logger.info("this is a info");
        logger.warn("this is a warning!");
    }
}
