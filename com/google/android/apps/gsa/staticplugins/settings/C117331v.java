package com.google.android.apps.gsa.staticplugins.settings;

import androidx.lifecycle.C2363bk;
import com.android.settingslib.p277a.C5489b;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.staticplugins.settings.v */
/* compiled from: PG */
class C117331v extends C5489b implements C68288b {

    /* renamed from: j */
    private volatile C68314a f325693j;

    /* renamed from: k */
    private final Object f325694k = new Object();

    /* renamed from: n */
    public boolean f325695n = false;

    public C117331v() {
        this.f2705f.mo3343a(new C117330u(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo103262k().mo17653jN();
    }

    /* renamed from: k */
    public final C68314a mo103262k() {
        if (this.f325693j == null) {
            synchronized (this.f325694k) {
                if (this.f325693j == null) {
                    this.f325693j = new C68314a(this);
                }
            }
        }
        return this.f325693j;
    }
}
