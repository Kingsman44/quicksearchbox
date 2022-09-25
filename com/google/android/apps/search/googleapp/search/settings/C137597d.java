package com.google.android.apps.search.googleapp.search.settings;

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

/* renamed from: com.google.android.apps.search.googleapp.search.settings.d */
/* compiled from: PG */
class C137597d extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f374267a;

    /* renamed from: c */
    private boolean f374268c;

    /* renamed from: d */
    private volatile C47247a f374269d;

    /* renamed from: e */
    private final Object f374270e = new Object();

    /* renamed from: f */
    private boolean f374271f = false;

    /* renamed from: a */
    private final void mo113840a() {
        if (this.f374267a == null) {
            this.f374267a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f374268c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo113841b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo113847d() {
        if (this.f374269d == null) {
            synchronized (this.f374270e) {
                if (this.f374269d == null) {
                    this.f374269d = mo113841b();
                }
            }
        }
        return this.f374269d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo113848f() {
        if (!this.f374271f) {
            this.f374271f = true;
            mo113847d().mo17653jN();
            C137587b bVar = (C137587b) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f374268c) {
            return null;
        }
        mo113840a();
        return this.f374267a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo113847d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f374267a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo113840a();
        mo113848f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo113840a();
        mo113848f();
    }
}
