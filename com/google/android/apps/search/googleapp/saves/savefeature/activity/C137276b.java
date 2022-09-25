package com.google.android.apps.search.googleapp.saves.savefeature.activity;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.activity.b */
/* compiled from: PG */
class C137276b extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f373466j = false;

    /* renamed from: k */
    private volatile C68314a f373467k;

    /* renamed from: l */
    private final Object f373468l = new Object();

    public C137276b() {
        this.f2705f.mo3343a(new C137275a(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo113606v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo113606v() {
        if (this.f373467k == null) {
            synchronized (this.f373468l) {
                if (this.f373467k == null) {
                    this.f373467k = mo113605w();
                }
            }
        }
        return this.f373467k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C68314a mo113605w() {
        throw null;
    }
}
