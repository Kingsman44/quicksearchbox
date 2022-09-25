package com.google.android.apps.gsa.velvet.p8863ui.settings.legal;

import android.support.p033v7.app.C0395p;
import androidx.lifecycle.C2363bk;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.velvet.ui.settings.legal.e */
/* compiled from: PG */
class C118663e extends C0395p implements C68288b {

    /* renamed from: j */
    public boolean f331035j = false;

    /* renamed from: k */
    private volatile C68314a f331036k;

    /* renamed from: l */
    private final Object f331037l = new Object();

    public C118663e() {
        this.f2705f.mo3343a(new C118662d(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo103849v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo103849v() {
        if (this.f331036k == null) {
            synchronized (this.f331037l) {
                if (this.f331036k == null) {
                    this.f331036k = new C68314a(this);
                }
            }
        }
        return this.f331036k;
    }
}
