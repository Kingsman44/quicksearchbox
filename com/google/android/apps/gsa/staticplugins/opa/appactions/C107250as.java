package com.google.android.apps.gsa.staticplugins.opa.appactions;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.as */
/* compiled from: PG */
class C107250as extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f298519j = false;

    /* renamed from: k */
    private volatile C68314a f298520k;

    /* renamed from: l */
    private final Object f298521l = new Object();

    public C107250as() {
        this.f2705f.mo3343a(new C107249ar(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo95873w().mo17653jN();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public C68314a mo95840v() {
        throw null;
    }

    /* renamed from: w */
    public final C68314a mo95873w() {
        if (this.f298520k == null) {
            synchronized (this.f298521l) {
                if (this.f298520k == null) {
                    this.f298520k = mo95840v();
                }
            }
        }
        return this.f298520k;
    }
}
