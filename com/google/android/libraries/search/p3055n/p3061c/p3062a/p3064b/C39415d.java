package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3064b;

import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39387ac;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.search.n.c.a.b.d */
/* compiled from: PG */
public final class C39415d implements C39420i {

    /* renamed from: a */
    private static final C59071e f103783a = C59071e.m91332i("com.google.android.libraries.search.n.c.a.b.d");

    /* renamed from: b */
    private final C39423l f103784b;

    /* renamed from: c */
    private final C39387ac f103785c;

    public C39415d(C39423l lVar, C39387ac acVar) {
        this.f103784b = lVar;
        this.f103785c = acVar;
    }

    /* renamed from: a */
    public final int mo41839a(C39419h hVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f103785c.mo41798a(hVar.mo41825a()) || hVar.mo41836j()) {
            return this.f103784b.mo41839a(hVar);
        }
        if (hVar.mo41833h()) {
            C59104x b = f103783a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "PersonalDecisionMaker");
            ((C59052c) ((C59052c) b).mo56372aa(53634)).mo56386p("Voice match not enabled. Stop Hotword detection");
            return 2;
        }
        C59104x b2 = f103783a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "PersonalDecisionMaker");
        ((C59052c) ((C59052c) b2).mo56372aa(53633)).mo56386p("Voice match not enabled. No operation needed since Hotword detection is not running.");
        return 4;
    }
}
