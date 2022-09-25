package com.google.android.apps.search.assistant.verticals.ambient.feedback.full;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.feedback.full.b */
/* compiled from: PG */
class C130622b extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f357752j = false;

    /* renamed from: k */
    private volatile C68314a f357753k;

    /* renamed from: l */
    private final Object f357754l = new Object();

    public C130622b() {
        this.f2705f.mo3343a(new C130619a(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo109769v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo109769v() {
        if (this.f357753k == null) {
            synchronized (this.f357754l) {
                if (this.f357753k == null) {
                    this.f357753k = mo109764w();
                }
            }
        }
        return this.f357753k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C68314a mo109764w() {
        throw null;
    }
}
