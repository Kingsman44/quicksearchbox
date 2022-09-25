package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.server;

import androidx.lifecycle.C2395z;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.server.a */
/* compiled from: PG */
class C138319a extends C2395z implements C68288b {

    /* renamed from: b */
    private volatile C68326i f376341b;

    /* renamed from: c */
    private final Object f376342c = new Object();

    /* renamed from: d */
    private boolean f376343d = false;

    /* renamed from: a */
    public final C68326i mo114242a() {
        if (this.f376341b == null) {
            synchronized (this.f376342c) {
                if (this.f376341b == null) {
                    this.f376341b = new C68326i(this);
                }
            }
        }
        return this.f376341b;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo114242a().mo17653jN();
    }

    public void onCreate() {
        if (!this.f376343d) {
            this.f376343d = true;
            mo114242a().mo17653jN();
            OneSearchSuggestService oneSearchSuggestService = (OneSearchSuggestService) this;
        }
        super.onCreate();
    }
}
