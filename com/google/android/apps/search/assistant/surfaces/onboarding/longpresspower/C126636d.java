package com.google.android.apps.search.assistant.surfaces.onboarding.longpresspower;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.longpresspower.d */
/* compiled from: PG */
class C126636d extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f348749j = false;

    /* renamed from: k */
    private volatile C68314a f348750k;

    /* renamed from: l */
    private final Object f348751l = new Object();

    public C126636d() {
        this.f2705f.mo3343a(new C126635c(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo107643v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo107643v() {
        if (this.f348750k == null) {
            synchronized (this.f348751l) {
                if (this.f348750k == null) {
                    this.f348750k = mo107641w();
                }
            }
        }
        return this.f348750k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C68314a mo107641w() {
        throw null;
    }
}
