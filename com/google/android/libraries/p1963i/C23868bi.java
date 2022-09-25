package com.google.android.libraries.p1963i;

import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60873d;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.libraries.i.bi */
/* compiled from: PG */
final class C23868bi extends C60873d implements Runnable, C60872cz {

    /* renamed from: a */
    final long f65314a;

    /* renamed from: b */
    final long f65315b;

    /* renamed from: c */
    final boolean f65316c;

    /* renamed from: d */
    final AtomicLong f65317d = new AtomicLong(0);

    /* renamed from: e */
    Runnable f65318e;

    /* renamed from: f */
    final /* synthetic */ C23870bk f65319f;

    public C23868bi(C23870bk bkVar, Runnable runnable, long j, long j2, boolean z) {
        this.f65319f = bkVar;
        this.f65318e = runnable;
        this.f65314a = j;
        this.f65315b = j2;
        this.f65316c = z;
    }

    /* renamed from: e */
    private final long m44422e() {
        return Math.max(0, ((this.f65317d.get() * this.f65315b) + this.f65314a) - this.f65319f.f65324a.mo26871c());
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return C23870bk.m44423h(this, (Delayed) obj);
    }

    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(m44422e(), TimeUnit.MILLISECONDS);
    }

    public final void run() {
        if (!isDone()) {
            this.f65317d.incrementAndGet();
            try {
                this.f65318e.run();
                if (this.f65316c) {
                    this.f65319f.f65325b.postDelayed(this, m44422e());
                } else {
                    this.f65319f.f65325b.postDelayed(this, this.f65315b);
                }
            } catch (Throwable th) {
                this.f65318e = null;
                mo57357o(th);
            }
        }
    }
}
