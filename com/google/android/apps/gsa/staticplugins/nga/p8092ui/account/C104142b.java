package com.google.android.apps.gsa.staticplugins.nga.p8092ui.account;

import android.support.p033v7.app.C0395p;
import androidx.lifecycle.C2363bk;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.ui.account.b */
/* compiled from: PG */
class C104142b extends C0395p implements C68288b {

    /* renamed from: j */
    public boolean f289695j = false;

    /* renamed from: k */
    private volatile C68314a f289696k;

    /* renamed from: l */
    private final Object f289697l = new Object();

    public C104142b() {
        this.f2705f.mo3343a(new C104139a(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo93965v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo93965v() {
        if (this.f289696k == null) {
            synchronized (this.f289697l) {
                if (this.f289696k == null) {
                    this.f289696k = new C68314a(this);
                }
            }
        }
        return this.f289696k;
    }
}
