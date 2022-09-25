package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.p680a;

import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15479e;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.f */
/* compiled from: PG */
final class C11604f implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C11605g f37538a;

    public C11604f(C11605g gVar) {
        this.f37538a = gVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C11605g.f37539a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "AAPAssistantPreWarmer");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(43371)).mo56386p("Failed to pre-warm assistant");
        this.f37538a.f37541c.mo19974a(C37179a.f97627dn.mo40805c(C15479e.m32211a(th)));
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        List list = (List) obj;
        C58976aa aaVar = C58975e.f156826a;
        this.f37538a.f37541c.mo19974a(C37179a.f97627dn.mo40805c(C62722b.OK));
    }
}
