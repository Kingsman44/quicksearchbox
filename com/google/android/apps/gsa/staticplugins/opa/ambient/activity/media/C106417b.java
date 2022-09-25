package com.google.android.apps.gsa.staticplugins.opa.ambient.activity.media;

import android.support.p031v4.app.C0167am;
import androidx.lifecycle.C2363bk;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.activity.media.b */
/* compiled from: PG */
class C106417b extends C0167am implements C68288b {

    /* renamed from: j */
    public boolean f296852j = false;

    /* renamed from: k */
    private volatile C68314a f296853k;

    /* renamed from: l */
    private final Object f296854l = new Object();

    public C106417b() {
        this.f2705f.mo3343a(new C106416a(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: j */
    public final C68314a mo95518j() {
        if (this.f296853k == null) {
            synchronized (this.f296854l) {
                if (this.f296853k == null) {
                    this.f296853k = new C68314a(this);
                }
            }
        }
        return this.f296853k;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo95518j().mo17653jN();
    }
}
