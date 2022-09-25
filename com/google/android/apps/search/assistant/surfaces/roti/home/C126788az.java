package com.google.android.apps.search.assistant.surfaces.roti.home;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.az */
/* compiled from: PG */
class C126788az extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f349156j = false;

    /* renamed from: k */
    private volatile C68314a f349157k;

    /* renamed from: l */
    private final Object f349158l = new Object();

    public C126788az() {
        this.f2705f.mo3343a(new C126787ay(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo107784v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo107784v() {
        if (this.f349157k == null) {
            synchronized (this.f349158l) {
                if (this.f349157k == null) {
                    this.f349157k = mo107763w();
                }
            }
        }
        return this.f349157k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C68314a mo107763w() {
        throw null;
    }
}
