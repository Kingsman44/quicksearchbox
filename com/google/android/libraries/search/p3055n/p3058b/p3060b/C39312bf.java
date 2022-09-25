package com.google.android.libraries.search.p3055n.p3058b.p3060b;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.n.b.b.bf */
/* compiled from: PG */
public final /* synthetic */ class C39312bf implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C39318bl f103551a;

    public /* synthetic */ C39312bf(C39318bl blVar) {
        this.f103551a = blVar;
    }

    public final C60870cx apply(Object obj) {
        C39318bl blVar = this.f103551a;
        Exception exc = (Exception) obj;
        C59104x c = C39319bm.f103564a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SodaAsrFrontendService");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(exc)).mo56372aa(53453)).mo56389s("#handleUpdateRequest failed: %s", exc.getMessage());
        return blVar.mo41768d(exc);
    }
}
