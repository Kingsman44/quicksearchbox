package com.google.android.apps.search.assistant.surfaces.onboarding.oobe;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.oobe.b */
/* compiled from: PG */
class C126659b extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f348799j = false;

    /* renamed from: k */
    private volatile C68314a f348800k;

    /* renamed from: l */
    private final Object f348801l = new Object();

    public C126659b() {
        this.f2705f.mo3343a(new C126657a(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo107666v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo107666v() {
        if (this.f348800k == null) {
            synchronized (this.f348801l) {
                if (this.f348800k == null) {
                    this.f348800k = mo107665w();
                }
            }
        }
        return this.f348800k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C68314a mo107665w() {
        throw null;
    }
}
