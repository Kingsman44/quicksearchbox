package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.activity.transientactivity;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.activity.transientactivity.f */
/* compiled from: PG */
class C129561f extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f355633j = false;

    /* renamed from: k */
    private volatile C68314a f355634k;

    /* renamed from: l */
    private final Object f355635l = new Object();

    public C129561f() {
        this.f2705f.mo3343a(new C129560e(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo109101w().mo17653jN();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public C68314a mo109098v() {
        throw null;
    }

    /* renamed from: w */
    public final C68314a mo109101w() {
        if (this.f355634k == null) {
            synchronized (this.f355635l) {
                if (this.f355634k == null) {
                    this.f355634k = mo109098v();
                }
            }
        }
        return this.f355634k;
    }
}
