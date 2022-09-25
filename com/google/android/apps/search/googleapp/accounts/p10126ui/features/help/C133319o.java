package com.google.android.apps.search.googleapp.accounts.p10126ui.features.help;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.features.help.o */
/* compiled from: PG */
class C133319o extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f363289j = false;

    /* renamed from: k */
    private volatile C68314a f363290k;

    /* renamed from: l */
    private final Object f363291l = new Object();

    public C133319o() {
        this.f2705f.mo3343a(new C133318n(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo111075w().mo17653jN();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public C68314a mo111069v() {
        throw null;
    }

    /* renamed from: w */
    public final C68314a mo111075w() {
        if (this.f363290k == null) {
            synchronized (this.f363291l) {
                if (this.f363290k == null) {
                    this.f363290k = mo111069v();
                }
            }
        }
        return this.f363290k;
    }
}
