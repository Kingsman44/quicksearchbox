package com.google.android.apps.search.podcasts.player.impl;

import android.support.p031v4.media.session.C0286ac;
import android.support.p031v4.media.session.MediaSessionCompat;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.podcasts.player.impl.h */
/* compiled from: PG */
final class C140829h implements Callable {

    /* renamed from: a */
    final /* synthetic */ C140806an f382453a;

    public C140829h(C140806an anVar) {
        this.f382453a = anVar;
    }

    public final /* synthetic */ Object call() {
        C140806an anVar = this.f382453a;
        if (anVar.f382383u == null) {
            anVar.mo115912B();
        }
        MediaSessionCompat mediaSessionCompat = this.f382453a.f382383u;
        if (mediaSessionCompat != null) {
            return ((C0286ac) mediaSessionCompat.f982b).f1014b;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
