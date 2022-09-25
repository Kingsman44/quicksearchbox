package com.google.android.apps.search.googleapp.search.settings.p10428e;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.apps.tiktok.inject.baseclasses.C47210f;
import com.google.apps.tiktok.inject.p3654a.p3655a.C47189c;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.e.m */
/* compiled from: PG */
class C137627m extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f374359a;

    /* renamed from: c */
    private boolean f374360c;

    /* renamed from: d */
    private volatile C47247a f374361d;

    /* renamed from: e */
    private final Object f374362e = new Object();

    /* renamed from: f */
    private boolean f374363f = false;

    /* renamed from: a */
    private final void mo113864a() {
        if (this.f374359a == null) {
            this.f374359a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f374360c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo113865b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo113867d() {
        if (this.f374361d == null) {
            synchronized (this.f374362e) {
                if (this.f374361d == null) {
                    this.f374361d = mo113865b();
                }
            }
        }
        return this.f374361d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo113868f() {
        if (!this.f374363f) {
            this.f374363f = true;
            mo113867d().mo17653jN();
            C137622h hVar = (C137622h) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f374360c) {
            return null;
        }
        mo113864a();
        return this.f374359a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo113867d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f374359a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo113864a();
        mo113868f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo113864a();
        mo113868f();
    }
}
