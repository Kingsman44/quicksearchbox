package com.google.android.libraries.assistant.auto.tng.gmm.grpc.startup;

import androidx.lifecycle.C2395z;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.assistant.auto.tng.gmm.grpc.startup.h */
/* compiled from: PG */
class C13633h extends C2395z implements C68288b {

    /* renamed from: b */
    private volatile C68326i f41671b;

    /* renamed from: c */
    private final Object f41672c = new Object();

    /* renamed from: d */
    private boolean f41673d = false;

    /* renamed from: b */
    public final C68326i mo21195b() {
        if (this.f41671b == null) {
            synchronized (this.f41672c) {
                if (this.f41671b == null) {
                    this.f41671b = new C68326i(this);
                }
            }
        }
        return this.f41671b;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo21195b().mo17653jN();
    }

    public void onCreate() {
        if (!this.f41673d) {
            this.f41673d = true;
            mo21195b().mo17653jN();
            GmmEndpointService gmmEndpointService = (GmmEndpointService) this;
        }
        super.onCreate();
    }
}
