package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.state.C87135ic;
import com.google.android.apps.gsa.search.core.state.C87141ii;
import com.google.android.apps.gsa.search.core.state.C87143ik;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.ep */
/* compiled from: PG */
public final class C116686ep implements C87143ik {

    /* renamed from: a */
    private final C116685eo f323611a;

    /* renamed from: b */
    private final C68214a f323612b;

    public C116686ep(C116685eo eoVar, C68214a aVar) {
        this.f323611a = eoVar;
        this.f323612b = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f323611a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        boolean z;
        if (icVar.mo80754a(((C116569ag) this.f323612b.mo27525b()).f235452J)) {
            C116685eo eoVar = this.f323611a;
            C116569ag agVar = (C116569ag) this.f323612b.mo27525b();
            long j = agVar.f323268b;
            if (j != eoVar.f323604a) {
                eoVar.f323604a = j;
                boolean f = BitFlags.m148144f(agVar.f323267a.f236949b.f253762b, 549755813888L);
                if (eoVar.f323606c != f) {
                    eoVar.f323606c = f;
                    if (f) {
                        eoVar.f323608e.mo78680j();
                    } else {
                        eoVar.f323608e.mo78678h();
                        eoVar.f323608e.mo78671a();
                    }
                    z = true;
                } else {
                    z = false;
                }
                Query query = ((C116735gk) eoVar.f323607d.mo27525b()).f323783o;
                boolean z2 = BitFlags.m148144f(agVar.f323267a.f236949b.f253762b, 18014398509481984L) && !eoVar.f323609f.mo79746e(C90010bp.f246943aL) && !query.mo84418cy() && !query.mo84385cR();
                if (!f || z2) {
                    eoVar.f323605b = false;
                } else if (!eoVar.f323605b) {
                    eoVar.f323605b = true;
                    C58976aa aaVar = C58975e.f156826a;
                    this.f323611a.mo80591ar();
                }
                if (!z) {
                    return;
                }
                this.f323611a.mo80591ar();
            }
        }
    }
}
