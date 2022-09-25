package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37259h;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3064b.C39419h;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3068f.p3069a.C39518a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.n.c.a.cg */
/* compiled from: PG */
public final /* synthetic */ class C39465cg implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C39479cu f103902a;

    /* renamed from: b */
    public final /* synthetic */ boolean f103903b;

    /* renamed from: c */
    public final /* synthetic */ C39419h f103904c;

    public /* synthetic */ C39465cg(C39479cu cuVar, boolean z, C39419h hVar) {
        this.f103902a = cuVar;
        this.f103903b = z;
        this.f103904c = hVar;
    }

    public final C60870cx apply(Object obj) {
        C37259h hVar;
        C39479cu cuVar = this.f103902a;
        boolean z = this.f103903b;
        C39419h hVar2 = this.f103904c;
        Void voidR = (Void) obj;
        C59104x b = C39479cu.f103938a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
        ((C59052c) ((C59052c) b).mo56372aa(53604)).mo56386p("Hotword Stopped");
        if (z) {
            return C60866ct.f164955a;
        }
        if (hVar2.mo41826b().mo41820a() == C39389ae.HOTWORD_TIMEOUT) {
            hVar = C37176a.f97310jd.mo40806d();
        } else {
            hVar = C37176a.f97246ht.mo40806d();
        }
        return cuVar.mo41857s(hVar, hVar2.mo41826b(), C39518a.m68940b(hVar2), 5);
    }
}
