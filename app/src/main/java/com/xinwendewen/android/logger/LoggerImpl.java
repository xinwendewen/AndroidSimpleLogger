package com.xinwendewen.android.logger;

import android.util.Log;

import java.util.Locale;

public class LoggerImpl implements Logger {
    private final String tag;
    private final String name;

    public LoggerImpl(String tag, String name) {
        this.tag = tag;
        this.name = name;
    }

    private String addNamePrefix(String msg) {
        return "[" + name + "] " + msg;
    }

    private String addThreadNamePrefix(String msg) {
        return "[" + Thread.currentThread().getName() + "] " + msg;
    }

    @Override
    public void debug(String msg) {
        if (BuildConfig.DEBUG) {
            Log.d(tag, addThreadNamePrefix(addNamePrefix(msg)));
        }
    }

    @Override
    public void debug(String format, Object... args) {
        if (BuildConfig.DEBUG) {
            Log.d(tag, addThreadNamePrefix(addNamePrefix(String.format(Locale.ROOT, format, args))));
        }
    }

    @Override
    public void info(String msg) {
        Log.i(tag, addNamePrefix(msg));
    }

    @Override
    public void warn(String msg) {
        Log.w(tag, addNamePrefix(msg));
    }

    @Override
    public void warn(String msg, Throwable throwable) {
        Log.w(tag, addNamePrefix(msg), throwable);
    }

    @Override
    public void error(String msg) {
        Log.e(tag, addNamePrefix(msg));
    }

    @Override
    public void error(String msg, Throwable throwable) {
        Log.e(tag, addNamePrefix(msg), throwable);
    }
}
