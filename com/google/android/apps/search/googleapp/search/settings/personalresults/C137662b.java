package com.google.android.apps.search.googleapp.search.settings.personalresults;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.personalresults.b */
/* compiled from: PG */
class C137662b extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f374450j = false;

    /* renamed from: k */
    private volatile C68314a f374451k;

    /* renamed from: l */
    private final Object f374452l = new Object();

    public C137662b() {
        this.f2705f.mo3343a(new C137661a(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo113892v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo113892v() {
        if (this.f374451k == null) {
            synchronized (this.f374452l) {
                if (this.f374451k == null) {
                    this.f374451k = mo113891w();
                }
            }
        }
        return this.f374451k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C68314a mo113891w() {
        throw null;
    }
}
