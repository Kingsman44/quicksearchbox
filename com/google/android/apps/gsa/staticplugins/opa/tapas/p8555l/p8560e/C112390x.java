package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.x */
/* compiled from: PG */
public final /* synthetic */ class C112390x implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C112312ag f311827a;

    /* renamed from: b */
    public final /* synthetic */ C112344bl f311828b;

    public /* synthetic */ C112390x(C112312ag agVar, C112344bl blVar) {
        this.f311827a = agVar;
        this.f311828b = blVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C112312ag agVar = this.f311827a;
        C112344bl blVar = this.f311828b;
        Exception exc = (Exception) obj;
        synchronized (agVar) {
            agVar.mo99496e(blVar);
        }
        C59104x d = C112312ag.f311670b.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ReflectionOnline");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(exc)).mo56372aa(27678)).mo56386p("Unable to load reflection model, using empty model");
        agVar.f311685q.mo99076a(C111255r.REFLECTION_LOG, String.format("Unable to load reflection model, using empty model. %s", new Object[]{exc}));
    }
}
