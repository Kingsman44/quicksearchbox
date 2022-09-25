package com.google.android.apps.gsa.nga.shared.permissions;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.C2363bk;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.nga.shared.permissions.b */
/* compiled from: PG */
class C81446b extends ComponentActivity implements C68288b {

    /* renamed from: a */
    public boolean f222858a = false;

    /* renamed from: b */
    private volatile C68314a f222859b;

    /* renamed from: c */
    private final Object f222860c = new Object();

    public C81446b() {
        this.f2705f.mo3343a(new C81445a(this));
    }

    /* renamed from: a */
    public final C68314a mo46104a() {
        if (this.f222859b == null) {
            synchronized (this.f222860c) {
                if (this.f222859b == null) {
                    this.f222859b = new C68314a(this);
                }
            }
        }
        return this.f222859b;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo46104a().mo17653jN();
    }
}
