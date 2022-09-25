package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58832aw;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.af */
/* compiled from: PG */
public final class C86809af implements C87143ik {

    /* renamed from: a */
    private final C86808ae f234468a;

    /* renamed from: b */
    private final C86842bk f234469b;

    /* renamed from: c */
    private final C86842bk f234470c;

    public C86809af(C86808ae aeVar, C68214a aVar, C68214a aVar2) {
        this.f234468a = aeVar;
        this.f234469b = new C86842bk(aVar);
        this.f234470c = new C86842bk(aVar2);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f234468a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        boolean z;
        this.f234469b.mo80534b(icVar);
        this.f234470c.mo80534b(icVar);
        C86842bk bkVar = this.f234469b;
        if (bkVar.f234552a || this.f234470c.f234552a) {
            C86808ae aeVar = this.f234468a;
            C86842bk bkVar2 = this.f234470c;
            if (bkVar2.f234552a) {
                long j = ((C86812ai) bkVar2.mo80533a()).f234472b;
                if (aeVar.f234462b != j) {
                    C58976aa aaVar = C58975e.f156826a;
                    long j2 = aeVar.f234462b;
                    aeVar.f234465e.mo78838d();
                    aeVar.f234466f.mo79123c();
                    aeVar.f234462b = j;
                }
                z = aeVar.mo80515c();
            } else {
                z = false;
            }
            if (bkVar.f234552a) {
                Query query = ((C87052fn) bkVar.mo80533a()).f235177m;
                aeVar.f234464d = query.mo84403cj();
                if (query.mo84331bP()) {
                    Long valueOf = Long.valueOf(query.f252751I);
                    if (!C58832aw.m90831a(valueOf, aeVar.f234463c)) {
                        aeVar.f234463c = valueOf;
                        aeVar.f234465e.mo78836b(aeVar.f234463c.longValue());
                    }
                }
            }
            if (z) {
                this.f234468a.mo80591ar();
            }
        }
    }
}
