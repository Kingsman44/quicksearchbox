package com.google.android.apps.gsa.staticplugins.opa.ambient.activity;

import android.support.p033v7.app.C0395p;
import androidx.lifecycle.C2363bk;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.activity.ac */
/* compiled from: PG */
class C106402ac extends C0395p implements C68288b {

    /* renamed from: j */
    private volatile C68314a f296803j;

    /* renamed from: k */
    private final Object f296804k = new Object();

    /* renamed from: m */
    public boolean f296805m = false;

    public C106402ac() {
        this.f2705f.mo3343a(new C106401ab(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo95510v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo95510v() {
        if (this.f296803j == null) {
            synchronized (this.f296804k) {
                if (this.f296803j == null) {
                    this.f296803j = new C68314a(this);
                }
            }
        }
        return this.f296803j;
    }
}
