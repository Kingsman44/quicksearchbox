package com.google.android.apps.search.assistant.surfaces.voice.deeplinks.deeplinktrampolineactivity;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.deeplinks.deeplinktrampolineactivity.j */
/* compiled from: PG */
class C127402j extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f350811j = false;

    /* renamed from: k */
    private volatile C68314a f350812k;

    /* renamed from: l */
    private final Object f350813l = new Object();

    public C127402j() {
        this.f2705f.mo3343a(new C127401i(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo108050w().mo17653jN();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public C68314a mo108044v() {
        throw null;
    }

    /* renamed from: w */
    public final C68314a mo108050w() {
        if (this.f350812k == null) {
            synchronized (this.f350813l) {
                if (this.f350812k == null) {
                    this.f350812k = mo108044v();
                }
            }
        }
        return this.f350812k;
    }
}
