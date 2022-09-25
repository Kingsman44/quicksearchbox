package com.google.android.apps.gsa.staticplugins.p8163o.p8165b;

import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85335d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.staticplugins.o.b.b */
/* compiled from: PG */
final class C105807b implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C105808c f295170a;

    public C105807b(C105808c cVar) {
        this.f295170a = cVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (!(th instanceof CancellationException)) {
            C59104x d = C105808c.f295171a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SpeakrETM");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(14097)).mo56386p("Failed to get paragraph durations.");
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C85335d dVar = (C85335d) obj;
        dVar.getClass();
        if (!this.f295170a.f295172b.equals(dVar)) {
            this.f295170a.mo95073b(dVar);
        }
    }
}
