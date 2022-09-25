package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3064b;

import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39387ac;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.search.n.c.a.b.c */
/* compiled from: PG */
public final class C39414c implements C39420i {

    /* renamed from: a */
    private static final C59071e f103780a = C59071e.m91332i("com.google.android.libraries.search.n.c.a.b.c");

    /* renamed from: b */
    private final C39423l f103781b;

    /* renamed from: c */
    private final C39387ac f103782c;

    public C39414c(C39423l lVar, C39387ac acVar) {
        this.f103781b = lVar;
        this.f103782c = acVar;
    }

    /* renamed from: a */
    public final int mo41839a(C39419h hVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f103782c.mo41798a(hVar.mo41825a()) || hVar.mo41836j()) {
            return this.f103781b.mo41839a(hVar);
        }
        if (hVar.mo41833h()) {
            C59104x b = f103780a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "CommunalDecisionMaker");
            ((C59052c) ((C59052c) b).mo56372aa(53631)).mo56386p("Voice match not enabled. Stop Hotword detection");
            return 2;
        }
        C59104x b2 = f103780a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "CommunalDecisionMaker");
        ((C59052c) ((C59052c) b2).mo56372aa(53630)).mo56386p("Voice match not enabled. No operation needed since Hotword detection is not running.");
        return 4;
    }
}
