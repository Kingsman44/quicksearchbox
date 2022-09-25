package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6081b;

import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76564ah;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80403p;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.libraries.gsa.p1876k.C22864c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.b.l */
/* compiled from: PG */
public final /* synthetic */ class C76815l implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C76817n f212205a;

    /* renamed from: b */
    public final /* synthetic */ C76590bg f212206b;

    public /* synthetic */ C76815l(C76817n nVar, C76590bg bgVar) {
        this.f212205a = nVar;
        this.f212206b = bgVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C76817n nVar = this.f212205a;
        C76590bg bgVar = this.f212206b;
        C80401n nVar2 = (C80401n) obj;
        if (C81442m.m129553o(nVar2)) {
            return nVar2;
        }
        Optional g = bgVar.mo72265g(C76564ah.f211801a, "website");
        if (g.isEmpty()) {
            C80399l lVar = (C80399l) nVar2.toBuilder();
            lVar.copyOnWrite();
            ((C80401n) lVar.instance).f220664g = C80403p.m128150a(5);
            return (C80401n) lVar.build();
        }
        C80399l lVar2 = (C80399l) C80401n.f220656k.createBuilder(nVar2);
        nVar.mo72335d(bgVar, (String) g.get(), lVar2);
        return (C80401n) lVar2.build();
    }
}
