package com.google.p4449cd.p4460h.p4461a;

import com.google.p4449cd.p4453d.C57955a;
import com.google.p4449cd.p4453d.C57960f;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.cd.h.a.f */
/* compiled from: PG */
final class C58019f implements Runnable, C57955a {

    /* renamed from: a */
    private final AtomicBoolean f155113a = new AtomicBoolean(true);

    /* renamed from: b */
    private final Runnable f155114b;

    /* renamed from: c */
    private final C57960f f155115c;

    public C58019f(Runnable runnable, C57960f fVar) {
        this.f155114b = runnable;
        this.f155115c = fVar;
    }

    /* renamed from: a */
    public final void mo54562a() {
        if (this.f155113a.compareAndSet(true, false)) {
            this.f155115c.mo54568c(this);
        }
    }

    public final void run() {
        if (this.f155113a.compareAndSet(true, false)) {
            try {
                this.f155114b.run();
            } finally {
                this.f155115c.mo54568c(this);
            }
        }
    }
}
