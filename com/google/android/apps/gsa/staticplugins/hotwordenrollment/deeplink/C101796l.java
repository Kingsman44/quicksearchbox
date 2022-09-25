package com.google.android.apps.gsa.staticplugins.hotwordenrollment.deeplink;

import android.support.p033v7.app.C0395p;
import androidx.lifecycle.C2363bk;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.deeplink.l */
/* compiled from: PG */
class C101796l extends C0395p implements C68288b {

    /* renamed from: j */
    private volatile C68314a f283938j;

    /* renamed from: k */
    public boolean f283939k = false;

    /* renamed from: l */
    private final Object f283940l = new Object();

    public C101796l() {
        this.f2705f.mo3343a(new C101795k(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo92580v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo92580v() {
        if (this.f283938j == null) {
            synchronized (this.f283940l) {
                if (this.f283938j == null) {
                    this.f283938j = new C68314a(this);
                }
            }
        }
        return this.f283938j;
    }
}
