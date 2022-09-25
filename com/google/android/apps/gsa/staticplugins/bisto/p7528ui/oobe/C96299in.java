package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.support.p033v7.app.C0395p;
import androidx.lifecycle.C2363bk;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.in */
/* compiled from: PG */
class C96299in extends C0395p implements C68288b {

    /* renamed from: j */
    public boolean f269486j = false;

    /* renamed from: k */
    private volatile C68314a f269487k;

    /* renamed from: l */
    private final Object f269488l = new Object();

    public C96299in() {
        this.f2705f.mo3343a(new C96298im(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo90059v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo90059v() {
        if (this.f269487k == null) {
            synchronized (this.f269488l) {
                if (this.f269487k == null) {
                    this.f269487k = new C68314a(this);
                }
            }
        }
        return this.f269487k;
    }
}
