package com.google.common.util.concurrent;

import java.util.concurrent.TimeoutException;

/* renamed from: com.google.common.util.concurrent.dx */
/* compiled from: PG */
final class C60910dx extends TimeoutException {
    public C60910dx(String str) {
        super(str);
    }

    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
