package com.google.android.apps.search.assistant.verticals.languagelearning;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.verticals.languagelearning.b */
/* compiled from: PG */
class C132394b extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f361381j = false;

    /* renamed from: k */
    private volatile C68314a f361382k;

    /* renamed from: l */
    private final Object f361383l = new Object();

    public C132394b() {
        this.f2705f.mo3343a(new C132393a(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo110689v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo110689v() {
        if (this.f361382k == null) {
            synchronized (this.f361383l) {
                if (this.f361382k == null) {
                    this.f361382k = mo110688w();
                }
            }
        }
        return this.f361382k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C68314a mo110688w() {
        throw null;
    }
}
