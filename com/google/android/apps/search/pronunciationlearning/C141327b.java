package com.google.android.apps.search.pronunciationlearning;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.pronunciationlearning.b */
/* compiled from: PG */
class C141327b extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f383683j = false;

    /* renamed from: k */
    private volatile C68314a f383684k;

    /* renamed from: l */
    private final Object f383685l = new Object();

    public C141327b() {
        this.f2705f.mo3343a(new C141293a(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo116360v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo116360v() {
        if (this.f383684k == null) {
            synchronized (this.f383685l) {
                if (this.f383684k == null) {
                    this.f383684k = mo116326w();
                }
            }
        }
        return this.f383684k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C68314a mo116326w() {
        throw null;
    }
}
