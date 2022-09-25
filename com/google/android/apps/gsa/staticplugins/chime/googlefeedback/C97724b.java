package com.google.android.apps.gsa.staticplugins.chime.googlefeedback;

import android.support.p033v7.app.C0395p;
import androidx.lifecycle.C2363bk;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.googlefeedback.b */
/* compiled from: PG */
class C97724b extends C0395p implements C68288b {

    /* renamed from: j */
    public boolean f272854j = false;

    /* renamed from: k */
    private volatile C68314a f272855k;

    /* renamed from: l */
    private final Object f272856l = new Object();

    public C97724b() {
        this.f2705f.mo3343a(new C97723a(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo90798v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo90798v() {
        if (this.f272855k == null) {
            synchronized (this.f272856l) {
                if (this.f272855k == null) {
                    this.f272855k = new C68314a(this);
                }
            }
        }
        return this.f272855k;
    }
}
