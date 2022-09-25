package com.google.android.apps.search.soundsearch;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.soundsearch.b */
/* compiled from: PG */
class C141638b extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f384458j = false;

    /* renamed from: k */
    private volatile C68314a f384459k;

    /* renamed from: l */
    private final Object f384460l = new Object();

    public C141638b() {
        this.f2705f.mo3343a(new C141628a(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo116627v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo116627v() {
        if (this.f384459k == null) {
            synchronized (this.f384460l) {
                if (this.f384459k == null) {
                    this.f384459k = mo116620w();
                }
            }
        }
        return this.f384459k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C68314a mo116620w() {
        throw null;
    }
}
