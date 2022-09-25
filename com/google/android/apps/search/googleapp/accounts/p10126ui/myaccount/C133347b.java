package com.google.android.apps.search.googleapp.accounts.p10126ui.myaccount;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.myaccount.b */
/* compiled from: PG */
class C133347b extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f363363j = false;

    /* renamed from: k */
    private volatile C68314a f363364k;

    /* renamed from: l */
    private final Object f363365l = new Object();

    public C133347b() {
        this.f2705f.mo3343a(new C133346a(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo111090v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo111090v() {
        if (this.f363364k == null) {
            synchronized (this.f363365l) {
                if (this.f363364k == null) {
                    this.f363364k = mo111089w();
                }
            }
        }
        return this.f363364k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C68314a mo111089w() {
        throw null;
    }
}
