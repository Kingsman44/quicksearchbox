package com.google.android.apps.search.assistant.platform.appintegration.mosaic.endpoint;

import androidx.lifecycle.C2395z;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.mosaic.endpoint.a */
/* compiled from: PG */
class C119647a extends C2395z implements C68288b {

    /* renamed from: b */
    private volatile C68326i f333436b;

    /* renamed from: c */
    private final Object f333437c = new Object();

    /* renamed from: d */
    private boolean f333438d = false;

    /* renamed from: a */
    public final C68326i mo104470a() {
        if (this.f333436b == null) {
            synchronized (this.f333437c) {
                if (this.f333436b == null) {
                    this.f333436b = new C68326i(this);
                }
            }
        }
        return this.f333436b;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo104470a().mo17653jN();
    }

    public void onCreate() {
        if (!this.f333438d) {
            this.f333438d = true;
            mo104470a().mo17653jN();
            MosaicService mosaicService = (MosaicService) this;
        }
        super.onCreate();
    }
}
