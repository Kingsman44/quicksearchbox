package com.google.p4449cd.p4462i;

import com.google.p4449cd.p4453d.C57958d;
import com.google.p4449cd.p4460h.p4461a.C58021h;

/* renamed from: com.google.cd.i.c */
/* compiled from: PG */
final class C58044c implements Runnable {

    /* renamed from: a */
    private final C57958d f155178a;

    /* renamed from: b */
    private final Runnable f155179b;

    public C58044c(C57958d dVar, Runnable runnable) {
        this.f155178a = dVar;
        this.f155179b = runnable;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        try {
            C58021h.f155121a.set(this.f155178a);
            this.f155179b.run();
            C58021h.f155121a.set((Object) null);
        } catch (Throwable th) {
            C58021h.f155121a.set((Object) null);
            throw th;
        }
    }
}
