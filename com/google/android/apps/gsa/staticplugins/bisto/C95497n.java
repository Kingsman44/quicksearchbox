package com.google.android.apps.gsa.staticplugins.bisto;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.n */
/* compiled from: PG */
public final /* synthetic */ class C95497n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ BistoRealService f267231a;

    public /* synthetic */ C95497n(BistoRealService bistoRealService) {
        this.f267231a = bistoRealService;
    }

    public final void run() {
        BistoRealService bistoRealService = this.f267231a;
        C59104x b = BistoRealService.f264670a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoRealService");
        ((C59052c) ((C59052c) b).mo56372aa(14540)).mo56386p("requestDestroy");
        bistoRealService.mo88554b();
        bistoRealService.stopForeground(true);
        bistoRealService.stopSelf(bistoRealService.f264699w);
    }
}
