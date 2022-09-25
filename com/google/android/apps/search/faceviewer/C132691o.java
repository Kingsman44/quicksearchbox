package com.google.android.apps.search.faceviewer;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.faceviewer.o */
/* compiled from: PG */
class C132691o extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f362084j = false;

    /* renamed from: k */
    private volatile C68314a f362085k;

    /* renamed from: l */
    private final Object f362086l = new Object();

    public C132691o() {
        this.f2705f.mo3343a(new C132690n(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo110880w().mo17653jN();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public C68314a mo110872v() {
        throw null;
    }

    /* renamed from: w */
    public final C68314a mo110880w() {
        if (this.f362085k == null) {
            synchronized (this.f362086l) {
                if (this.f362085k == null) {
                    this.f362085k = mo110872v();
                }
            }
        }
        return this.f362085k;
    }
}
