package com.google.android.apps.gsa.staticplugins.opa.p8296ar;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.assistant.p3803ag.p3804a.C48864g;
import com.google.assistant.p3803ag.p3804a.C48865h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ar.g */
/* compiled from: PG */
public final /* synthetic */ class C107439g implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C107440h f298979a;

    /* renamed from: b */
    public final /* synthetic */ C48865h f298980b;

    public /* synthetic */ C107439g(C107440h hVar, C48865h hVar2) {
        this.f298979a = hVar;
        this.f298980b = hVar2;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C107440h hVar = this.f298979a;
        C48865h hVar2 = this.f298980b;
        Exception exc = (Exception) obj;
        C59104x d = C107440h.f298981a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ClientActionListener");
        C59052c cVar = (C59052c) ((C59052c) ((C59052c) d).mo56382g(exc)).mo56372aa(25350);
        C48864g a = C48864g.m85285a(hVar2.f126460d);
        if (a == null) {
            a = C48864g.TYPE_UNSPECIFIED;
        }
        cVar.mo56389s("failed to handle clientAction payload of type %s", a.name());
        hVar.f298983c.mo96004d(hVar2, exc.getClass().getSimpleName());
    }
}
