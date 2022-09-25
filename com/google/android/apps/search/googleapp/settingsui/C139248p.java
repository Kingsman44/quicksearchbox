package com.google.android.apps.search.googleapp.settingsui;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.p */
/* compiled from: PG */
class C139248p extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f378724j = false;

    /* renamed from: k */
    private volatile C68314a f378725k;

    /* renamed from: l */
    private final Object f378726l = new Object();

    public C139248p() {
        this.f2705f.mo3343a(new C139247o(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo114853v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo114853v() {
        if (this.f378725k == null) {
            synchronized (this.f378726l) {
                if (this.f378725k == null) {
                    this.f378725k = mo114773w();
                }
            }
        }
        return this.f378725k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C68314a mo114773w() {
        throw null;
    }
}
