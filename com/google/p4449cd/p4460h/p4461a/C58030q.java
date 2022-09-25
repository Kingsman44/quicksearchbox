package com.google.p4449cd.p4460h.p4461a;

import com.google.p4449cd.p4453d.C57958d;
import com.google.p4449cd.p4453d.C57960f;

/* renamed from: com.google.cd.h.a.q */
/* compiled from: PG */
final class C58030q implements Runnable {

    /* renamed from: a */
    private final C57958d f155141a;

    /* renamed from: b */
    private final Runnable f155142b;

    /* renamed from: c */
    private final C57960f f155143c;

    public C58030q(C57958d dVar, Runnable runnable, C57960f fVar) {
        this.f155141a = dVar;
        this.f155142b = runnable;
        this.f155143c = fVar;
    }

    public final void run() {
        try {
            C58021h.f155121a.set(this.f155141a);
            this.f155142b.run();
        } finally {
            this.f155143c.mo54568c(this);
            C58021h.f155121a.set((Object) null);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f155142b);
        return "ProducerTask{" + valueOf + "}";
    }
}
