package com.google.android.apps.search.assistant.surfaces.appactions.service;

import android.app.Service;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.appactions.service.e */
/* compiled from: PG */
abstract class C124373e extends Service implements C68288b {

    /* renamed from: a */
    private volatile C68326i f343295a;

    /* renamed from: b */
    private final Object f343296b = new Object();

    /* renamed from: c */
    private boolean f343297c = false;

    /* renamed from: b */
    public final C68326i mo106398b() {
        if (this.f343295a == null) {
            synchronized (this.f343296b) {
                if (this.f343295a == null) {
                    this.f343295a = new C68326i(this);
                }
            }
        }
        return this.f343295a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo106398b().mo17653jN();
    }

    public void onCreate() {
        if (!this.f343297c) {
            this.f343297c = true;
            mo106398b().mo17653jN();
            AppShortcutsService appShortcutsService = (AppShortcutsService) this;
        }
        super.onCreate();
    }
}
