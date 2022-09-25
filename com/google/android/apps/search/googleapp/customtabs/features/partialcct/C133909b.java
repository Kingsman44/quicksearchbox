package com.google.android.apps.search.googleapp.customtabs.features.partialcct;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.partialcct.b */
/* compiled from: PG */
class C133909b extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f364728j = false;

    /* renamed from: k */
    private volatile C68314a f364729k;

    /* renamed from: l */
    private final Object f364730l = new Object();

    public C133909b() {
        this.f2705f.mo3343a(new C133908a(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo111448v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo111448v() {
        if (this.f364729k == null) {
            synchronized (this.f364730l) {
                if (this.f364729k == null) {
                    this.f364729k = mo111447w();
                }
            }
        }
        return this.f364729k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C68314a mo111447w() {
        throw null;
    }
}
