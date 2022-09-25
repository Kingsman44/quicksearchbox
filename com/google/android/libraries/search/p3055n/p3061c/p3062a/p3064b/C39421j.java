package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3064b;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.search.n.c.a.b.j */
/* compiled from: PG */
public final class C39421j implements C39420i {

    /* renamed from: a */
    private static final C59071e f103790a = C59071e.m91332i("com.google.android.libraries.search.n.c.a.b.j");

    /* renamed from: b */
    private final C39423l f103791b;

    public C39421j(C39423l lVar) {
        this.f103791b = lVar;
    }

    /* renamed from: a */
    public final int mo41839a(C39419h hVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (hVar.mo41828d().mo41841b().f104025b) {
            return this.f103791b.mo41839a(hVar);
        }
        if (hVar.mo41833h()) {
            C59104x d = f103790a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "NaviDecisionMaker");
            ((C59052c) ((C59052c) d).mo56372aa(53643)).mo56386p("The hotword setting for Navigation is off and hotword is running. Stopping it.");
            return 2;
        }
        C59104x b = f103790a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "NaviDecisionMaker");
        ((C59052c) ((C59052c) b).mo56372aa(53642)).mo56386p("The hotword setting for Navigation is off and hotword is not running. NO-OP.");
        return 4;
    }
}
