package com.google.android.apps.search.webglide.navroot;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.webglide.navroot.b */
/* compiled from: PG */
class C142227b extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f385847j = false;

    /* renamed from: k */
    private volatile C68314a f385848k;

    /* renamed from: l */
    private final Object f385849l = new Object();

    public C142227b() {
        this.f2705f.mo3343a(new C142226a(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo117066v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo117066v() {
        if (this.f385848k == null) {
            synchronized (this.f385849l) {
                if (this.f385848k == null) {
                    this.f385848k = mo117065w();
                }
            }
        }
        return this.f385848k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C68314a mo117065w() {
        throw null;
    }
}
