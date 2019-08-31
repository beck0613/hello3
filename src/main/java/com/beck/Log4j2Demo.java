package com.beck;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2Demo {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
        logger.debug("this is a debug");
        logger.warn("this is a warn");
        logger.info("this is a info");
        logger.error("this is error");
    }
}
