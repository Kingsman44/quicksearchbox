package com.google.android.apps.search.assistant.surfaces.voice.growth.learningcenter;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.learningcenter.l */
/* compiled from: PG */
class C127857l extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f351908j = false;

    /* renamed from: k */
    private volatile C68314a f351909k;

    /* renamed from: l */
    private final Object f351910l = new Object();

    public C127857l() {
        this.f2705f.mo3343a(new C127856k(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo108249w().mo17653jN();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public C68314a mo108236v() {
        throw null;
    }

    /* renamed from: w */
    public final C68314a mo108249w() {
        if (this.f351909k == null) {
            synchronized (this.f351910l) {
                if (this.f351909k == null) {
                    this.f351909k = mo108236v();
                }
            }
        }
        return this.f351909k;
    }
}
