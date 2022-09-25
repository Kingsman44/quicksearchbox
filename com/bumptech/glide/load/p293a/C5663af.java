package com.bumptech.glide.load.p293a;

import com.bumptech.glide.p287f.C5594k;
import com.bumptech.glide.p287f.C5595l;

/* renamed from: com.bumptech.glide.load.a.af */
/* compiled from: PG */
final class C5663af implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C5667aj f17068a;

    /* renamed from: b */
    private final C5594k f17069b;

    public C5663af(C5667aj ajVar, C5594k kVar) {
        this.f17068a = ajVar;
        this.f17069b = kVar;
    }

    public final void run() {
        synchronized (this.f17069b.mo12037a()) {
            synchronized (this.f17068a) {
                if (this.f17068a.f17075a.mo12146d(this.f17069b)) {
                    C5667aj ajVar = this.f17068a;
                    try {
                        ((C5595l) this.f17069b).mo12039e(ajVar.f17085k, 5);
                    } catch (Throwable th) {
                        throw new C5714g(th);
                    }
                }
                this.f17068a.mo12151d();
            }
        }
    }
}
