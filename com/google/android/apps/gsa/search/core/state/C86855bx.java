package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.shared.search.Query;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.bx */
/* compiled from: PG */
public final class C86855bx implements C87143ik {

    /* renamed from: a */
    private final C86854bw f234577a;

    /* renamed from: b */
    private final C86842bk f234578b;

    /* renamed from: c */
    private final C86842bk f234579c;

    public C86855bx(C86854bw bwVar, C68214a aVar, C68214a aVar2) {
        this.f234577a = bwVar;
        this.f234578b = new C86842bk(aVar);
        this.f234579c = new C86842bk(aVar2);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f234577a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        Query m;
        this.f234578b.mo80534b(icVar);
        this.f234579c.mo80534b(icVar);
        C86842bk bkVar = this.f234578b;
        if (bkVar.f234552a || this.f234579c.f234552a) {
            C86854bw bwVar = this.f234577a;
            C86842bk bkVar2 = this.f234579c;
            if (bkVar2.f234552a && !((C87052fn) bkVar2.mo80533a()).f235177m.mo84435dP()) {
                bwVar.mo80542g((C87052fn) bkVar2.mo80533a());
            }
            if (bkVar.f234552a) {
                bwVar.mo80539b((C87171z) bkVar.mo80533a());
            }
            if (bkVar2.f234552a && (m = ((C87052fn) bkVar2.mo80533a()).mo80711m("clockwork")) != null) {
                bwVar.f234572d.mo28211k(bwVar.f234575g.mo79095b(m), "Clockwork Search Callback", new C86852bu(bwVar, m));
            }
        }
    }
}
