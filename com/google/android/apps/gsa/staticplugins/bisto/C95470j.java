package com.google.android.apps.gsa.staticplugins.bisto;

import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124715m;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.j */
/* compiled from: PG */
public final /* synthetic */ class C95470j implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ BistoRealService f267157a;

    public /* synthetic */ C95470j(BistoRealService bistoRealService) {
        this.f267157a = bistoRealService;
    }

    public final Object apply(Object obj) {
        BistoRealService bistoRealService = this.f267157a;
        for (C124548d dVar : (List) obj) {
            String P = dVar.mo106475P();
            if (!dVar.mo106512j().equals(C124715m.NOT_CONNECTED) && bistoRealService.f264691o.mo89297a(P) == null) {
                C58976aa aaVar = C58975e.f156826a;
                ((C89492cd) bistoRealService.f264683g.mo27525b()).mo83384Z(P, C124715m.NOT_CONNECTED);
            }
        }
        return true;
    }
}
