package com.google.android.libraries.storage.p3315b;

import com.google.common.util.concurrent.C60871cy;

/* renamed from: com.google.android.libraries.storage.b.l */
/* compiled from: PG */
public final /* synthetic */ class C42857l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C60871cy f112151a;

    /* renamed from: b */
    public final /* synthetic */ C42847bf f112152b;

    public /* synthetic */ C42857l(C60871cy cyVar, C42847bf bfVar) {
        this.f112151a = cyVar;
        this.f112152b = bfVar;
    }

    public final void run() {
        C60871cy cyVar = this.f112151a;
        C42847bf bfVar = this.f112152b;
        if (cyVar.isCancelled()) {
            bfVar.f112137a.cancel();
        }
    }
}
