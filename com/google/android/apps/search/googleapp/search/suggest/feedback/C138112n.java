package com.google.android.apps.search.googleapp.search.suggest.feedback;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.feedback.n */
/* compiled from: PG */
class C138112n extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f375774j = false;

    /* renamed from: k */
    private volatile C68314a f375775k;

    /* renamed from: l */
    private final Object f375776l = new Object();

    public C138112n() {
        this.f2705f.mo3343a(new C138111m(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo114152v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo114152v() {
        if (this.f375775k == null) {
            synchronized (this.f375776l) {
                if (this.f375775k == null) {
                    this.f375775k = mo114126w();
                }
            }
        }
        return this.f375775k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C68314a mo114126w() {
        throw null;
    }
}
