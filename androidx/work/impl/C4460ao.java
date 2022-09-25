package androidx.work.impl;

import androidx.work.C4380ad;
import androidx.work.impl.utils.p209a.C4568b;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: androidx.work.impl.ao */
/* compiled from: PG */
final class C4460ao implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C60870cx f14171a;

    /* renamed from: b */
    final /* synthetic */ C4463ar f14172b;

    public C4460ao(C4463ar arVar, C60870cx cxVar) {
        this.f14172b = arVar;
        this.f14171a = cxVar;
    }

    public final void run() {
        if (!(this.f14172b.f14189g.f14444d instanceof C4568b)) {
            try {
                this.f14171a.get();
                C4380ad h = C4380ad.m12560h();
                String str = C4463ar.f14183a;
                h.mo9309a(str, "Starting work for " + this.f14172b.f14185c.f14219d);
                C4463ar arVar = this.f14172b;
                arVar.f14189g.mo9539g(arVar.f14186d.mo9297b());
            } catch (Throwable th) {
                this.f14172b.f14189g.mo9538f(th);
            }
        }
    }
}
