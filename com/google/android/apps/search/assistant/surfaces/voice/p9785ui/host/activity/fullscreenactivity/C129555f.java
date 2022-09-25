package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.activity.fullscreenactivity;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.activity.fullscreenactivity.f */
/* compiled from: PG */
class C129555f extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f355622j = false;

    /* renamed from: k */
    private volatile C68314a f355623k;

    /* renamed from: l */
    private final Object f355624l = new Object();

    public C129555f() {
        this.f2705f.mo3343a(new C129554e(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo109096w().mo17653jN();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public C68314a mo109093v() {
        throw null;
    }

    /* renamed from: w */
    public final C68314a mo109096w() {
        if (this.f355623k == null) {
            synchronized (this.f355624l) {
                if (this.f355623k == null) {
                    this.f355623k = mo109093v();
                }
            }
        }
        return this.f355623k;
    }
}
