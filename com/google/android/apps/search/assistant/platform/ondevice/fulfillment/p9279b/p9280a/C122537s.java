package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.p9280a;

import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17597g;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.b.a.s */
/* compiled from: PG */
public final /* synthetic */ class C122537s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f339659a;

    /* renamed from: b */
    public final /* synthetic */ C17597g f339660b;

    public /* synthetic */ C122537s(C60870cx cxVar, C17597g gVar) {
        this.f339659a = cxVar;
        this.f339660b = gVar;
    }

    public final void run() {
        C60870cx cxVar = this.f339659a;
        C17597g gVar = this.f339660b;
        if (cxVar.isCancelled()) {
            gVar.mo20121a();
        }
    }
}
