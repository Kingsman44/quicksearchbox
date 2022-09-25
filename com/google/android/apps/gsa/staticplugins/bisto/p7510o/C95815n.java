package com.google.android.apps.gsa.staticplugins.bisto.p7510o;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.n */
/* compiled from: PG */
public final /* synthetic */ class C95815n implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C95826y f268287a;

    public /* synthetic */ C95815n(C95826y yVar) {
        this.f268287a = yVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C95826y yVar = this.f268287a;
        C124548d dVar = (C124548d) obj;
        yVar.mo89794f(dVar);
        yVar.f268330p.mo89719a();
        if (C124633az.OOBE_FINISHED.equals(dVar.mo106520r()) && C124719q.CAR_ACCESSORY.equals(dVar.mo106513k()) && !yVar.f268330p.f268034b.get()) {
            C95801cg cgVar = yVar.f268322h;
            cgVar.f268245b.mo28212l("play-when-ready", new C95797cc(cgVar, yVar.f268326l));
        }
    }
}
