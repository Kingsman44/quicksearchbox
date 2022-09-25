package com.google.android.apps.search.podcasts.player.impl;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.podcasts.player.impl.ai */
/* compiled from: PG */
final class C140801ai implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C140806an f382320a;

    public C140801ai(C140806an anVar) {
        this.f382320a = anVar;
    }

    public final void run() {
        C140806an anVar = this.f382320a;
        anVar.f382331F = null;
        C60870cx cxVar = anVar.f382332G;
        if (cxVar != null) {
            cxVar.cancel(true);
        }
        C140806an anVar2 = this.f382320a;
        anVar2.f382332G = null;
        anVar2.mo115919x(false);
    }
}
