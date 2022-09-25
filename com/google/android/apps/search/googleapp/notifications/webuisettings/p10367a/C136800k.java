package com.google.android.apps.search.googleapp.notifications.webuisettings.p10367a;

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

/* renamed from: com.google.android.apps.search.googleapp.notifications.webuisettings.a.k */
/* compiled from: PG */
class C136800k extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f372379a;

    /* renamed from: c */
    private boolean f372380c;

    /* renamed from: d */
    private volatile C47247a f372381d;

    /* renamed from: e */
    private final Object f372382e = new Object();

    /* renamed from: f */
    private boolean f372383f = false;

    /* renamed from: a */
    private final void mo113369a() {
        if (this.f372379a == null) {
            this.f372379a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f372380c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo113370b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo113373d() {
        if (this.f372381d == null) {
            synchronized (this.f372382e) {
                if (this.f372381d == null) {
                    this.f372381d = mo113370b();
                }
            }
        }
        return this.f372381d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo113374f() {
        if (!this.f372383f) {
            this.f372383f = true;
            mo113373d().mo17653jN();
            C136791c cVar = (C136791c) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f372380c) {
            return null;
        }
        mo113369a();
        return this.f372379a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo113373d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f372379a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo113369a();
        mo113374f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo113369a();
        mo113374f();
    }
}
