package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.state.C86842bk;
import com.google.android.apps.gsa.search.core.state.C87135ic;
import com.google.android.apps.gsa.search.core.state.C87141ii;
import com.google.android.apps.gsa.search.core.state.C87143ik;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58832aw;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.ae */
/* compiled from: PG */
public final class C116567ae implements C87143ik {

    /* renamed from: a */
    private final C116566ad f323264a;

    /* renamed from: b */
    private final C86842bk f323265b;

    /* renamed from: c */
    private final C86842bk f323266c;

    public C116567ae(C116566ad adVar, C68214a aVar, C68214a aVar2) {
        this.f323264a = adVar;
        this.f323265b = new C86842bk(aVar);
        this.f323266c = new C86842bk(aVar2);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f323264a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        boolean z;
        this.f323265b.mo80534b(icVar);
        this.f323266c.mo80534b(icVar);
        C86842bk bkVar = this.f323265b;
        if (bkVar.f234552a || this.f323266c.f234552a) {
            C116566ad adVar = this.f323264a;
            C86842bk bkVar2 = this.f323266c;
            if (bkVar2.f234552a) {
                long j = ((C116569ag) bkVar2.mo80533a()).f323268b;
                if (adVar.f323259b != j) {
                    C58976aa aaVar = C58975e.f156826a;
                    long j2 = adVar.f323259b;
                    adVar.f323261d.mo78838d();
                    adVar.f323262e.mo79123c();
                    adVar.f323259b = j;
                }
                z = adVar.mo102770g();
            } else {
                z = false;
            }
            if (bkVar.f234552a) {
                Query query = ((C116735gk) bkVar.mo80533a()).f323784p;
                if (query.mo84331bP()) {
                    Long valueOf = Long.valueOf(query.f252751I);
                    if (!C58832aw.m90831a(valueOf, adVar.f323260c)) {
                        adVar.f323260c = valueOf;
                        adVar.f323261d.mo78836b(adVar.f323260c.longValue());
                    }
                }
            }
            if (z) {
                this.f323264a.mo80591ar();
            }
        }
    }
}
