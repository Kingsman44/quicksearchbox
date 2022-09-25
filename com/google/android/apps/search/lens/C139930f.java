package com.google.android.apps.search.lens;

import androidx.lifecycle.C2363bk;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.lens.f */
/* compiled from: PG */
class C139930f extends C139924b implements C68288b {

    /* renamed from: o */
    public boolean f380387o = false;

    /* renamed from: p */
    private volatile C68314a f380388p;

    /* renamed from: q */
    private final Object f380389q = new Object();

    public C139930f() {
        this.f2705f.mo3343a(new C139929e(this));
    }

    /* renamed from: B */
    public final C68314a mo115343B() {
        if (this.f380388p == null) {
            synchronized (this.f380389q) {
                if (this.f380388p == null) {
                    this.f380388p = mo115330C();
                }
            }
        }
        return this.f380388p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public C68314a mo115330C() {
        throw null;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo115343B().mo17653jN();
    }
}
