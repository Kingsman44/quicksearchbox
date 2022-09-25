package com.google.apps.tiktok.concurrent;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.apps.tiktok.concurrent.z */
/* compiled from: PG */
public final /* synthetic */ class C46474z implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f121619a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f121620b;

    public /* synthetic */ C46474z(C60870cx cxVar, C60870cx cxVar2) {
        this.f121619a = cxVar;
        this.f121620b = cxVar2;
    }

    public final void run() {
        C60870cx cxVar = this.f121619a;
        C60870cx cxVar2 = this.f121620b;
        if (cxVar.isCancelled()) {
            cxVar2.cancel(true);
        }
    }
}
