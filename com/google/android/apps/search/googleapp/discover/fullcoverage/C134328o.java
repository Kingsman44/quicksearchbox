package com.google.android.apps.search.googleapp.discover.fullcoverage;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.discover.fullcoverage.o */
/* compiled from: PG */
class C134328o extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f365886j = false;

    /* renamed from: k */
    private volatile C68314a f365887k;

    /* renamed from: l */
    private final Object f365888l = new Object();

    public C134328o() {
        this.f2705f.mo3343a(new C134327n(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo111735w().mo17653jN();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public C68314a mo111727v() {
        throw null;
    }

    /* renamed from: w */
    public final C68314a mo111735w() {
        if (this.f365887k == null) {
            synchronized (this.f365888l) {
                if (this.f365887k == null) {
                    this.f365887k = mo111727v();
                }
            }
        }
        return this.f365887k;
    }
}
