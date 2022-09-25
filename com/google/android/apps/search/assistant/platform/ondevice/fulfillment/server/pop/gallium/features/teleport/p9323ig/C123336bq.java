package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C122999at;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123047cn;
import com.google.common.util.concurrent.C60826bg;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.bq */
/* compiled from: PG */
public final /* synthetic */ class C123336bq implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C123339bt f341092a;

    /* renamed from: b */
    public final /* synthetic */ Supplier f341093b;

    public /* synthetic */ C123336bq(C123339bt btVar, Supplier supplier) {
        this.f341092a = btVar;
        this.f341093b = supplier;
    }

    public final void run() {
        C123339bt btVar = this.f341092a;
        C122999at a = C123339bt.m202704a(((C123334bo) this.f341093b).f341087a);
        synchronized (btVar) {
            btVar.f341097b = a;
        }
        C123047cn.m202382b(a.mo105816b(), C123338bs.f341095a, C60826bg.f164896a);
    }
}
