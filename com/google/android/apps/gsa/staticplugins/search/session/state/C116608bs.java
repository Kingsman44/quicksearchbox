package com.google.android.apps.gsa.staticplugins.search.session.state;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.state.C86842bk;
import com.google.android.apps.gsa.search.core.state.C87135ic;
import com.google.android.apps.gsa.search.core.state.C87141ii;
import com.google.android.apps.gsa.search.core.state.C87143ik;
import com.google.android.apps.gsa.search.core.state.p6864a.C86790e;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.search.p3096r.C39905a;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.bs */
/* compiled from: PG */
public final class C116608bs implements C87143ik {

    /* renamed from: a */
    private final C116607br f323407a;

    /* renamed from: b */
    private final C86842bk f323408b;

    /* renamed from: c */
    private final C86842bk f323409c;

    /* renamed from: d */
    private final C86842bk f323410d;

    public C116608bs(C116607br brVar, C68214a aVar, C68214a aVar2, C68214a aVar3) {
        this.f323407a = brVar;
        this.f323408b = new C86842bk(aVar);
        this.f323409c = new C86842bk(aVar2);
        this.f323410d = new C86842bk(aVar3);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f323407a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        this.f323408b.mo80534b(icVar);
        this.f323409c.mo80534b(icVar);
        this.f323410d.mo80534b(icVar);
        boolean z = this.f323408b.f234552a;
        if (z || this.f323409c.f234552a || this.f323410d.f234552a) {
            C116607br brVar = this.f323407a;
            C86842bk bkVar = this.f323409c;
            C86842bk bkVar2 = this.f323410d;
            if (z || bkVar.f234552a || bkVar2.f234552a) {
                boolean z2 = false;
                if (((C86790e) brVar.f323400a.mo27525b()).mo80442b()) {
                    Query query = ((C116735gk) brVar.f323401b.mo27525b()).f323783o;
                    boolean z3 = !((C116735gk) brVar.f323401b.mo27525b()).f323784p.mo84321bF() && ((C116819jn) brVar.f323402c.mo27525b()).f324160W == 4;
                    if (!TextUtils.equals(query.f252768g, brVar.f323405f)) {
                        brVar.f323404e = query.mo84392cY() && !query.f252770i.isEmpty() && C39905a.m69320a(query.f252770i) != null;
                        brVar.f323405f = query.f252768g;
                    }
                    if (z3 || brVar.f323404e) {
                        z2 = true;
                    }
                }
                if (brVar.f323403d != z2) {
                    brVar.f323403d = z2;
                    if (z2) {
                        brVar.f323406g.mo78389i();
                    }
                }
            }
        }
    }
}
