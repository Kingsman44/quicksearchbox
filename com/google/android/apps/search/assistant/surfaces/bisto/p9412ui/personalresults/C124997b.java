package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.personalresults;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.personalresults.b */
/* compiled from: PG */
class C124997b extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f344899j = false;

    /* renamed from: k */
    private volatile C68314a f344900k;

    /* renamed from: l */
    private final Object f344901l = new Object();

    public C124997b() {
        this.f2705f.mo3343a(new C124984a(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo106771v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo106771v() {
        if (this.f344900k == null) {
            synchronized (this.f344901l) {
                if (this.f344900k == null) {
                    this.f344900k = mo106762w();
                }
            }
        }
        return this.f344900k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C68314a mo106762w() {
        throw null;
    }
}
