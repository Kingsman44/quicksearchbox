package com.google.android.libraries.p10923ac.p10971e.p10972a;

import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.ac.e.a.b */
/* compiled from: PG */
final class C147332b implements Runnable {

    /* renamed from: a */
    final Runnable f397718a;

    /* renamed from: b */
    C147332b f397719b;

    /* renamed from: c */
    final /* synthetic */ C147333c f397720c;

    public C147332b(C147333c cVar, Runnable runnable) {
        this.f397720c = cVar;
        this.f397718a = runnable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo124100a() {
        synchronized (this.f397720c.f397721a) {
            C147332b bVar = this.f397719b;
            if (bVar == null) {
                C58838bb.m90883r(this.f397720c.f397723c == this);
                this.f397720c.f397723c = null;
                return;
            }
            this.f397720c.f397722b.execute(bVar);
        }
    }

    public final void run() {
        try {
            this.f397718a.run();
        } finally {
            mo124100a();
        }
    }
}
