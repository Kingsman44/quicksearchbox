package com.google.android.apps.gsa.search.core.service.p6859i.p6861b.p6862a.p6863a;

import com.google.android.apps.gsa.search.core.service.p6856h.C86744b;
import com.google.android.apps.gsa.search.core.service.p6859i.p6861b.C86751a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.service.i.b.a.a.e */
/* compiled from: PG */
final class C86757e implements C86755c {

    /* renamed from: a */
    public final C68214a f234330a;

    /* renamed from: b */
    private final C60870cx f234331b;

    /* renamed from: c */
    private final C86764l f234332c;

    /* renamed from: d */
    private final C68214a f234333d;

    /* renamed from: e */
    private boolean f234334e;

    public C86757e(String str, C60870cx cxVar, C68214a aVar, C68214a aVar2, C86751a aVar3) {
        this.f234331b = cxVar;
        this.f234332c = new C86764l(str, cxVar, aVar3);
        this.f234330a = aVar;
        this.f234333d = aVar2;
    }

    /* renamed from: a */
    public final void mo80257a() {
        if (!this.f234334e) {
            this.f234334e = true;
            C60856cj.m92911t(this.f234331b, new C86756d(this), C60826bg.f164896a);
        }
    }

    /* renamed from: b */
    public final C86754b mo80372b() {
        C58838bb.m90884s(!this.f234334e, "acquireWorker() called after disposal");
        C86764l lVar = this.f234332c;
        lVar.f234354c.f234325a.incrementAndGet();
        C58976aa aaVar = C58975e.f156826a;
        lVar.f234355d++;
        return new C86753a(lVar.f234353b, this);
    }

    /* renamed from: c */
    public final C86755c mo80373c() {
        C58833ax axVar;
        C58838bb.m90884s(!this.f234334e, "unloadWorkerIfDisused() called after disposal");
        if (C90877ak.m148480n(this.f234331b) && this.f234332c.f234355d == 0) {
            C86744b bVar = (C86744b) C90877ak.m148474h(this.f234331b);
            C86763k kVar = (C86763k) this.f234330a.mo27525b();
            if (kVar.mo80378c(bVar)) {
                axVar = C58833ax.m90834k(kVar.mo80376a(bVar, true));
            } else {
                axVar = C58836b.f156633a;
            }
            if (axVar.mo56113h()) {
                return ((C86761i) this.f234333d.mo27525b()).mo80375a(this.f234332c.f234352a, (C60870cx) axVar.mo56107c());
            }
        }
        return this;
    }

    /* renamed from: e */
    public final void mo80374e() {
        boolean z = true;
        C58838bb.m90884s(!this.f234334e, "releaseWorker() called after disposal");
        if (C90877ak.m148480n(this.f234331b)) {
            C86764l lVar = this.f234332c;
            C58838bb.m90887v(lVar.f234355d > 0, "Tried to release a worker with no usages: [%s]", lVar.f234352a);
            C86751a aVar = lVar.f234354c;
            if (aVar.f234325a.get() <= 0) {
                z = false;
            }
            C58838bb.m90884s(z, "Tried to decrement the global worker usage counter when there was no usages");
            aVar.f234325a.decrementAndGet();
            C58976aa aaVar = C58975e.f156826a;
            lVar.f234355d--;
            return;
        }
        throw new AssertionError(String.format("Tried to release worker when it has not been successfully loaded: [%s]", new Object[]{this.f234332c.f234352a}));
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("WorkerLoaded");
        fVar.mo85279c("worker future").mo85276a(C90752i.m148229c(C90877ak.m148476j(this.f234331b)));
        if (!C90877ak.m148478l(this.f234331b)) {
            fVar.mo85285l(this.f234332c);
        }
    }
}
