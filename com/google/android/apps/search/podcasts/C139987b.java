package com.google.android.apps.search.podcasts;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.podcasts.b */
/* compiled from: PG */
class C139987b extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f380487j = false;

    /* renamed from: k */
    private volatile C68314a f380488k;

    /* renamed from: l */
    private final Object f380489l = new Object();

    public C139987b() {
        this.f2705f.mo3343a(new C139955a(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo115375v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo115375v() {
        if (this.f380488k == null) {
            synchronized (this.f380489l) {
                if (this.f380488k == null) {
                    this.f380488k = mo115359w();
                }
            }
        }
        return this.f380488k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C68314a mo115359w() {
        throw null;
    }
}
