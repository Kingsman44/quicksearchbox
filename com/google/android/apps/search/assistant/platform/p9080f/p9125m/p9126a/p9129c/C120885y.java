package com.google.android.apps.search.assistant.platform.p9080f.p9125m.p9126a.p9129c;

import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p3055n.C39670cx;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.p4449cd.p4456g.p4459c.C58000d;

/* renamed from: com.google.android.apps.search.assistant.platform.f.m.a.c.y */
/* compiled from: PG */
public final /* synthetic */ class C120885y implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C120844ak f336099a;

    /* renamed from: b */
    public final /* synthetic */ C39670cx f336100b;

    public /* synthetic */ C120885y(C120844ak akVar, C39670cx cxVar) {
        this.f336099a = akVar;
        this.f336100b = cxVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C120844ak akVar = this.f336099a;
        C39670cx cxVar = this.f336100b;
        try {
            akVar.f336020b.f336064b.mo19974a(C37176a.f97117fW);
            akVar.f336029k.mo20123c(cxVar);
            return C58000d.m88748a(akVar.f336028j.f336042c, C120876p.f336087a);
        } catch (IllegalStateException e) {
            C59104x d = C120844ak.f336019a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ConvEngine.OnDeviceAsr");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(35615)).mo56386p("Error sending SodaAsrCompatibilityCheckRequest, possibly due to SODA connection being shutdown.");
            return C60856cj.m92900i(C58836b.f156633a);
        }
    }
}
