package com.google.android.apps.gsa.staticplugins.bisto.p7481af;

import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9391a.C124539a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.af.p */
/* compiled from: PG */
public final /* synthetic */ class C95159p implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C95144aj f266248a;

    /* renamed from: b */
    public final /* synthetic */ Intent f266249b;

    /* renamed from: c */
    public final /* synthetic */ C124539a f266250c;

    public /* synthetic */ C95159p(C95144aj ajVar, C124539a aVar, Intent intent) {
        this.f266248a = ajVar;
        this.f266250c = aVar;
        this.f266249b = intent;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C95144aj ajVar = this.f266248a;
        C124539a aVar = this.f266250c;
        Intent intent = this.f266249b;
        C59104x c = C95144aj.f266188a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BistoWorker");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(18212)).mo56386p("Failed to get bistoDeviceInfo");
        aVar.mo106452a(intent);
        ajVar.mo89067H(intent, aVar, C95144aj.m157262I(aVar));
    }
}
