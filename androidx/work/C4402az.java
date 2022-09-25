package androidx.work;

import androidx.work.impl.utils.p209a.C4579m;

/* renamed from: androidx.work.az */
/* compiled from: PG */
final class C4402az implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C4579m f14049a;

    public C4402az(C4579m mVar) {
        this.f14049a = mVar;
    }

    public final void run() {
        try {
            throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
        } catch (Throwable th) {
            this.f14049a.mo9538f(th);
        }
    }
}
