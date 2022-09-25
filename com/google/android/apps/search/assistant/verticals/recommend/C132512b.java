package com.google.android.apps.search.assistant.verticals.recommend;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.verticals.recommend.b */
/* compiled from: PG */
class C132512b extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f361656j = false;

    /* renamed from: k */
    private volatile C68314a f361657k;

    /* renamed from: l */
    private final Object f361658l = new Object();

    public C132512b() {
        this.f2705f.mo3343a(new C132509a(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo110791v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo110791v() {
        if (this.f361657k == null) {
            synchronized (this.f361658l) {
                if (this.f361657k == null) {
                    this.f361657k = mo110790w();
                }
            }
        }
        return this.f361657k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C68314a mo110790w() {
        throw null;
    }
}
