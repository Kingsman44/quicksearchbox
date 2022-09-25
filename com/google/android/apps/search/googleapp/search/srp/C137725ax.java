package com.google.android.apps.search.googleapp.search.srp;

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

/* renamed from: com.google.android.apps.search.googleapp.search.srp.ax */
/* compiled from: PG */
class C137725ax extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f374636a;

    /* renamed from: c */
    private boolean f374637c;

    /* renamed from: d */
    private volatile C47247a f374638d;

    /* renamed from: e */
    private final Object f374639e = new Object();

    /* renamed from: f */
    private boolean f374640f = false;

    /* renamed from: a */
    private final void mo113911a() {
        if (this.f374636a == null) {
            this.f374636a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f374637c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo113912b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo113930d() {
        if (this.f374638d == null) {
            synchronized (this.f374639e) {
                if (this.f374638d == null) {
                    this.f374638d = mo113912b();
                }
            }
        }
        return this.f374638d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo113931f() {
        if (!this.f374640f) {
            this.f374640f = true;
            mo113930d().mo17653jN();
            C137699ab abVar = (C137699ab) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f374637c) {
            return null;
        }
        mo113911a();
        return this.f374636a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo113930d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f374636a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo113911a();
        mo113931f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo113911a();
        mo113931f();
    }
}
