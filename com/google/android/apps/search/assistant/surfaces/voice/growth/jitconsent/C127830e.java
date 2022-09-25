package com.google.android.apps.search.assistant.surfaces.voice.growth.jitconsent;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.jitconsent.e */
/* compiled from: PG */
class C127830e extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f351830j = false;

    /* renamed from: k */
    private volatile C68314a f351831k;

    /* renamed from: l */
    private final Object f351832l = new Object();

    public C127830e() {
        this.f2705f.mo3343a(new C127829d(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo108230v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo108230v() {
        if (this.f351831k == null) {
            synchronized (this.f351832l) {
                if (this.f351831k == null) {
                    this.f351831k = mo108227w();
                }
            }
        }
        return this.f351831k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C68314a mo108227w() {
        throw null;
    }
}
