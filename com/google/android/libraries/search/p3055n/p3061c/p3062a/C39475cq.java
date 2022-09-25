package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p3055n.C39767h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.n.c.a.cq */
/* compiled from: PG */
public final /* synthetic */ class C39475cq implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C39477cs f103931a;

    /* renamed from: b */
    public final /* synthetic */ String f103932b;

    public /* synthetic */ C39475cq(C39477cs csVar, String str) {
        this.f103931a = csVar;
        this.f103932b = str;
    }

    public final C60870cx apply(Object obj) {
        C39477cs csVar = this.f103931a;
        String str = this.f103932b;
        Void voidR = (Void) obj;
        C39479cu cuVar = csVar.f103935a;
        C59104x b = C39479cu.f103938a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
        ((C59052c) ((C59052c) b).mo56372aa(53616)).mo56386p("SodaRoute disconnected. Try to restart Hotword detection.");
        C39636r rVar = new C39636r();
        rVar.mo41791b(C39389ae.HOTWORD_DETECTED_DISCONNECT_FUTURE_FINISHED_PROPERLY);
        rVar.f104346a = str;
        C39411b a = rVar.mo41790a();
        cuVar.f103970u.mo41870d(C37176a.f97228hb.mo40779c(), a);
        return cuVar.mo41844e((C39767h) cuVar.f103975z.mo56107c(), cuVar.f103975z, false, (C39393ai) null, a);
    }
}
