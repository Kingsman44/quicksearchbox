package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.state.C86842bk;
import com.google.android.apps.gsa.search.core.state.C87135ic;
import com.google.android.apps.gsa.search.core.state.C87141ii;
import com.google.android.apps.gsa.search.core.state.C87143ik;
import com.google.android.apps.gsa.search.core.state.p6872d.C86966r;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.eh */
/* compiled from: PG */
public final class C116678eh implements C87143ik {

    /* renamed from: a */
    private final C116677eg f323585a;

    /* renamed from: b */
    private final C86842bk f323586b;

    /* renamed from: c */
    private final C86842bk f323587c;

    /* renamed from: d */
    private final C86842bk f323588d;

    /* renamed from: e */
    private final C86842bk f323589e;

    public C116678eh(C116677eg egVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4) {
        this.f323585a = egVar;
        this.f323586b = new C86842bk(aVar);
        this.f323587c = new C86842bk(aVar2);
        this.f323588d = new C86842bk(aVar3);
        this.f323589e = new C86842bk(aVar4);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f323585a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        this.f323586b.mo80534b(icVar);
        this.f323587c.mo80534b(icVar);
        this.f323588d.mo80534b(icVar);
        this.f323589e.mo80534b(icVar);
        C86842bk bkVar = this.f323586b;
        if (bkVar.f234552a || this.f323587c.f234552a || this.f323588d.f234552a || this.f323589e.f234552a) {
            C116677eg egVar = this.f323585a;
            C86842bk bkVar2 = this.f323587c;
            C86842bk bkVar3 = this.f323588d;
            C86842bk bkVar4 = this.f323589e;
            C116569ag agVar = (C116569ag) bkVar.mo80533a();
            if (bkVar.f234552a) {
                long j = agVar.f323268b;
                if (j != egVar.f323583e) {
                    egVar.f323583e = j;
                    if (j != 0) {
                        egVar.mo102831e();
                    }
                }
            }
            if (bkVar.f234552a || bkVar2.f234552a || bkVar4.f234552a) {
                C116579aq aqVar = (C116579aq) bkVar2.mo80533a();
                C116735gk gkVar = (C116735gk) bkVar4.mo80533a();
                boolean z = false;
                if (agVar.mo102773i() && (gkVar.mo102879U() || gkVar.mo80455H() || aqVar.mo102783g() || agVar.f323267a.mo81885c() || agVar.f323267a.mo81889g())) {
                    z = true;
                }
                C58976aa aaVar = C58975e.f156826a;
                if (z != egVar.f323581c) {
                    egVar.f323581c = z;
                    if (z) {
                        long j2 = ((C116572aj) egVar.f323579a.mo27525b()).f323290a;
                        egVar.f323582d = j2;
                        egVar.f323580b.mo79100a(j2);
                    } else {
                        egVar.f323580b.mo79102d(egVar.f323582d);
                    }
                }
            }
            if (bkVar3.f234552a) {
                C89062r rVar = ((C86966r) bkVar3.mo80533a()).f234900a;
                if (!egVar.f323584f.equals(rVar)) {
                    egVar.f323584f = rVar;
                    egVar.mo102831e();
                }
            }
        }
    }
}
