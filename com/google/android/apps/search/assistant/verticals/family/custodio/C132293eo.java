package com.google.android.apps.search.assistant.verticals.family.custodio;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.eo */
/* compiled from: PG */
class C132293eo extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f361082j = false;

    /* renamed from: k */
    private volatile C68314a f361083k;

    /* renamed from: l */
    private final Object f361084l = new Object();

    public C132293eo() {
        this.f2705f.mo3343a(new C132292en(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo110594w().mo17653jN();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public C68314a mo110410v() {
        throw null;
    }

    /* renamed from: w */
    public final C68314a mo110594w() {
        if (this.f361083k == null) {
            synchronized (this.f361084l) {
                if (this.f361083k == null) {
                    this.f361083k = mo110410v();
                }
            }
        }
        return this.f361083k;
    }
}
