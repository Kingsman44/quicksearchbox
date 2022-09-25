package com.bumptech.glide.load.p293a;

import com.bumptech.glide.p287f.C5594k;

/* renamed from: com.bumptech.glide.load.a.ag */
/* compiled from: PG */
final class C5664ag implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C5667aj f17070a;

    /* renamed from: b */
    private final C5594k f17071b;

    public C5664ag(C5667aj ajVar, C5594k kVar) {
        this.f17070a = ajVar;
        this.f17071b = kVar;
    }

    public final void run() {
        synchronized (this.f17071b.mo12037a()) {
            synchronized (this.f17070a) {
                if (this.f17070a.f17075a.mo12146d(this.f17071b)) {
                    this.f17070a.f17087m.mo12161d();
                    C5667aj ajVar = this.f17070a;
                    try {
                        this.f17071b.mo12038d(ajVar.f17087m, ajVar.f17083i);
                        this.f17070a.mo12154g(this.f17071b);
                    } catch (Throwable th) {
                        throw new C5714g(th);
                    }
                }
                this.f17070a.mo12151d();
            }
        }
    }
}
