package com.xinwendewen.android.logger;

public interface Logger {
    void debug(String msg);

    void debug(String format, Object... args);

    void info(String msg);

    void warn(String msg);

    void warn(String msg, Throwable throwable);

    void error(String msg);

    void error(String msg, Throwable throwable);
}
