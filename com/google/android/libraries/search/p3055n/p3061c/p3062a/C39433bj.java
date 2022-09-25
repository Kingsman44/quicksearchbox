package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import com.google.android.libraries.search.p3055n.C39767h;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.n.c.a.bj */
/* compiled from: PG */
public final /* synthetic */ class C39433bj implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C39479cu f103812a;

    /* renamed from: b */
    public final /* synthetic */ String f103813b;

    public /* synthetic */ C39433bj(C39479cu cuVar, String str) {
        this.f103812a = cuVar;
        this.f103813b = str;
    }

    public final C60870cx apply(Object obj) {
        C39479cu cuVar = this.f103812a;
        String str = this.f103813b;
        Void voidR = (Void) obj;
        C59104x b = C39479cu.f103938a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
        ((C59052c) ((C59052c) b).mo56372aa(53596)).mo56386p("Shutdown finished");
        cuVar.f103974y = C58836b.f156633a;
        C58833ax axVar = cuVar.f103975z;
        C39636r rVar = new C39636r();
        rVar.f104346a = str;
        rVar.mo41791b(C39389ae.RECONFIG_HOTWORD_DETECTORS);
        return cuVar.mo41844e((C39767h) cuVar.f103975z.mo56107c(), axVar, false, (C39393ai) null, rVar.mo41790a());
    }
}
