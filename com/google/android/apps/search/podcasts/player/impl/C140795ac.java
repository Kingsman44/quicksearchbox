package com.google.android.apps.search.podcasts.player.impl;

import androidx.media3.common.C2646bh;
import androidx.media3.exoplayer.C2759ad;
import androidx.media3.exoplayer.C3268p;
import com.google.android.apps.search.podcasts.player.C140784d;

/* renamed from: com.google.android.apps.search.podcasts.player.impl.ac */
/* compiled from: PG */
final class C140795ac implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C140806an f382309a;

    /* renamed from: b */
    final /* synthetic */ boolean f382310b;

    public C140795ac(C140806an anVar, boolean z) {
        this.f382309a = anVar;
        this.f382310b = z;
    }

    public final void run() {
        C3268p L;
        C2646bh bhVar = this.f382309a.f382385w;
        C2759ad adVar = bhVar instanceof C2759ad ? (C2759ad) bhVar : null;
        if (adVar != null && (L = adVar.mo6461L()) != null) {
            boolean z = this.f382310b;
            C140806an anVar = this.f382309a;
            L.mo6470q(z);
            C140784d dVar = anVar.f382328C;
            anVar.f382328C = new C140784d(dVar != null ? dVar.f382275a : 1.0f, z);
            anVar.mo115919x(false);
        }
    }
}
