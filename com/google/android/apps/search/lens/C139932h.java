package com.google.android.apps.search.lens;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.lens.h */
/* compiled from: PG */
class C139932h extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f380391j = false;

    /* renamed from: k */
    private volatile C68314a f380392k;

    /* renamed from: l */
    private final Object f380393l = new Object();

    public C139932h() {
        this.f2705f.mo3343a(new C139931g(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo115344v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo115344v() {
        if (this.f380392k == null) {
            synchronized (this.f380393l) {
                if (this.f380392k == null) {
                    this.f380392k = mo115334w();
                }
            }
        }
        return this.f380392k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C68314a mo115334w() {
        throw null;
    }
}
