package com.google.android.apps.search.podcasts.player.impl;

import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.MediaSessionCompat;
import android.support.p031v4.media.session.PlaybackStateCompat;
import androidx.media3.common.C2590aq;
import androidx.media3.common.C2646bh;
import com.google.android.apps.search.podcasts.p10572j.C140418b;
import com.google.android.libraries.p1623at.p1632e.C19559g;

/* renamed from: com.google.android.apps.search.podcasts.player.impl.u */
/* compiled from: PG */
final class C140842u implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C140806an f382468a;

    public C140842u(C140806an anVar) {
        this.f382468a = anVar;
    }

    public final void run() {
        C0320v vVar;
        PlaybackStateCompat f;
        C140806an anVar = this.f382468a;
        C19559g.m37304c();
        C2646bh bhVar = anVar.f382385w;
        if (bhVar != null) {
            C140418b bVar = anVar.f382339N;
            if (bVar != null) {
                MediaSessionCompat mediaSessionCompat = anVar.f382383u;
                Integer num = null;
                if (!(mediaSessionCompat == null || (vVar = mediaSessionCompat.f983c) == null || (f = vVar.mo1038f()) == null)) {
                    num = Integer.valueOf(f.f994a);
                }
                bVar.mo115659a(C140418b.m228130b(num), bhVar.mo6004k());
            }
            if (bhVar.mo5998e() == 1) {
                C2590aq aa = bhVar.mo6256aa();
                if (aa != null) {
                    bhVar.mo6268an(aa, Math.max(0, bhVar.mo6004k() - bhVar.mo6007n()));
                }
            } else if (bhVar.mo6276av()) {
                bhVar.mo6261af();
            }
        }
    }
}
