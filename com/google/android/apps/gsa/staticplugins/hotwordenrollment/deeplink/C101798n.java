package com.google.android.apps.gsa.staticplugins.hotwordenrollment.deeplink;

import android.support.p033v7.app.C0395p;
import androidx.lifecycle.C2363bk;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.deeplink.n */
/* compiled from: PG */
class C101798n extends C0395p implements C68288b {

    /* renamed from: j */
    private volatile C68314a f283942j;

    /* renamed from: k */
    private final Object f283943k = new Object();

    /* renamed from: o */
    public boolean f283944o = false;

    public C101798n() {
        this.f2705f.mo3343a(new C101797m(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo92581v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo92581v() {
        if (this.f283942j == null) {
            synchronized (this.f283943k) {
                if (this.f283942j == null) {
                    this.f283942j = new C68314a(this);
                }
            }
        }
        return this.f283942j;
    }
}
