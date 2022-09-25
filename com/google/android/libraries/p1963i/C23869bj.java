package com.google.android.libraries.p1963i;

import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60873d;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.i.bj */
/* compiled from: PG */
final class C23869bj extends C60873d implements Runnable, C60872cz {

    /* renamed from: a */
    final /* synthetic */ C23870bk f65320a;

    /* renamed from: b */
    private Callable f65321b;

    /* renamed from: c */
    private final long f65322c;

    public C23869bj(C23870bk bkVar, Callable callable, long j) {
        this.f65320a = bkVar;
        this.f65321b = callable;
        this.f65322c = j;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return C23870bk.m44423h(this, (Delayed) obj);
    }

    public final long getDelay(TimeUnit timeUnit) {
        return Math.max(0, TimeUnit.MILLISECONDS.convert(this.f65322c - this.f65320a.f65324a.mo26871c(), timeUnit));
    }

    public final void run() {
        if (!isDone()) {
            try {
                Callable callable = this.f65321b;
                this.f65321b = null;
                mo57356n(callable.call());
            } catch (Throwable th) {
                mo57357o(th);
                throw new RuntimeException(th);
            }
        }
    }
}
