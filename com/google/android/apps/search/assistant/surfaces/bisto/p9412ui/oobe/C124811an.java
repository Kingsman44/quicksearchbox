package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.an */
/* compiled from: PG */
class C124811an extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f344348j = false;

    /* renamed from: k */
    private volatile C68314a f344349k;

    /* renamed from: l */
    private final Object f344350l = new Object();

    public C124811an() {
        this.f2705f.mo3343a(new C124810am(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo106651v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo106651v() {
        if (this.f344349k == null) {
            synchronized (this.f344350l) {
                if (this.f344349k == null) {
                    this.f344349k = mo106636w();
                }
            }
        }
        return this.f344349k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C68314a mo106636w() {
        throw null;
    }
}
