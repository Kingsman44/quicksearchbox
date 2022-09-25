package androidx.work.impl.utils;

import androidx.work.impl.utils.p209a.C4579m;

/* renamed from: androidx.work.impl.utils.z */
/* compiled from: PG */
public abstract class C4619z implements Runnable {

    /* renamed from: c */
    public final C4579m f14518c = new C4579m();

    /* renamed from: a */
    public abstract Object mo9559a();

    public final void run() {
        try {
            this.f14518c.mo9537e(mo9559a());
        } catch (Throwable th) {
            this.f14518c.mo9538f(th);
        }
    }
}
