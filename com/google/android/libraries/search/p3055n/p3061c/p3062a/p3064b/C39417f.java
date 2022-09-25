package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3064b;

import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39387ac;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.search.n.c.a.b.f */
/* compiled from: PG */
public final class C39417f implements C39420i {

    /* renamed from: a */
    private static final C59071e f103787a = C59071e.m91332i("com.google.android.libraries.search.n.c.a.b.f");

    /* renamed from: b */
    private final C39423l f103788b;

    /* renamed from: c */
    private final C39387ac f103789c;

    public C39417f(C39423l lVar, C39387ac acVar) {
        this.f103788b = lVar;
        this.f103789c = acVar;
    }

    /* renamed from: a */
    public final int mo41839a(C39419h hVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f103789c.mo41798a(hVar.mo41825a()) || hVar.mo41828d().mo41840a().f395898s == 1) {
            return this.f103788b.mo41839a(hVar);
        }
        if (hVar.mo41833h()) {
            C59104x b = f103787a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GuestDecisionMaker");
            boolean z = hVar.mo41828d().mo41840a().f395899t;
            ((C59052c) ((C59052c) C39387ac.f103702a.mo56224b()).mo56372aa(53523)).mo56389s("Voice Match (Speaker-id) supported : %b ", Boolean.valueOf(z));
            ((C59052c) ((C59052c) b).mo56372aa(53640)).mo56358K("Hotword/Voice Match not enrolled. Stop Hotword detection. Voice Match supported : %b, Voice Match enabled : %b.", z, C39387ac.m68783c(hVar.mo41828d()));
            return 2;
        }
        C59104x b2 = f103787a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "GuestDecisionMaker");
        ((C59052c) ((C59052c) b2).mo56372aa(53639)).mo56386p("Hotword/Voice Match not enrolled. No operation needed since Hotword detection is not running.");
        return 4;
    }
}
