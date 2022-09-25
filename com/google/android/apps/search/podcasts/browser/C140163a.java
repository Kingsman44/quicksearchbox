package com.google.android.apps.search.podcasts.browser;

import androidx.media.C2416an;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.podcasts.browser.a */
/* compiled from: PG */
abstract class C140163a extends C2416an implements C68288b {

    /* renamed from: f */
    private volatile C68326i f380832f;

    /* renamed from: g */
    private final Object f380833g = new Object();

    /* renamed from: h */
    private boolean f380834h = false;

    /* renamed from: i */
    public final C68326i mo115482i() {
        if (this.f380832f == null) {
            synchronized (this.f380833g) {
                if (this.f380832f == null) {
                    this.f380832f = new C68326i(this);
                }
            }
        }
        return this.f380832f;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo115482i().mo17653jN();
    }

    public void onCreate() {
        if (!this.f380834h) {
            this.f380834h = true;
            mo115482i().mo17653jN();
            PodcastBrowserService podcastBrowserService = (PodcastBrowserService) this;
        }
        super.onCreate();
    }
}
