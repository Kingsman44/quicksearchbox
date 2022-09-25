package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import android.support.p033v7.app.C0395p;
import androidx.lifecycle.C2363bk;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.x */
/* compiled from: PG */
class C114499x extends C0395p implements C68288b {

    /* renamed from: j */
    public boolean f317473j = false;

    /* renamed from: k */
    private volatile C68314a f317474k;

    /* renamed from: l */
    private final Object f317475l = new Object();

    public C114499x() {
        this.f2705f.mo3343a(new C114498w(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo101357v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo101357v() {
        if (this.f317474k == null) {
            synchronized (this.f317475l) {
                if (this.f317474k == null) {
                    this.f317474k = new C68314a(this);
                }
            }
        }
        return this.f317474k;
    }
}
