package com.google.android.apps.search.podcasts.player.impl;

import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.MediaSessionCompat;
import android.support.p031v4.media.session.PlaybackStateCompat;
import com.google.android.apps.search.podcasts.player.C140788f;
import com.google.android.apps.search.podcasts.player.C140789g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.player.impl.w */
/* compiled from: PG */
final class C140844w implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C140806an f382470a;

    public C140844w(C140806an anVar) {
        this.f382470a = anVar;
    }

    public final void run() {
        C0320v vVar;
        PlaybackStateCompat f;
        MediaSessionCompat mediaSessionCompat = this.f382470a.f382383u;
        boolean z = true;
        if (mediaSessionCompat == null || (vVar = mediaSessionCompat.f983c) == null || (f = vVar.mo1038f()) == null || f.f994a != 3) {
            C140788f fVar = this.f382470a.f382331F;
            if ((fVar != null ? fVar.f382287a : null) != C140789g.END_OF_TIME) {
                z = false;
            }
        }
        if (this.f382470a.f382330E != null) {
            C60870cx cxVar = this.f382470a.f382330E;
            C69664n.m101058d(cxVar);
            if (!cxVar.isDone()) {
                return;
            }
        }
        if (z) {
            C140806an anVar = this.f382470a;
            anVar.f382330E = C60856cj.m92902k(C47810es.m84965e(new C140843v(anVar)), 1, TimeUnit.SECONDS, this.f382470a.f382370h);
        }
    }
}
