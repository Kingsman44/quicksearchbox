package com.google.android.apps.gsa.staticplugins.opa.ambient.activity;

import android.support.p033v7.app.C0395p;
import androidx.lifecycle.C2363bk;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.activity.z */
/* compiled from: PG */
class C106431z extends C0395p implements C68288b {

    /* renamed from: j */
    private volatile C68314a f296882j;

    /* renamed from: k */
    private final Object f296883k = new Object();

    /* renamed from: q */
    public boolean f296884q = false;

    public C106431z() {
        this.f2705f.mo3343a(new C106430y(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo95527x().mo17653jN();
    }

    /* renamed from: x */
    public final C68314a mo95527x() {
        if (this.f296882j == null) {
            synchronized (this.f296883k) {
                if (this.f296882j == null) {
                    this.f296882j = new C68314a(this);
                }
            }
        }
        return this.f296882j;
    }
}
