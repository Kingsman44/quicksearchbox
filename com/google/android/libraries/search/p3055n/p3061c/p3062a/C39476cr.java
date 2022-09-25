package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p3055n.C39767h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.n.c.a.cr */
/* compiled from: PG */
public final /* synthetic */ class C39476cr implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C39477cs f103933a;

    /* renamed from: b */
    public final /* synthetic */ String f103934b;

    public /* synthetic */ C39476cr(C39477cs csVar, String str) {
        this.f103933a = csVar;
        this.f103934b = str;
    }

    public final C60870cx apply(Object obj) {
        C39477cs csVar = this.f103933a;
        String str = this.f103934b;
        C39479cu cuVar = csVar.f103935a;
        C59104x d = C39479cu.f103938a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g((Throwable) obj)).mo56372aa(53615)).mo56386p("Waiting for the SodaRoute disconnect signal failed! Try to restart Hotword detection!");
        C39636r rVar = new C39636r();
        rVar.f104346a = str;
        rVar.mo41791b(C39389ae.HOTWORD_DETECTED_DISCONNECT_FUTURE_EXCEPTION);
        C39411b a = rVar.mo41790a();
        cuVar.f103970u.mo41870d(C37176a.f97229hc.mo40779c(), a);
        return cuVar.mo41844e((C39767h) cuVar.f103975z.mo56107c(), cuVar.f103975z, false, (C39393ai) null, a);
    }
}
