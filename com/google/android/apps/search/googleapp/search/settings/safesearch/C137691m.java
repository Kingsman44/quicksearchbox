package com.google.android.apps.search.googleapp.search.settings.safesearch;

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

/* renamed from: com.google.android.apps.search.googleapp.search.settings.safesearch.m */
/* compiled from: PG */
class C137691m extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f374508a;

    /* renamed from: c */
    private boolean f374509c;

    /* renamed from: d */
    private volatile C47247a f374510d;

    /* renamed from: e */
    private final Object f374511e = new Object();

    /* renamed from: f */
    private boolean f374512f = false;

    /* renamed from: a */
    private final void mo113904a() {
        if (this.f374508a == null) {
            this.f374508a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f374509c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo113905b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo113906d() {
        if (this.f374510d == null) {
            synchronized (this.f374511e) {
                if (this.f374510d == null) {
                    this.f374510d = mo113905b();
                }
            }
        }
        return this.f374510d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo113907f() {
        if (!this.f374512f) {
            this.f374512f = true;
            mo113906d().mo17653jN();
            C137686h hVar = (C137686h) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f374509c) {
            return null;
        }
        mo113904a();
        return this.f374508a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo113906d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f374508a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo113904a();
        mo113907f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo113904a();
        mo113907f();
    }
}
