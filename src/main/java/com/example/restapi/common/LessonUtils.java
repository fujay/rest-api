package com.example.restapi.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LessonUtils {

    private final static Logger LOGGER = LoggerFactory.getLogger(LessonUtils.class);

    public static void logStart(String lesson) {
    LOGGER.info("\n" + "=".repeat(30) + "\n\tLesson {} active\n" + "=".repeat(30) + "\n", lesson);
    }
}
