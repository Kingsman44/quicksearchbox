package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.q */
/* compiled from: PG */
public final /* synthetic */ class C123553q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C123562z f341406a;

    public /* synthetic */ C123553q(C123562z zVar) {
        this.f341406a = zVar;
    }

    public final void run() {
        C123562z zVar = this.f341406a;
        zVar.f341435k.f339696a = true;
        C60870cx cxVar = zVar.f341433i;
        if (cxVar != null) {
            cxVar.cancel(false);
        }
    }
}
