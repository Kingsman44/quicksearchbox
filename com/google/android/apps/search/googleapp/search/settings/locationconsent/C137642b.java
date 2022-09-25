package com.google.android.apps.search.googleapp.search.settings.locationconsent;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.locationconsent.b */
/* compiled from: PG */
class C137642b extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f374403j = false;

    /* renamed from: k */
    private volatile C68314a f374404k;

    /* renamed from: l */
    private final Object f374405l = new Object();

    public C137642b() {
        this.f2705f.mo3343a(new C137641a(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo113877v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo113877v() {
        if (this.f374404k == null) {
            synchronized (this.f374405l) {
                if (this.f374404k == null) {
                    this.f374404k = mo113876w();
                }
            }
        }
        return this.f374404k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C68314a mo113876w() {
        throw null;
    }
}
