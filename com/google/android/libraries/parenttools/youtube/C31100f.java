package com.google.android.libraries.parenttools.youtube;

import android.support.p033v7.app.C0395p;
import androidx.lifecycle.C2363bk;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.parenttools.youtube.f */
/* compiled from: PG */
class C31100f extends C0395p implements C68288b {

    /* renamed from: j */
    public boolean f83785j = false;

    /* renamed from: k */
    private volatile C68314a f83786k;

    /* renamed from: l */
    private final Object f83787l = new Object();

    public C31100f() {
        this.f2705f.mo3343a(new C31099e(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo36851v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo36851v() {
        if (this.f83786k == null) {
            synchronized (this.f83787l) {
                if (this.f83786k == null) {
                    this.f83786k = new C68314a(this);
                }
            }
        }
        return this.f83786k;
    }
}
