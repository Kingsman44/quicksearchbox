package com.google.android.apps.search.googleapp.accounts.p10126ui;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.ad */
/* compiled from: PG */
class C133174ad extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f363005j = false;

    /* renamed from: k */
    private volatile C68314a f363006k;

    /* renamed from: l */
    private final Object f363007l = new Object();

    public C133174ad() {
        this.f2705f.mo3343a(new C133173ac(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo111010w().mo17653jN();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public C68314a mo111003v() {
        throw null;
    }

    /* renamed from: w */
    public final C68314a mo111010w() {
        if (this.f363006k == null) {
            synchronized (this.f363007l) {
                if (this.f363006k == null) {
                    this.f363006k = mo111003v();
                }
            }
        }
        return this.f363006k;
    }
}
