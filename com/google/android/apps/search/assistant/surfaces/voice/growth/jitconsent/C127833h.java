package com.google.android.apps.search.assistant.surfaces.voice.growth.jitconsent;

import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.jitconsent.h */
/* compiled from: PG */
final class C127833h implements C45987ay {

    /* renamed from: a */
    final /* synthetic */ C127834i f351835a;

    public C127833h(C127834i iVar) {
        this.f351835a = iVar;
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        C58976aa aaVar = C58975e.f156826a;
        C127834i iVar = this.f351835a;
        C60870cx a = iVar.f351838c.mo50214a(awVar.f120815a.f120816a);
        C127832g gVar = new C127832g(this, awVar);
        iVar.f351842g = C60922j.m93044g(a, C47810es.m84963c(gVar), this.f351835a.f351841f);
        C46459k.m82829b(this.f351835a.f351842g, "Failed to process account change in JitConsentFlowActivityPeer.", new Object[0]);
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        C59104x c = C127834i.f351836a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "JitConsentAct");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(37613)).mo56386p("Account error.");
        this.f351835a.f351837b.finish();
        this.f351835a.f351837b.overridePendingTransition(0, 0);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final void mo19985d(C45986ax axVar) {
    }
}
