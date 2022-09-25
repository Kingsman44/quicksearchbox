package com.google.android.libraries.assistant.auto.tng.media.mediabrowser;

import androidx.media.C2416an;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.mediabrowser.g */
/* compiled from: PG */
abstract class C14045g extends C2416an implements C68288b {

    /* renamed from: f */
    private volatile C68326i f42668f;

    /* renamed from: g */
    private final Object f42669g = new Object();

    /* renamed from: h */
    private boolean f42670h = false;

    /* renamed from: i */
    public final C68326i mo21392i() {
        if (this.f42668f == null) {
            synchronized (this.f42669g) {
                if (this.f42668f == null) {
                    this.f42668f = new C68326i(this);
                }
            }
        }
        return this.f42668f;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo21392i().mo17653jN();
    }

    public void onCreate() {
        if (!this.f42670h) {
            this.f42670h = true;
            mo21392i().mo17653jN();
            NewsMediaBrowserService newsMediaBrowserService = (NewsMediaBrowserService) this;
        }
        super.onCreate();
    }
}
