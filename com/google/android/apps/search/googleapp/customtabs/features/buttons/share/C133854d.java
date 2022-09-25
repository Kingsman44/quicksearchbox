package com.google.android.apps.search.googleapp.customtabs.features.buttons.share;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1629c.C19523c;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.buttons.share.d */
/* compiled from: PG */
class C133854d extends C19523c implements C68288b {

    /* renamed from: j */
    public boolean f364585j = false;

    /* renamed from: l */
    private volatile C68314a f364586l;

    /* renamed from: m */
    private final Object f364587m = new Object();

    public C133854d() {
        this.f2705f.mo3343a(new C133853c(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: j */
    public final C68314a mo22285j() {
        if (this.f364586l == null) {
            synchronized (this.f364587m) {
                if (this.f364586l == null) {
                    this.f364586l = mo22340k();
                }
            }
        }
        return this.f364586l;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo22285j().mo17653jN();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C68314a mo22340k() {
        throw null;
    }
}
