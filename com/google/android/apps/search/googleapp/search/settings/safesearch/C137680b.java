package com.google.android.apps.search.googleapp.search.settings.safesearch;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.safesearch.b */
/* compiled from: PG */
class C137680b extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f374490j = false;

    /* renamed from: k */
    private volatile C68314a f374491k;

    /* renamed from: l */
    private final Object f374492l = new Object();

    public C137680b() {
        this.f2705f.mo3343a(new C137679a(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo113901v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo113901v() {
        if (this.f374491k == null) {
            synchronized (this.f374492l) {
                if (this.f374491k == null) {
                    this.f374491k = mo113900w();
                }
            }
        }
        return this.f374491k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C68314a mo113900w() {
        throw null;
    }
}
