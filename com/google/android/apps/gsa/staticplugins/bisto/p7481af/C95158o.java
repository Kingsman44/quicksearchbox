package com.google.android.apps.gsa.staticplugins.bisto.p7481af;

import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9391a.C124539a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124551g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.af.o */
/* compiled from: PG */
public final /* synthetic */ class C95158o implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C95144aj f266245a;

    /* renamed from: b */
    public final /* synthetic */ Intent f266246b;

    /* renamed from: c */
    public final /* synthetic */ C124539a f266247c;

    public /* synthetic */ C95158o(C95144aj ajVar, C124539a aVar, Intent intent) {
        this.f266245a = ajVar;
        this.f266247c = aVar;
        this.f266246b = intent;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C95144aj ajVar = this.f266245a;
        C124539a aVar = this.f266247c;
        Intent intent = this.f266246b;
        C124551g gVar = (C124551g) obj;
        C59104x b = C95144aj.f266188a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoWorker");
        ((C59052c) ((C59052c) b).mo56372aa(18211)).mo56386p("tryToForwardToBRS: Missing bistoDeviceInfo");
        aVar.mo106452a(intent);
        ajVar.mo89067H(intent, aVar, C95144aj.m157262I(aVar));
    }
}
