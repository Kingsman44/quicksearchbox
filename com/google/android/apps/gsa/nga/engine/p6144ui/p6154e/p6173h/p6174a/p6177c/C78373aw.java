package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6167b.C78245d;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.aw */
/* compiled from: PG */
public final /* synthetic */ class C78373aw implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C78381bd f215746a;

    public /* synthetic */ C78373aw(C78381bd bdVar) {
        this.f215746a = bdVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C78381bd bdVar = this.f215746a;
        C78245d dVar = (C78245d) obj;
        if (dVar.mo73189l()) {
            int f = dVar.mo73179a().mo73173f();
            if (f == 0) {
                throw null;
            } else if (f != 5 || !((Optional) ((C83361k) bdVar.f215772j).f227199b.get()).isEmpty() || !((Optional) bdVar.f215775m.mo76657c()).isEmpty()) {
                Duration between = Duration.between(bdVar.f215776n, bdVar.f215769g.mo57444a());
                if (between.compareTo(C78381bd.f215752b) > 0) {
                    bdVar.mo73330i();
                } else {
                    bdVar.mo73362o("[NGA] ExecutingStage.TIMEOUT", C78381bd.f215752b.minus(between), new C78364an(bdVar));
                }
            } else {
                bdVar.mo73330i();
            }
        }
    }
}
