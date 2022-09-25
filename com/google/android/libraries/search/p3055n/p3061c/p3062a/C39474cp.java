package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.search.n.c.a.cp */
/* compiled from: PG */
public final /* synthetic */ class C39474cp implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C39477cs f103928a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f103929b;

    /* renamed from: c */
    public final /* synthetic */ String f103930c;

    public /* synthetic */ C39474cp(C39477cs csVar, C60870cx cxVar, String str) {
        this.f103928a = csVar;
        this.f103929b = cxVar;
        this.f103930c = str;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C39477cs csVar = this.f103928a;
        C60870cx cxVar = this.f103929b;
        String str = this.f103930c;
        C59104x b = C39479cu.f103938a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
        ((C59052c) ((C59052c) b).mo56372aa(53540)).mo56386p("Waiting for Soda route disconnect signal inside sequencer.");
        return C47633f.m84733g(cxVar).mo51516i(new C39475cq(csVar, str), csVar.f103935a.f103953d).mo51514f(Throwable.class, new C39476cr(csVar, str), csVar.f103935a.f103953d);
    }
}
