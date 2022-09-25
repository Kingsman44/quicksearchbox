package androidx.work.impl.utils;

import androidx.work.impl.utils.p209a.C4568b;
import androidx.work.impl.utils.p209a.C4579m;

/* renamed from: androidx.work.impl.utils.ae */
/* compiled from: PG */
public final /* synthetic */ class C4584ae implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C4586ag f14456a;

    /* renamed from: b */
    public final /* synthetic */ C4579m f14457b;

    public /* synthetic */ C4584ae(C4586ag agVar, C4579m mVar) {
        this.f14456a = agVar;
        this.f14457b = mVar;
    }

    public final void run() {
        C4586ag agVar = this.f14456a;
        C4579m mVar = this.f14457b;
        if (!(agVar.f14461b.f14444d instanceof C4568b)) {
            mVar.mo9539g(agVar.f14464e.mo9296a());
        } else {
            mVar.cancel(true);
        }
    }
}
