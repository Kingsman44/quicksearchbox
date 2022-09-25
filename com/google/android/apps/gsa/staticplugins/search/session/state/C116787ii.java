package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.state.C86842bk;
import com.google.android.apps.gsa.search.core.state.C87135ic;
import com.google.android.apps.gsa.search.core.state.C87141ii;
import com.google.android.apps.gsa.search.core.state.C87143ik;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.ii */
/* compiled from: PG */
public final class C116787ii implements C87143ik {

    /* renamed from: a */
    private final C116786ih f323998a;

    /* renamed from: b */
    private final C86842bk f323999b;

    /* renamed from: c */
    private final C86842bk f324000c;

    /* renamed from: d */
    private final C86842bk f324001d;

    public C116787ii(C116786ih ihVar, C68214a aVar, C68214a aVar2, C68214a aVar3) {
        this.f323998a = ihVar;
        this.f323999b = new C86842bk(aVar);
        this.f324000c = new C86842bk(aVar2);
        this.f324001d = new C86842bk(aVar3);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f323998a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        this.f323999b.mo80534b(icVar);
        this.f324000c.mo80534b(icVar);
        this.f324001d.mo80534b(icVar);
        C86842bk bkVar = this.f323999b;
        if (bkVar.f234552a || this.f324000c.f234552a || this.f324001d.f234552a) {
            C116786ih ihVar = this.f323998a;
            C86842bk bkVar2 = this.f324000c;
            C86842bk bkVar3 = this.f324001d;
            C58976aa aaVar = C58975e.f156826a;
            boolean z = false;
            if (bkVar3.f234552a) {
                Query query = ((C116735gk) bkVar3.mo80533a()).f323784p;
                if (!query.mo84383cP(ihVar.f323992a) && ihVar.f323993b) {
                    ihVar.f323993b = false;
                    z = true;
                }
                ihVar.f323992a = query;
            }
            if (bkVar3.f234552a || bkVar.f234552a || bkVar2.f234552a) {
                z |= ihVar.mo102942i((C116836z) bkVar.mo80533a(), (C116611bv) bkVar2.mo80533a(), (C116735gk) bkVar3.mo80533a());
            }
            if (z) {
                this.f323998a.mo80591ar();
            }
        }
    }
}
