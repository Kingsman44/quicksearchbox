package com.google.android.apps.gsa.staticplugins.p7816dl.p7818b;

import com.google.android.apps.gsa.search.core.p6519al.p6620bu.C85022a;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88156rf;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88158rh;
import com.google.android.apps.gsa.shared.monet.p7114f.C90327e;
import com.google.android.apps.gsa.shared.p7066m.C90013bs;
import com.google.android.apps.gsa.sidekick.shared.util.C91974ay;
import com.google.android.apps.gsa.staticplugins.opa.p8363f.C109029a;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7891nu;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.dl.b.ae */
/* compiled from: PG */
final class C99648ae extends C90327e {

    /* renamed from: a */
    final /* synthetic */ C99649af f278842a;

    public C99648ae(C99649af afVar) {
        this.f278842a = afVar;
    }

    /* renamed from: f */
    public final void mo84019f() {
        this.f278842a.mo91550j(false);
        if (this.f278842a.mo91554n()) {
            C86337q b = this.f278842a.f278845c.mo80076b();
            b.mo80073h("minus_one_visibility_state", "HIDDEN");
            b.apply();
            C58976aa aaVar = C58975e.f156826a;
            this.f278842a.mo91553m();
        }
    }

    /* renamed from: g */
    public final void mo84020g() {
        Object obj;
        this.f278842a.mo91550j(true);
        boolean o = this.f278842a.mo91555o();
        if (this.f278842a.f278848f.mo79746e(C90013bs.f247030n) && (!this.f278842a.f278848f.mo79746e(C90013bs.f247024h) || !((Boolean) ((C99652c) this.f278842a.f278843a).f278881a.f63720e).booleanValue())) {
            ((C99652c) this.f278842a.f278843a).f278881a.mo28730f(true, false);
            C99649af afVar = this.f278842a;
            ClientEventData a = C91974ay.m150930a(C7891nu.MINUS_ONE);
            C85022a aVar = afVar.f278847e;
            C62940bt btVar = C88156rf.f238317a;
            C87741bw bwVar = a.f236955a;
            C62940bt r4 = C62942bv.checkIsLite(btVar);
            bwVar.mo58887l(r4);
            Object l = bwVar.f169962ag.mo58854l(r4.f169971d);
            if (l == null) {
                obj = r4.f169969b;
            } else {
                obj = r4.mo58889c(l);
            }
            aVar.mo78659e((C88158rh) obj, 3);
        }
        C99649af afVar2 = this.f278842a;
        if (((C58833ax) afVar2.f278850h.mo27525b()).mo56113h() && ((C109029a) ((C58833ax) afVar2.f278850h.mo27525b()).mo56107c()).mo97399d()) {
            C58976aa aaVar = C58975e.f156826a;
            this.f278842a.f278849g.mo79000e(C53306j.MAIN_APP);
        }
        C86337q b = this.f278842a.f278845c.mo80076b();
        b.mo80073h("minus_one_visibility_state", "VISIBLE");
        b.apply();
        C58976aa aaVar2 = C58975e.f156826a;
        ((C99652c) this.f278842a.f278843a).f278894n.mo28730f(false, false);
        if (!o) {
            this.f278842a.mo91553m();
        }
    }
}
