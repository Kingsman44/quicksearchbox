package com.google.android.apps.search.googleapp.incognito.education;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.incognito.education.b */
/* compiled from: PG */
class C136258b extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f371062j = false;

    /* renamed from: k */
    private volatile C68314a f371063k;

    /* renamed from: l */
    private final Object f371064l = new Object();

    public C136258b() {
        this.f2705f.mo3343a(new C136250a(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo112867v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo112867v() {
        if (this.f371063k == null) {
            synchronized (this.f371064l) {
                if (this.f371063k == null) {
                    this.f371063k = mo112865w();
                }
            }
        }
        return this.f371063k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C68314a mo112865w() {
        throw null;
    }
}
