package com.google.apps.tiktok.media;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.google.android.libraries.p1623at.p1632e.C19559g;

/* renamed from: com.google.apps.tiktok.media.d */
/* compiled from: PG */
final class C47448d implements ComponentCallbacks2 {

    /* renamed from: a */
    final /* synthetic */ C47449e f123217a;

    public C47448d(C47449e eVar) {
        this.f123217a = eVar;
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        C19559g.m37304c();
        if (this.f123217a.f123218a != null) {
            if (i == 60 || i == 80) {
                C47449e eVar = this.f123217a;
                if (eVar.f123219b == 0) {
                    eVar.f123218a.mo11884s();
                }
            }
        }
    }
}
