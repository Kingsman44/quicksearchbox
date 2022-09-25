package com.google.android.apps.search.googleapp.activity.p10137b;

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

/* renamed from: com.google.android.apps.search.googleapp.activity.b.j */
/* compiled from: PG */
class C133413j extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f363535a;

    /* renamed from: c */
    private boolean f363536c;

    /* renamed from: d */
    private volatile C47247a f363537d;

    /* renamed from: e */
    private final Object f363538e = new Object();

    /* renamed from: f */
    private boolean f363539f = false;

    /* renamed from: a */
    private final void mo111130a() {
        if (this.f363535a == null) {
            this.f363535a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f363536c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo111131b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo111134d() {
        if (this.f363537d == null) {
            synchronized (this.f363538e) {
                if (this.f363537d == null) {
                    this.f363537d = mo111131b();
                }
            }
        }
        return this.f363537d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo111135f() {
        if (!this.f363539f) {
            this.f363539f = true;
            mo111134d().mo17653jN();
            C133405b bVar = (C133405b) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f363536c) {
            return null;
        }
        mo111130a();
        return this.f363535a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo111134d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f363535a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo111130a();
        mo111135f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo111130a();
        mo111135f();
    }
}
