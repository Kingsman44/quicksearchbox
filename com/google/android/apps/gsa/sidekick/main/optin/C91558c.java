package com.google.android.apps.gsa.sidekick.main.optin;

import androidx.lifecycle.C2363bk;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.sidekick.main.optin.c */
/* compiled from: PG */
abstract class C91558c extends C91556a implements C68288b {

    /* renamed from: k */
    public boolean f255396k = false;

    /* renamed from: l */
    private volatile C68314a f255397l;

    /* renamed from: m */
    private final Object f255398m = new Object();

    public C91558c() {
        this.f2705f.mo3343a(new C91557b(this));
    }

    /* renamed from: A */
    public final C68314a mo85943A() {
        if (this.f255397l == null) {
            synchronized (this.f255398m) {
                if (this.f255397l == null) {
                    this.f255397l = new C68314a(this);
                }
            }
        }
        return this.f255397l;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo85943A().mo17653jN();
    }
}
