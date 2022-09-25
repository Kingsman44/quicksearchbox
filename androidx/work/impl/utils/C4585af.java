package androidx.work.impl.utils;

import android.content.Context;
import androidx.work.C4380ad;
import androidx.work.C4635p;
import androidx.work.C4636q;
import androidx.work.impl.utils.p209a.C4568b;
import androidx.work.impl.utils.p209a.C4579m;
import androidx.work.impl.utils.p210b.C4595b;
import java.util.UUID;

/* renamed from: androidx.work.impl.utils.af */
/* compiled from: PG */
final class C4585af implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C4579m f14458a;

    /* renamed from: b */
    final /* synthetic */ C4586ag f14459b;

    public C4585af(C4586ag agVar, C4579m mVar) {
        this.f14459b = agVar;
        this.f14458a = mVar;
    }

    public final void run() {
        if (!(this.f14459b.f14461b.f14444d instanceof C4568b)) {
            try {
                C4635p pVar = (C4635p) this.f14458a.get();
                if (pVar != null) {
                    C4380ad h = C4380ad.m12560h();
                    String str = C4586ag.f14460a;
                    h.mo9309a(str, "Updating notification for " + this.f14459b.f14463d.f14219d);
                    C4586ag agVar = this.f14459b;
                    C4579m mVar = agVar.f14461b;
                    C4636q qVar = agVar.f14465f;
                    Context context = agVar.f14462c;
                    UUID uuid = agVar.f14464e.f14000d.f13988a;
                    C4579m mVar2 = new C4579m();
                    C4595b bVar = ((C4588ai) qVar).f14474c;
                    bVar.f14486a.execute(new C4587ah((C4588ai) qVar, mVar2, uuid, pVar, context));
                    mVar.mo9539g(mVar2);
                    return;
                }
                throw new IllegalStateException("Worker was marked important (" + this.f14459b.f14463d.f14219d + ") but did not provide ForegroundInfo");
            } catch (Throwable th) {
                this.f14459b.f14461b.mo9538f(th);
            }
        }
    }
}
