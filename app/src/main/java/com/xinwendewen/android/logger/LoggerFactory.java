package com.xinwendewen.android.logger;

public class LoggerFactory {
    private final String tag;

    public LoggerFactory(String tag) {
        this.tag = tag;
    }

    Logger createLogger(String name) {
        return new LoggerImpl(tag, name);
    }
}
