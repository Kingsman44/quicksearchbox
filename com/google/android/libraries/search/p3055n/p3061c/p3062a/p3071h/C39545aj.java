package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h;

import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39392ah;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39394aj;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39395ak;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39638t;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39640v;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.search.n.c.a.h.aj */
/* compiled from: PG */
public final /* synthetic */ class C39545aj implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C39580br f104116a;

    /* renamed from: b */
    public final /* synthetic */ C39583bu f104117b;

    public /* synthetic */ C39545aj(C39580br brVar, C39583bu buVar) {
        this.f104116a = brVar;
        this.f104117b = buVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C39580br brVar = this.f104116a;
        C39583bu buVar = this.f104117b;
        C58976aa aaVar = C58975e.f156826a;
        if (brVar.f104177j.get() == C39579bq.STARTED) {
            C59104x d = C39580br.f104168a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
            ((C59052c) ((C59052c) d).mo56372aa(53751)).mo56386p("Another session is going on! Please make sure it's stopped before start another one!");
            C39394aj c = C39395ak.m68799c();
            C39638t tVar = new C39638t();
            tVar.mo41807b(C39392ah.SODA_DOUBLE_START_ERROR);
            tVar.f104350a = "Another session is going on! Please make sure it's stopped before start another one!";
            ((C39640v) c).f104354a = C58833ax.m90834k(tVar.mo41806a());
            return C60856cj.m92900i(c.mo41810a());
        }
        brVar.f104189v = buVar.mo41919a();
        brVar.f104188u = C58833ax.m90834k(buVar);
        C39571bi biVar = new C39571bi(brVar);
        return C60856cj.m92905n(C47810es.m84965e(biVar), brVar.f104174g);
    }
}
