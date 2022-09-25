package com.google.android.apps.search.assistant.verticals.ambient.feedback;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.feedback.ae */
/* compiled from: PG */
class C130612ae extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f357719j = false;

    /* renamed from: k */
    private volatile C68314a f357720k;

    /* renamed from: l */
    private final Object f357721l = new Object();

    public C130612ae() {
        this.f2705f.mo3343a(new C130611ad(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo109753w().mo17653jN();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public C68314a mo109747v() {
        throw null;
    }

    /* renamed from: w */
    public final C68314a mo109753w() {
        if (this.f357720k == null) {
            synchronized (this.f357721l) {
                if (this.f357720k == null) {
                    this.f357720k = mo109747v();
                }
            }
        }
        return this.f357720k;
    }
}
