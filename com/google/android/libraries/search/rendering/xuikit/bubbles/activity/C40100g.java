package com.google.android.libraries.search.rendering.xuikit.bubbles.activity;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.activity.g */
/* compiled from: PG */
class C40100g extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f105323j = false;

    /* renamed from: k */
    private volatile C68314a f105324k;

    /* renamed from: l */
    private final Object f105325l = new Object();

    public C40100g() {
        this.f2705f.mo3343a(new C40099f(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo42177w().mo17653jN();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public C68314a mo42173v() {
        throw null;
    }

    /* renamed from: w */
    public final C68314a mo42177w() {
        if (this.f105324k == null) {
            synchronized (this.f105325l) {
                if (this.f105324k == null) {
                    this.f105324k = mo42173v();
                }
            }
        }
        return this.f105324k;
    }
}
