package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.core.state.p6872d.C86966r;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.dr */
/* compiled from: PG */
public final class C86992dr implements C87143ik {

    /* renamed from: a */
    private final C86991dq f234973a;

    /* renamed from: b */
    private final C86842bk f234974b;

    /* renamed from: c */
    private final C86842bk f234975c;

    /* renamed from: d */
    private final C86842bk f234976d;

    /* renamed from: e */
    private final C86842bk f234977e;

    public C86992dr(C86991dq dqVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4) {
        this.f234973a = dqVar;
        this.f234974b = new C86842bk(aVar);
        this.f234975c = new C86842bk(aVar2);
        this.f234976d = new C86842bk(aVar3);
        this.f234977e = new C86842bk(aVar4);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f234973a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        this.f234974b.mo80534b(icVar);
        this.f234975c.mo80534b(icVar);
        this.f234976d.mo80534b(icVar);
        this.f234977e.mo80534b(icVar);
        C86842bk bkVar = this.f234974b;
        if (bkVar.f234552a || this.f234975c.f234552a || this.f234976d.f234552a || this.f234977e.f234552a) {
            C86991dq dqVar = this.f234973a;
            C86842bk bkVar2 = this.f234975c;
            C86842bk bkVar3 = this.f234976d;
            C86842bk bkVar4 = this.f234977e;
            C86812ai aiVar = (C86812ai) bkVar.mo80533a();
            if (bkVar.f234552a) {
                long j = aiVar.f234472b;
                if (j != dqVar.f234971e) {
                    dqVar.f234971e = j;
                    if (j != 0) {
                        dqVar.mo80626a();
                    }
                }
            }
            if (bkVar.f234552a || bkVar2.f234552a || bkVar4.f234552a) {
                C86833bb bbVar = (C86833bb) bkVar2.mo80533a();
                C87052fn fnVar = (C87052fn) bkVar4.mo80533a();
                boolean z = false;
                if (aiVar.mo80518e() && (fnVar.mo80690I() || fnVar.mo80455H() || bbVar.mo80530b() || aiVar.f234471a.mo81885c() || aiVar.f234471a.mo81889g())) {
                    z = true;
                }
                if (z != dqVar.f234969c) {
                    dqVar.f234969c = z;
                    if (z) {
                        long j2 = ((C86815al) dqVar.f234967a.mo27525b()).f234493a;
                        dqVar.f234970d = j2;
                        dqVar.f234968b.mo79100a(j2);
                    } else {
                        dqVar.f234968b.mo79102d(dqVar.f234970d);
                    }
                }
            }
            if (bkVar3.f234552a) {
                C89062r rVar = ((C86966r) bkVar3.mo80533a()).f234900a;
                if (!dqVar.f234972f.equals(rVar)) {
                    dqVar.f234972f = rVar;
                    dqVar.mo80626a();
                }
            }
        }
    }
}
