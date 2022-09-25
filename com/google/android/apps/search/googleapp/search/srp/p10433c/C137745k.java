package com.google.android.apps.search.googleapp.search.srp.p10433c;

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

/* renamed from: com.google.android.apps.search.googleapp.search.srp.c.k */
/* compiled from: PG */
class C137745k extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f374703a;

    /* renamed from: c */
    private boolean f374704c;

    /* renamed from: d */
    private volatile C47247a f374705d;

    /* renamed from: e */
    private final Object f374706e = new Object();

    /* renamed from: f */
    private boolean f374707f = false;

    /* renamed from: a */
    private final void mo113934a() {
        if (this.f374703a == null) {
            this.f374703a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f374704c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo113935b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo113939d() {
        if (this.f374705d == null) {
            synchronized (this.f374706e) {
                if (this.f374705d == null) {
                    this.f374705d = mo113935b();
                }
            }
        }
        return this.f374705d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo113940f() {
        if (!this.f374707f) {
            this.f374707f = true;
            mo113939d().mo17653jN();
            C137735b bVar = (C137735b) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f374704c) {
            return null;
        }
        mo113934a();
        return this.f374703a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo113939d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f374703a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo113934a();
        mo113940f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo113934a();
        mo113940f();
    }
}
