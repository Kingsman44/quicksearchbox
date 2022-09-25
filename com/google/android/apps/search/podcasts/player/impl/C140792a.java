package com.google.android.apps.search.podcasts.player.impl;

import androidx.lifecycle.C2395z;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.podcasts.player.impl.a */
/* compiled from: PG */
class C140792a extends C2395z implements C68288b {

    /* renamed from: b */
    private volatile C68326i f382298b;

    /* renamed from: c */
    private final Object f382299c = new Object();

    /* renamed from: d */
    private boolean f382300d = false;

    /* renamed from: a */
    public final C68326i mo115901a() {
        if (this.f382298b == null) {
            synchronized (this.f382299c) {
                if (this.f382298b == null) {
                    this.f382298b = new C68326i(this);
                }
            }
        }
        return this.f382298b;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo115901a().mo17653jN();
    }

    public void onCreate() {
        if (!this.f382300d) {
            this.f382300d = true;
            mo115901a().mo17653jN();
            PodcastPlaybackService podcastPlaybackService = (PodcastPlaybackService) this;
        }
        super.onCreate();
    }
}
