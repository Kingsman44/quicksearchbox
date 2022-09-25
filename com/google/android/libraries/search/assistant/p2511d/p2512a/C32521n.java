package com.google.android.libraries.search.assistant.p2511d.p2512a;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.assistant.d.a.n */
/* compiled from: PG */
public final /* synthetic */ class C32521n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C32525r f87119a;

    /* renamed from: b */
    public final /* synthetic */ C32510c f87120b;

    public /* synthetic */ C32521n(C32525r rVar, C32510c cVar) {
        this.f87119a = rVar;
        this.f87120b = cVar;
    }

    public final void run() {
        C60870cx cxVar;
        C32525r rVar = this.f87119a;
        C32510c cVar = this.f87120b;
        if (!rVar.f87126c && (cxVar = (C60870cx) rVar.f87127d.remove(Long.valueOf(cVar.f87091d))) != null) {
            cxVar.cancel(false);
        }
    }
}
