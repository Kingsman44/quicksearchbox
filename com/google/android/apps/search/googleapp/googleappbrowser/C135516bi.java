package com.google.android.apps.search.googleapp.googleappbrowser;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.bi */
/* compiled from: PG */
class C135516bi extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f369159j = false;

    /* renamed from: k */
    private volatile C68314a f369160k;

    /* renamed from: l */
    private final Object f369161l = new Object();

    public C135516bi() {
        this.f2705f.mo3343a(new C135515bh(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo112376w().mo17653jN();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public C68314a mo112345v() {
        throw null;
    }

    /* renamed from: w */
    public final C68314a mo112376w() {
        if (this.f369160k == null) {
            synchronized (this.f369161l) {
                if (this.f369160k == null) {
                    this.f369160k = mo112345v();
                }
            }
        }
        return this.f369160k;
    }
}
