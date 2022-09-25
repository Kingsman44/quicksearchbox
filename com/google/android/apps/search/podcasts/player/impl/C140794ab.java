package com.google.android.apps.search.podcasts.player.impl;

import androidx.media3.common.C2646bh;
import com.google.android.apps.search.podcasts.player.C140784d;

/* renamed from: com.google.android.apps.search.podcasts.player.impl.ab */
/* compiled from: PG */
final class C140794ab implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C140806an f382307a;

    /* renamed from: b */
    final /* synthetic */ float f382308b;

    public C140794ab(C140806an anVar, float f) {
        this.f382307a = anVar;
        this.f382308b = f;
    }

    public final void run() {
        C140806an anVar = this.f382307a;
        C2646bh bhVar = anVar.f382385w;
        if (bhVar != null) {
            float f = this.f382308b;
            bhVar.mo6269ao(f);
            C140784d dVar = anVar.f382328C;
            anVar.f382328C = new C140784d(f, dVar != null ? dVar.f382276b : false);
            anVar.mo115919x(false);
        }
    }
}
