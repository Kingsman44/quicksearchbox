package com.google.android.apps.search.weather;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.weather.b */
/* compiled from: PG */
class C142057b extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f385433j = false;

    /* renamed from: k */
    private volatile C68314a f385434k;

    /* renamed from: l */
    private final Object f385435l = new Object();

    public C142057b() {
        this.f2705f.mo3343a(new C142047a(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo116994v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo116994v() {
        if (this.f385434k == null) {
            synchronized (this.f385435l) {
                if (this.f385434k == null) {
                    this.f385434k = mo116989w();
                }
            }
        }
        return this.f385434k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C68314a mo116989w() {
        throw null;
    }
}
