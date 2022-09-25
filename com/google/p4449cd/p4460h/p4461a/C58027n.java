package com.google.p4449cd.p4460h.p4461a;

import com.google.p4449cd.p4453d.C57958d;
import com.google.p4449cd.p4454e.C57969i;

/* renamed from: com.google.cd.h.a.n */
/* compiled from: PG */
public final /* synthetic */ class C58027n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C57958d f155132a;

    /* renamed from: b */
    public final /* synthetic */ C57969i f155133b;

    /* renamed from: c */
    public final /* synthetic */ Runnable f155134c;

    public /* synthetic */ C58027n(C57958d dVar, C57969i iVar, Runnable runnable) {
        this.f155132a = dVar;
        this.f155133b = iVar;
        this.f155134c = runnable;
    }

    public final void run() {
        C57958d dVar = this.f155132a;
        C57969i iVar = this.f155133b;
        Runnable runnable = this.f155134c;
        C58021h.f155121a.set(dVar);
        iVar.mo54577g(dVar);
        try {
            runnable.run();
        } finally {
            iVar.mo54571a(dVar);
            C58021h.f155121a.set((Object) null);
        }
    }
}
