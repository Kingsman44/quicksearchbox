package com.google.android.apps.gsa.staticplugins.googleappbrowser.settings.activity;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1629c.C19523c;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.staticplugins.googleappbrowser.settings.activity.o */
/* compiled from: PG */
class C101429o extends C19523c implements C68288b {

    /* renamed from: j */
    public boolean f282992j = false;

    /* renamed from: l */
    private volatile C68314a f282993l;

    /* renamed from: m */
    private final Object f282994m = new Object();

    public C101429o() {
        this.f2705f.mo3343a(new C101428n(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C68314a mo22285j() {
        throw null;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo22340k().mo17653jN();
    }

    /* renamed from: k */
    public final C68314a mo22340k() {
        if (this.f282993l == null) {
            synchronized (this.f282994m) {
                if (this.f282993l == null) {
                    this.f282993l = mo22285j();
                }
            }
        }
        return this.f282993l;
    }
}
