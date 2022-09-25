package com.google.android.apps.search.assistant.platform.appintegration.endpoint;

import androidx.lifecycle.C2395z;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.endpoint.c */
/* compiled from: PG */
class C119539c extends C2395z implements C68288b {

    /* renamed from: b */
    private volatile C68326i f333178b;

    /* renamed from: c */
    private final Object f333179c = new Object();

    /* renamed from: d */
    private boolean f333180d = false;

    /* renamed from: b */
    public final C68326i mo104424b() {
        if (this.f333178b == null) {
            synchronized (this.f333179c) {
                if (this.f333178b == null) {
                    this.f333178b = new C68326i(this);
                }
            }
        }
        return this.f333178b;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo104424b().mo17653jN();
    }

    public void onCreate() {
        if (!this.f333180d) {
            this.f333180d = true;
            mo104424b().mo17653jN();
            AppIntegrationService appIntegrationService = (AppIntegrationService) this;
        }
        super.onCreate();
    }
}
