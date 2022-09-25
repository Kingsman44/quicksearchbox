package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7469c;

import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95297c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60066jo;
import com.google.common.p4552o.C60069jr;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.c.b */
/* compiled from: PG */
public final /* synthetic */ class C94930b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C94931c f265547a;

    public /* synthetic */ C94930b(C94931c cVar) {
        this.f265547a = cVar;
    }

    public final void run() {
        C94931c cVar = this.f265547a;
        C59104x d = C94931c.f265548a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "BistoCryptoDataHandler");
        ((C59052c) ((C59052c) d).mo56372aa(17640)).mo56389s("[%s] Connection ping timer has timed out", cVar.f265552e);
        C95297c cVar2 = cVar.f265553f;
        C60066jo joVar = (C60066jo) C60069jr.f162379n.createBuilder();
        joVar.copyOnWrite();
        C60069jr jrVar = (C60069jr) joVar.instance;
        jrVar.f162383c = 13;
        jrVar.f162381a |= 2;
        cVar2.mo89225a(joVar);
        cVar.f265550c.mo88741g();
    }
}
