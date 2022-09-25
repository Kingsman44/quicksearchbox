package com.google.android.apps.search.podcasts.player.impl;

import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.MediaSessionCompat;
import android.support.p031v4.media.session.PlaybackStateCompat;
import androidx.media3.common.C2590aq;
import androidx.media3.common.C2646bh;
import com.google.android.apps.search.podcasts.p10572j.C140418b;
import com.google.android.libraries.p1623at.p1632e.C19559g;

/* renamed from: com.google.android.apps.search.podcasts.player.impl.x */
/* compiled from: PG */
final class C140845x implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C140806an f382471a;

    /* renamed from: b */
    final /* synthetic */ long f382472b;

    public C140845x(C140806an anVar, long j) {
        this.f382471a = anVar;
        this.f382472b = j;
    }

    public final void run() {
        C0320v vVar;
        PlaybackStateCompat f;
        C140806an anVar = this.f382471a;
        long j = this.f382472b;
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
                    bhVar.mo6268an(aa, j);
                }
            } else if (bhVar.mo6276av()) {
                if (bhVar.mo6005l() != -9223372036854775807L) {
                    j = Math.min(j, bhVar.mo6005l());
                }
                bhVar.mo5973A(bhVar.mo6254V(), Math.max(j, 0));
            }
        }
    }
}
