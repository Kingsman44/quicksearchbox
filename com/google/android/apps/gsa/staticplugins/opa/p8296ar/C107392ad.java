package com.google.android.apps.gsa.staticplugins.opa.p8296ar;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.assistant.p3803ag.p3804a.C48864g;
import com.google.assistant.p3803ag.p3804a.C48865h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ar.ad */
/* compiled from: PG */
public final /* synthetic */ class C107392ad implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C107394af f298888a;

    /* renamed from: b */
    public final /* synthetic */ C48865h f298889b;

    public /* synthetic */ C107392ad(C107394af afVar, C48865h hVar) {
        this.f298888a = afVar;
        this.f298889b = hVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C107394af afVar = this.f298888a;
        C48865h hVar = this.f298889b;
        Exception exc = (Exception) obj;
        C59104x d = C107394af.f298891a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "PAPIclient");
        C59052c cVar = (C59052c) ((C59052c) ((C59052c) d).mo56382g(exc)).mo56372aa(25374);
        C48864g a = C48864g.m85285a(hVar.f126460d);
        if (a == null) {
            a = C48864g.TYPE_UNSPECIFIED;
        }
        cVar.mo56389s("failed to handle clientAction of type %s with failure", a.name());
        afVar.f298893c.mo96004d(hVar, exc.getClass().getSimpleName());
    }
}
