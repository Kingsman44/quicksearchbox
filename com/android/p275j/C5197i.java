package com.android.p275j;

import com.google.android.libraries.places.api.p2426a.p2427a.p2430c.C31824b;
import com.google.android.libraries.places.api.p2426a.p2427a.p2430c.C31827e;

/* renamed from: com.android.j.i */
/* compiled from: PG */
final class C5197i implements Runnable {

    /* renamed from: a */
    private final C5206r f16494a;

    /* renamed from: b */
    private final C5210v f16495b;

    /* renamed from: c */
    private final Runnable f16496c;

    public C5197i(C5206r rVar, C5210v vVar, Runnable runnable) {
        this.f16494a = rVar;
        this.f16495b = vVar;
        this.f16496c = runnable;
    }

    public final void run() {
        C31824b bVar;
        if (this.f16494a.mo10298h()) {
            this.f16494a.mo10295e("canceled-at-delivery");
            return;
        }
        if (this.f16495b.mo10305a()) {
            this.f16494a.mo10268d(this.f16495b.f16537a);
        } else {
            C5206r rVar = this.f16494a;
            C5213y yVar = this.f16495b.f16539c;
            synchronized (rVar.f16516d) {
                bVar = rVar.f16523k;
            }
            if (bVar != null) {
                C31827e.m59188c(bVar.f85438a, yVar);
            }
        }
        if (this.f16495b.f16540d) {
            this.f16494a.mo10293c("intermediate-response");
        } else {
            this.f16494a.mo10295e("done");
        }
        Runnable runnable = this.f16496c;
        if (runnable != null) {
            runnable.run();
        }
    }
}
