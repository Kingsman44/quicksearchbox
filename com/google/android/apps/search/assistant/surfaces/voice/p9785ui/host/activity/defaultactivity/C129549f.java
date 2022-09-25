package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.activity.defaultactivity;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.activity.defaultactivity.f */
/* compiled from: PG */
class C129549f extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f355611j = false;

    /* renamed from: k */
    private volatile C68314a f355612k;

    /* renamed from: l */
    private final Object f355613l = new Object();

    public C129549f() {
        this.f2705f.mo3343a(new C129548e(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo109091w().mo17653jN();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public C68314a mo109088v() {
        throw null;
    }

    /* renamed from: w */
    public final C68314a mo109091w() {
        if (this.f355612k == null) {
            synchronized (this.f355613l) {
                if (this.f355612k == null) {
                    this.f355612k = mo109088v();
                }
            }
        }
        return this.f355612k;
    }
}
