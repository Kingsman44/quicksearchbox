package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone;

import android.telecom.InCallService;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone.m */
/* compiled from: PG */
class C14914m extends InCallService implements C68288b {

    /* renamed from: a */
    private volatile C68326i f44840a;

    /* renamed from: b */
    private final Object f44841b = new Object();

    /* renamed from: c */
    private boolean f44842c = false;

    /* renamed from: a */
    public final C68326i mo21840a() {
        if (this.f44840a == null) {
            synchronized (this.f44841b) {
                if (this.f44840a == null) {
                    this.f44840a = new C68326i(this);
                }
            }
        }
        return this.f44840a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo21840a().mo17653jN();
    }

    public void onCreate() {
        if (!this.f44842c) {
            this.f44842c = true;
            mo21840a().mo17653jN();
            MorrisInCallService morrisInCallService = (MorrisInCallService) this;
        }
        super.onCreate();
    }
}
