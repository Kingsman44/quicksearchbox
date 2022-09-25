package com.google.android.libraries.lens.view.infopanel;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.C0260w;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.apps.tiktok.inject.p3654a.p3655a.C47189c;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.libraries.lens.view.infopanel.cg */
/* compiled from: PG */
class C27089cg extends C0260w implements C68288b {

    /* renamed from: a */
    private ContextWrapper f73829a;

    /* renamed from: b */
    private boolean f73830b;

    /* renamed from: c */
    private volatile C47247a f73831c;

    /* renamed from: d */
    private final Object f73832d = new Object();

    /* renamed from: e */
    private boolean f73833e = false;

    /* renamed from: a */
    private final void mo32460a() {
        if (this.f73829a == null) {
            this.f73829a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f73830b = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo32461b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo32530d() {
        if (this.f73831c == null) {
            synchronized (this.f73832d) {
                if (this.f73831c == null) {
                    this.f73831c = mo32461b();
                }
            }
        }
        return this.f73831c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo32531f() {
        if (!this.f73833e) {
            this.f73833e = true;
            mo32530d().mo17653jN();
            C27001as asVar = (C27001as) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f73830b) {
            return null;
        }
        mo32460a();
        return this.f73829a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo32530d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f73829a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo32460a();
        mo32531f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo32460a();
        mo32531f();
    }
}
