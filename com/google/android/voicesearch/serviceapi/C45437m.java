package com.google.android.voicesearch.serviceapi;

import android.speech.RecognitionService;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.voicesearch.serviceapi.m */
/* compiled from: PG */
abstract class C45437m extends RecognitionService implements C68288b {

    /* renamed from: a */
    private volatile C68326i f118837a;

    /* renamed from: b */
    private final Object f118838b = new Object();

    /* renamed from: c */
    private boolean f118839c = false;

    /* renamed from: b */
    public final C68326i mo49569b() {
        if (this.f118837a == null) {
            synchronized (this.f118838b) {
                if (this.f118837a == null) {
                    this.f118837a = new C68326i(this);
                }
            }
        }
        return this.f118837a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo49569b().mo17653jN();
    }

    public void onCreate() {
        if (!this.f118839c) {
            this.f118839c = true;
            mo49569b().mo17653jN();
            GoogleRecognitionService googleRecognitionService = (GoogleRecognitionService) this;
        }
        super.onCreate();
    }
}
