package com.google.android.libraries.search.assistant.proactive.surveys;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.search.assistant.proactive.surveys.h */
/* compiled from: PG */
class C36347h extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f94932j = false;

    /* renamed from: k */
    private volatile C68314a f94933k;

    /* renamed from: l */
    private final Object f94934l = new Object();

    public C36347h() {
        this.f2705f.mo3343a(new C36346g(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo40128v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo40128v() {
        if (this.f94933k == null) {
            synchronized (this.f94934l) {
                if (this.f94933k == null) {
                    this.f94933k = mo40125w();
                }
            }
        }
        return this.f94933k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C68314a mo40125w() {
        throw null;
    }
}
