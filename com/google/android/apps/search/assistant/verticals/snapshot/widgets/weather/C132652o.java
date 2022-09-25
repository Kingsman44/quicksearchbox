package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather;

import android.support.p033v7.app.C0395p;
import androidx.lifecycle.C2363bk;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.o */
/* compiled from: PG */
class C132652o extends C0395p implements C68288b {

    /* renamed from: j */
    public boolean f362000j = false;

    /* renamed from: k */
    private volatile C68314a f362001k;

    /* renamed from: l */
    private final Object f362002l = new Object();

    public C132652o() {
        this.f2705f.mo3343a(new C132651n(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo110867x().mo17653jN();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public C68314a mo110819v() {
        throw null;
    }

    /* renamed from: x */
    public final C68314a mo110867x() {
        if (this.f362001k == null) {
            synchronized (this.f362002l) {
                if (this.f362001k == null) {
                    this.f362001k = mo110819v();
                }
            }
        }
        return this.f362001k;
    }
}
