package kotlinx.coroutines.p5579e;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.e.g */
/* compiled from: PG */
public final class C71725g {

    /* renamed from: a */
    private static final Method f191200a;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", new Class[]{Boolean.TYPE});
        } catch (Throwable unused) {
            method = null;
        }
        f191200a = method;
    }

    /* renamed from: a */
    public static final void m104879a(Executor executor) {
        Method method;
        C69664n.m101061g(executor, "executor");
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = f191200a) != null) {
                method.invoke(scheduledThreadPoolExecutor, new Object[]{true});
            }
        } catch (Throwable unused) {
        }
    }
}
