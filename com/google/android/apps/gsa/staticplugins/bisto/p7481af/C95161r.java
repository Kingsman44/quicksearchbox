package com.google.android.apps.gsa.staticplugins.bisto.p7481af;

import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9391a.C124539a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.af.r */
/* compiled from: PG */
public final /* synthetic */ class C95161r implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C95144aj f266254a;

    /* renamed from: b */
    public final /* synthetic */ Intent f266255b;

    /* renamed from: c */
    public final /* synthetic */ C124539a f266256c;

    public /* synthetic */ C95161r(C95144aj ajVar, C124539a aVar, Intent intent) {
        this.f266254a = ajVar;
        this.f266256c = aVar;
        this.f266255b = intent;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C95144aj ajVar = this.f266254a;
        C124539a aVar = this.f266256c;
        Intent intent = this.f266255b;
        Exception exc = (Exception) obj;
        C59104x b = C95144aj.f266188a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoWorker");
        ((C59052c) ((C59052c) b).mo56372aa(18202)).mo56389s("Failed to get bistoDeviceInfo %s", aVar.f343619a.getAddress());
        ajVar.mo89064E(intent, aVar, C95144aj.m157262I(aVar));
    }
}
