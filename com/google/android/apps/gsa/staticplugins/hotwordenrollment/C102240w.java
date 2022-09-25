package com.google.android.apps.gsa.staticplugins.hotwordenrollment;

import android.support.p031v4.app.C0167am;
import androidx.lifecycle.C2363bk;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.w */
/* compiled from: PG */
class C102240w extends C0167am implements C68288b {

    /* renamed from: j */
    public boolean f285282j = false;

    /* renamed from: k */
    private volatile C68314a f285283k;

    /* renamed from: l */
    private final Object f285284l = new Object();

    public C102240w() {
        this.f2705f.mo3343a(new C102239v(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C68314a mo92310j() {
        throw null;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo93037l().mo17653jN();
    }

    /* renamed from: l */
    public final C68314a mo93037l() {
        if (this.f285283k == null) {
            synchronized (this.f285284l) {
                if (this.f285283k == null) {
                    this.f285283k = mo92310j();
                }
            }
        }
        return this.f285283k;
    }
}
