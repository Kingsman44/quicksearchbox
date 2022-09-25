package com.google.android.apps.search.assistant.verticals.familyshare;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.verticals.familyshare.o */
/* compiled from: PG */
class C132391o extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f361367j = false;

    /* renamed from: k */
    private volatile C68314a f361368k;

    /* renamed from: l */
    private final Object f361369l = new Object();

    public C132391o() {
        this.f2705f.mo3343a(new C132390n(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo110684w().mo17653jN();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public C68314a mo110673v() {
        throw null;
    }

    /* renamed from: w */
    public final C68314a mo110684w() {
        if (this.f361368k == null) {
            synchronized (this.f361369l) {
                if (this.f361368k == null) {
                    this.f361368k = mo110673v();
                }
            }
        }
        return this.f361368k;
    }
}
