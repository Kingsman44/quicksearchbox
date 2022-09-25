package com.google.android.apps.gsa.staticplugins.accountswitch;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.staticplugins.accountswitch.i */
/* compiled from: PG */
class C93247i extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f260017j = false;

    /* renamed from: k */
    private volatile C68314a f260018k;

    /* renamed from: l */
    private final Object f260019l = new Object();

    public C93247i() {
        this.f2705f.mo3343a(new C93246h(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo87579w().mo17653jN();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public C68314a mo87574v() {
        throw null;
    }

    /* renamed from: w */
    public final C68314a mo87579w() {
        if (this.f260018k == null) {
            synchronized (this.f260019l) {
                if (this.f260018k == null) {
                    this.f260018k = mo87574v();
                }
            }
        }
        return this.f260018k;
    }
}
