package com.google.android.apps.gsa.shared.p6968aa;

import com.google.common.util.concurrent.C60842bw;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.shared.aa.f */
/* compiled from: PG */
public final class C89050f extends C60842bw {
    public C89050f(C60870cx cxVar) {
        super(cxVar);
    }

    /* renamed from: e */
    private final Object m144834e(InterruptedException interruptedException) {
        cancel(true);
        if (!isCancelled()) {
            try {
                return super.get();
            } finally {
                Thread.currentThread().interrupt();
            }
        } else {
            throw interruptedException;
        }
    }

    public final Object get() {
        try {
            return super.get();
        } catch (InterruptedException e) {
            return m144834e(e);
        }
    }

    public final String toString() {
        String obj = this.f164926b.toString();
        return "CancelOnInterruptFuture[" + obj + "]";
    }

    public final Object get(long j, TimeUnit timeUnit) {
        try {
            return super.get(j, timeUnit);
        } catch (InterruptedException e) {
            return m144834e(e);
        }
    }
}
