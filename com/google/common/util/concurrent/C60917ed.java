package com.google.common.util.concurrent;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.common.util.concurrent.ed */
/* compiled from: PG */
public final class C60917ed {
    /* renamed from: a */
    public static Object m93034a(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* renamed from: b */
    public static Object m93035b(Future future, long j, TimeUnit timeUnit) {
        long nanos;
        Object obj;
        boolean z = false;
        try {
            nanos = timeUnit.toNanos(j);
            while (true) {
                obj = future.get(nanos, TimeUnit.NANOSECONDS);
                break;
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return obj;
        } catch (InterruptedException unused) {
            z = true;
            nanos = (System.nanoTime() + nanos) - System.nanoTime();
        } catch (Throwable th) {
            if (z) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }
}
