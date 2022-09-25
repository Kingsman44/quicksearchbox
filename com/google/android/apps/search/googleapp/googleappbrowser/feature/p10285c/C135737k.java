package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10285c;

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

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.c.k */
/* compiled from: PG */
class C135737k extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f369721a;

    /* renamed from: c */
    private boolean f369722c;

    /* renamed from: d */
    private volatile C47247a f369723d;

    /* renamed from: e */
    private final Object f369724e = new Object();

    /* renamed from: f */
    private boolean f369725f = false;

    /* renamed from: a */
    private final void mo112504a() {
        if (this.f369721a == null) {
            this.f369721a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f369722c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo112505b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo112517d() {
        if (this.f369723d == null) {
            synchronized (this.f369724e) {
                if (this.f369723d == null) {
                    this.f369723d = mo112505b();
                }
            }
        }
        return this.f369723d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo112518f() {
        if (!this.f369725f) {
            this.f369725f = true;
            mo112517d().mo17653jN();
            C135727b bVar = (C135727b) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f369722c) {
            return null;
        }
        mo112504a();
        return this.f369721a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo112517d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f369721a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo112504a();
        mo112518f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo112504a();
        mo112518f();
    }
}
