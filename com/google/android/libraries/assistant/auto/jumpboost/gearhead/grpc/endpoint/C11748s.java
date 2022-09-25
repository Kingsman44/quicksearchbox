package com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.endpoint;

import androidx.lifecycle.C2395z;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.endpoint.s */
/* compiled from: PG */
class C11748s extends C2395z implements C68288b {

    /* renamed from: b */
    private volatile C68326i f37819b;

    /* renamed from: c */
    private final Object f37820c = new Object();

    /* renamed from: d */
    private boolean f37821d = false;

    /* renamed from: b */
    public final C68326i mo20127b() {
        if (this.f37819b == null) {
            synchronized (this.f37820c) {
                if (this.f37819b == null) {
                    this.f37819b = new C68326i(this);
                }
            }
        }
        return this.f37819b;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo20127b().mo17653jN();
    }

    public void onCreate() {
        if (!this.f37821d) {
            this.f37821d = true;
            mo20127b().mo17653jN();
            CarAssistantService carAssistantService = (CarAssistantService) this;
        }
        super.onCreate();
    }
}
