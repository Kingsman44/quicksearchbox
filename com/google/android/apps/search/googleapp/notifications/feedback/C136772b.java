package com.google.android.apps.search.googleapp.notifications.feedback;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.notifications.feedback.b */
/* compiled from: PG */
class C136772b extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f372308j = false;

    /* renamed from: k */
    private volatile C68314a f372309k;

    /* renamed from: l */
    private final Object f372310l = new Object();

    public C136772b() {
        this.f2705f.mo3343a(new C136771a(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo113357v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo113357v() {
        if (this.f372309k == null) {
            synchronized (this.f372310l) {
                if (this.f372309k == null) {
                    this.f372309k = mo113356w();
                }
            }
        }
        return this.f372309k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C68314a mo113356w() {
        throw null;
    }
}
