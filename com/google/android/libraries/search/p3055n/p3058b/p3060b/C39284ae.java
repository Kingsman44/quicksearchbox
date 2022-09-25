package com.google.android.libraries.search.p3055n.p3058b.p3060b;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.n.b.b.ae */
/* compiled from: PG */
public final /* synthetic */ class C39284ae implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C39319bm f103500a;

    /* renamed from: b */
    public final /* synthetic */ C70862aj f103501b;

    public /* synthetic */ C39284ae(C39319bm bmVar, C70862aj ajVar) {
        this.f103500a = bmVar;
        this.f103501b = ajVar;
    }

    public final C60870cx apply(Object obj) {
        C39319bm bmVar = this.f103500a;
        C70862aj ajVar = this.f103501b;
        Exception exc = (Exception) obj;
        C59104x c = C39319bm.f103564a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SodaAsrFrontendService");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(exc)).mo56372aa(53463)).mo56389s("#backgroundBiasingUpdate failed: %s", exc.getMessage());
        return bmVar.mo41772e(ajVar, exc.getMessage(), false);
    }
}
