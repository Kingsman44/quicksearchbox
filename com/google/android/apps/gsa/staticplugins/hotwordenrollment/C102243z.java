package com.google.android.apps.gsa.staticplugins.hotwordenrollment;

import android.support.p031v4.app.C0167am;
import androidx.lifecycle.C2363bk;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.z */
/* compiled from: PG */
class C102243z extends C0167am implements C68288b {

    /* renamed from: j */
    public boolean f285291j = false;

    /* renamed from: k */
    private volatile C68314a f285292k;

    /* renamed from: l */
    private final Object f285293l = new Object();

    public C102243z() {
        this.f2705f.mo3343a(new C102242y(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: j */
    public final C68314a mo93040j() {
        if (this.f285292k == null) {
            synchronized (this.f285293l) {
                if (this.f285292k == null) {
                    this.f285292k = new C68314a(this);
                }
            }
        }
        return this.f285292k;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo93040j().mo17653jN();
    }
}
