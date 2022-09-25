package com.google.android.apps.search.googleapp.search.settings.adspersonalization;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.adspersonalization.s */
/* compiled from: PG */
class C137584s extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f374222j = false;

    /* renamed from: k */
    private volatile C68314a f374223k;

    /* renamed from: l */
    private final Object f374224l = new Object();

    public C137584s() {
        this.f2705f.mo3343a(new C137583r(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo113835w().mo17653jN();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public C68314a mo113827v() {
        throw null;
    }

    /* renamed from: w */
    public final C68314a mo113835w() {
        if (this.f374223k == null) {
            synchronized (this.f374224l) {
                if (this.f374223k == null) {
                    this.f374223k = mo113827v();
                }
            }
        }
        return this.f374223k;
    }
}
