package com.google.android.apps.search.sceneviewer;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.sceneviewer.f */
/* compiled from: PG */
class C141548f extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f384203j = false;

    /* renamed from: k */
    private volatile C68314a f384204k;

    /* renamed from: l */
    private final Object f384205l = new Object();

    public C141548f() {
        this.f2705f.mo3343a(new C141546e(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo116556v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo116556v() {
        if (this.f384204k == null) {
            synchronized (this.f384205l) {
                if (this.f384204k == null) {
                    this.f384204k = mo116551w();
                }
            }
        }
        return this.f384204k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C68314a mo116551w() {
        throw null;
    }
}
