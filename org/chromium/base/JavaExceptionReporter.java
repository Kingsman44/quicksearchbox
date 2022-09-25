package org.chromium.base;

import java.lang.Thread;
import p000J.C0000N;

/* compiled from: PG */
public class JavaExceptionReporter implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final Thread.UncaughtExceptionHandler f192494a;

    /* renamed from: b */
    private final boolean f192495b;

    /* renamed from: c */
    private boolean f192496c;

    private JavaExceptionReporter(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, boolean z) {
        this.f192494a = uncaughtExceptionHandler;
        this.f192495b = z;
    }

    private static void installHandler(boolean z) {
        Thread.setDefaultUncaughtExceptionHandler(new JavaExceptionReporter(Thread.getDefaultUncaughtExceptionHandler(), z));
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        if (!this.f192496c) {
            this.f192496c = true;
            C0000N.MLlibBXh(this.f192495b, th);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f192494a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
