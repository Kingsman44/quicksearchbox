package com.google.android.apps.search.podcasts.player.impl;

import androidx.media3.common.C2646bh;

/* renamed from: com.google.android.apps.search.podcasts.player.impl.ak */
/* compiled from: PG */
final class C140803ak implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C140806an f382323a;

    public C140803ak(C140806an anVar) {
        this.f382323a = anVar;
    }

    public final void run() {
        C2646bh bhVar = this.f382323a.f382385w;
        if (bhVar == null || !bhVar.mo5987O()) {
            this.f382323a.mo115920y();
            return;
        }
        C2646bh bhVar2 = this.f382323a.f382385w;
        if (bhVar2 != null) {
            bhVar2.mo6259ad();
        }
    }
}
