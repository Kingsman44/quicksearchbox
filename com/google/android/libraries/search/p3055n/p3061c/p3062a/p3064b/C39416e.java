package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3064b;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.search.n.c.a.b.e */
/* compiled from: PG */
public final class C39416e implements C39420i {

    /* renamed from: a */
    private static final C59071e f103786a = C59071e.m91332i("com.google.android.libraries.search.n.c.a.b.e");

    /* renamed from: a */
    public final int mo41839a(C39419h hVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (hVar.mo41833h()) {
            C59104x d = f103786a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ExternalDecisionMaker");
            ((C59052c) ((C59052c) d).mo56372aa(53637)).mo56386p("The hotword is running when External mode is on. Stopping it.");
            return 2;
        }
        C59104x b = f103786a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ExternalDecisionMaker");
        ((C59052c) ((C59052c) b).mo56372aa(53636)).mo56386p("The hotword is NOT running when External mode is on. NO-OP.");
        return 4;
    }
}
