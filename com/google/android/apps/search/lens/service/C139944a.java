package com.google.android.apps.search.lens.service;

import android.app.Service;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.lens.service.a */
/* compiled from: PG */
abstract class C139944a extends Service implements C68288b {

    /* renamed from: a */
    private volatile C68326i f380401a;

    /* renamed from: b */
    private final Object f380402b = new Object();

    /* renamed from: c */
    private boolean f380403c = false;

    /* renamed from: a */
    public final C68326i mo115352a() {
        if (this.f380401a == null) {
            synchronized (this.f380402b) {
                if (this.f380401a == null) {
                    this.f380401a = new C68326i(this);
                }
            }
        }
        return this.f380401a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo115352a().mo17653jN();
    }

    public void onCreate() {
        if (!this.f380403c) {
            this.f380403c = true;
            mo115352a().mo17653jN();
            LensService lensService = (LensService) this;
        }
        super.onCreate();
    }
}
