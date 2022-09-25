package com.google.android.libraries.assistant.auto.tng.morris.service;

import android.app.Service;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.service.a */
/* compiled from: PG */
abstract class C15455a extends Service implements C68288b {

    /* renamed from: a */
    private volatile C68326i f46355a;

    /* renamed from: b */
    private final Object f46356b = new Object();

    /* renamed from: c */
    private boolean f46357c = false;

    /* renamed from: a */
    public final C68326i mo22348a() {
        if (this.f46355a == null) {
            synchronized (this.f46356b) {
                if (this.f46355a == null) {
                    this.f46355a = new C68326i(this);
                }
            }
        }
        return this.f46355a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo22348a().mo17653jN();
    }

    public void onCreate() {
        if (!this.f46357c) {
            this.f46357c = true;
            mo22348a().mo17653jN();
            MorrisService morrisService = (MorrisService) this;
        }
        super.onCreate();
    }
}
