package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.ab */
/* compiled from: PG */
public final /* synthetic */ class C122566ab implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C122720au f339719a;

    public /* synthetic */ C122566ab(C122720au auVar) {
        this.f339719a = auVar;
    }

    public final void run() {
        C122720au auVar = this.f339719a;
        auVar.f340025m.f339696a = true;
        C60870cx cxVar = auVar.f340022j;
        if (cxVar != null) {
            cxVar.cancel(false);
        }
    }
}
