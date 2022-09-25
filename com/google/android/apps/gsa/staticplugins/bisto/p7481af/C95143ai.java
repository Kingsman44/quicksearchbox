package com.google.android.apps.gsa.staticplugins.bisto.p7481af;

import android.content.Intent;
import com.google.android.apps.gsa.shared.bisto.C89681t;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9391a.C124539a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.af.ai */
/* compiled from: PG */
final class C95143ai implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ Intent f266185a;

    /* renamed from: b */
    final /* synthetic */ C95144aj f266186b;

    /* renamed from: c */
    final /* synthetic */ C124539a f266187c;

    public C95143ai(C95144aj ajVar, C124539a aVar, Intent intent) {
        this.f266186b = ajVar;
        this.f266187c = aVar;
        this.f266185a = intent;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C95144aj.f266188a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "BistoWorker");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(18174)).mo56386p("Failed to get bisto device info.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C124548d dVar = (C124548d) obj;
        C89681t.m146050p(this.f266187c, this.f266186b.f266198f);
        C59104x b = C95144aj.f266188a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoWorker");
        ((C59052c) ((C59052c) b).mo56372aa(18175)).mo56386p("BDI fetch successful for BLE device.");
        this.f266186b.mo89066G(this.f266185a, this.f266187c);
    }
}
