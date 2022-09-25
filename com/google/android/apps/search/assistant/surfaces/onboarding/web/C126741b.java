package com.google.android.apps.search.assistant.surfaces.onboarding.web;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.web.b */
/* compiled from: PG */
class C126741b extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f349041j = false;

    /* renamed from: k */
    private volatile C68314a f349042k;

    /* renamed from: l */
    private final Object f349043l = new Object();

    public C126741b() {
        this.f2705f.mo3343a(new C126740a(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo107739v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo107739v() {
        if (this.f349042k == null) {
            synchronized (this.f349043l) {
                if (this.f349042k == null) {
                    this.f349042k = mo107738w();
                }
            }
        }
        return this.f349042k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C68314a mo107738w() {
        throw null;
    }
}
