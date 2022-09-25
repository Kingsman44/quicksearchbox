package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.search.n.c.a.bm */
/* compiled from: PG */
public final /* synthetic */ class C39436bm implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C39479cu f103820a;

    /* renamed from: b */
    public final /* synthetic */ C39393ai f103821b;

    /* renamed from: c */
    public final /* synthetic */ C39411b f103822c;

    public /* synthetic */ C39436bm(C39479cu cuVar, C39393ai aiVar, C39411b bVar) {
        this.f103820a = cuVar;
        this.f103821b = aiVar;
        this.f103822c = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C39479cu cuVar = this.f103820a;
        C39393ai aiVar = this.f103821b;
        C39411b bVar = this.f103822c;
        C59104x b = C39479cu.f103938a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
        ((C59052c) ((C59052c) b).mo56372aa(53587)).mo56389s("#onError. After delay. Try to start recognition again after error %s", aiVar.mo41808a());
        return cuVar.f103955f.mo51512b(new C39440bq(cuVar, aiVar, bVar), cuVar.f103953d);
    }
}
