package com.google.android.apps.gsa.search.core.state.p6872d;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.C86645bl;
import com.google.android.apps.gsa.search.core.service.C86646bm;
import com.google.android.apps.gsa.search.core.service.C86647bn;
import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.search.core.state.C86898ct;
import com.google.android.apps.gsa.search.core.state.C87140ih;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58541iw;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.d.ag */
/* compiled from: PG */
public final class C86913ag extends C87140ih {

    /* renamed from: h */
    private final C68214a f234715h;

    public C86913ag(C21370a aVar, C86124t tVar, C58541iw iwVar, C68214a aVar2, C68214a aVar3, C90476a aVar4, C90479a aVar5) {
        super(tVar, iwVar, aVar2, C86898ct.f234665C, C86898ct.f234665C, aVar4, aVar5, "GlobalEventBus");
        this.f234715h = aVar3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo80565n(int i) {
        super.mo80565n(i);
        if (this.f235435e.isEmpty()) {
            ((C86647bn) this.f234715h.mo27525b()).mo80261a();
            C86647bn bnVar = (C86647bn) this.f234715h.mo27525b();
            C22872h.m42743c(C86593a.class);
            boolean z = ((C86948bo) bnVar.f234086e.mo27525b()).mo80606z(1);
            C58976aa aaVar = C58975e.f156826a;
            if (z) {
                int i2 = bnVar.f234088g;
                C86646bm bmVar = new C86646bm(bnVar, i2);
                ((C22871g) bnVar.f234087f.mo27525b()).mo28213m("SearchService shutdownLikely", (long) (C86647bn.f234083b.intValue() / 2), new C86645bl(bnVar, i2));
                ((C22871g) bnVar.f234087f.mo27525b()).mo28213m("SearchService stop", (long) C86647bn.f234083b.intValue(), bmVar);
            }
        }
    }
}
