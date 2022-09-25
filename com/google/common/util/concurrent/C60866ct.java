package com.google.common.util.concurrent;

import com.google.common.base.C58838bb;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.common.util.concurrent.ct */
/* compiled from: PG */
public final class C60866ct implements C60870cx {

    /* renamed from: a */
    public static final C60870cx f164955a = new C60866ct((Object) null);

    /* renamed from: c */
    private static final Logger f164956c = Logger.getLogger(C60866ct.class.getName());

    /* renamed from: b */
    public final Object f164957b;

    public C60866ct(Object obj) {
        this.f164957b = obj;
    }

    /* renamed from: b */
    public final void mo4106b(Runnable runnable, Executor executor) {
        C58838bb.m90866a(runnable, "Runnable was null.");
        C58838bb.m90866a(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f164956c;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final Object get() {
        return this.f164957b;
    }

    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f164957b;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f164957b + "]]";
    }
}
