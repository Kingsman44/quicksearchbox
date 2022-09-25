package com.google.android.apps.search.assistant.verticals.newsplayer.p10069ui;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.ui.d */
/* compiled from: PG */
class C132486d extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f361615j = false;

    /* renamed from: k */
    private volatile C68314a f361616k;

    /* renamed from: l */
    private final Object f361617l = new Object();

    public C132486d() {
        this.f2705f.mo3343a(new C132485c(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo110772v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo110772v() {
        if (this.f361616k == null) {
            synchronized (this.f361617l) {
                if (this.f361616k == null) {
                    this.f361616k = mo110738w();
                }
            }
        }
        return this.f361616k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C68314a mo110738w() {
        throw null;
    }
}
