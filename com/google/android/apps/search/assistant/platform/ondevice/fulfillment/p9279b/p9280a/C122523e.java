package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.p9280a;

import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17597g;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.b.a.e */
/* compiled from: PG */
public final /* synthetic */ class C122523e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f339634a;

    /* renamed from: b */
    public final /* synthetic */ C17597g f339635b;

    public /* synthetic */ C122523e(C60870cx cxVar, C17597g gVar) {
        this.f339634a = cxVar;
        this.f339635b = gVar;
    }

    public final void run() {
        C60870cx cxVar = this.f339634a;
        C17597g gVar = this.f339635b;
        if (cxVar.isCancelled()) {
            gVar.mo20121a();
        }
    }
}
