package com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.d */
/* compiled from: PG */
class C126717d extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f348987j = false;

    /* renamed from: k */
    private volatile C68314a f348988k;

    /* renamed from: l */
    private final Object f348989l = new Object();

    public C126717d() {
        this.f2705f.mo3343a(new C126716c(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo107724v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo107724v() {
        if (this.f348988k == null) {
            synchronized (this.f348989l) {
                if (this.f348988k == null) {
                    this.f348988k = mo107681w();
                }
            }
        }
        return this.f348988k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C68314a mo107681w() {
        throw null;
    }
}
