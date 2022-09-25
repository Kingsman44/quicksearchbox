package com.google.android.apps.search.googleapp.discover.secondscreen;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.discover.secondscreen.b */
/* compiled from: PG */
class C134611b extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f366573j = false;

    /* renamed from: k */
    private volatile C68314a f366574k;

    /* renamed from: l */
    private final Object f366575l = new Object();

    public C134611b() {
        this.f2705f.mo3343a(new C134610a(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo111844v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo111844v() {
        if (this.f366574k == null) {
            synchronized (this.f366575l) {
                if (this.f366574k == null) {
                    this.f366574k = mo111843w();
                }
            }
        }
        return this.f366574k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C68314a mo111843w() {
        throw null;
    }
}
