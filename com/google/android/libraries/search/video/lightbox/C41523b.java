package com.google.android.libraries.search.video.lightbox;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.search.video.lightbox.b */
/* compiled from: PG */
class C41523b extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f108531j = false;

    /* renamed from: k */
    private volatile C68314a f108532k;

    /* renamed from: l */
    private final Object f108533l = new Object();

    public C41523b() {
        this.f2705f.mo3343a(new C41522a(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo44049v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo44049v() {
        if (this.f108532k == null) {
            synchronized (this.f108533l) {
                if (this.f108532k == null) {
                    this.f108532k = mo44048w();
                }
            }
        }
        return this.f108532k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C68314a mo44048w() {
        throw null;
    }
}
