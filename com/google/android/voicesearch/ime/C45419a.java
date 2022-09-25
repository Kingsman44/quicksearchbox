package com.google.android.voicesearch.ime;

import android.inputmethodservice.InputMethodService;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.voicesearch.ime.a */
/* compiled from: PG */
class C45419a extends InputMethodService implements C68288b {

    /* renamed from: a */
    private volatile C68326i f118797a;

    /* renamed from: b */
    private final Object f118798b = new Object();

    /* renamed from: c */
    private boolean f118799c = false;

    /* renamed from: a */
    public final C68326i mo49545a() {
        if (this.f118797a == null) {
            synchronized (this.f118798b) {
                if (this.f118797a == null) {
                    this.f118797a = new C68326i(this);
                }
            }
        }
        return this.f118797a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo49545a().mo17653jN();
    }

    public void onCreate() {
        if (!this.f118799c) {
            this.f118799c = true;
            mo49545a().mo17653jN();
            VoiceInputMethodService voiceInputMethodService = (VoiceInputMethodService) this;
        }
        super.onCreate();
    }
}
