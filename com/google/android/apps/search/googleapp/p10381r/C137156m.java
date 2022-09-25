package com.google.android.apps.search.googleapp.p10381r;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1628b.C19501a;
import com.google.apps.tiktok.inject.p3654a.p3655a.C47189c;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.apps.search.googleapp.r.m */
/* compiled from: PG */
abstract class C137156m extends C19501a implements C68288b {

    /* renamed from: f */
    private ContextWrapper f373207f;

    /* renamed from: g */
    private boolean f373208g;

    /* renamed from: h */
    private volatile C47247a f373209h;

    /* renamed from: i */
    private final Object f373210i = new Object();

    /* renamed from: j */
    private boolean f373211j = false;

    /* renamed from: b */
    private final void mo113568b() {
        if (this.f373207f == null) {
            this.f373207f = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f373208g = C68297a.m98634a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f373208g) {
            return null;
        }
        mo113568b();
        return this.f373207f;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo113572n().mo17653jN();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C47247a mo113569m() {
        throw null;
    }

    /* renamed from: n */
    public final C47247a mo113572n() {
        if (this.f373209h == null) {
            synchronized (this.f373210i) {
                if (this.f373209h == null) {
                    this.f373209h = mo113569m();
                }
            }
        }
        return this.f373209h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo113573o() {
        if (!this.f373211j) {
            this.f373211j = true;
            mo113572n().mo17653jN();
            C137144c cVar = (C137144c) this;
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f373207f;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo113568b();
        mo113573o();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo113568b();
        mo113573o();
    }
}
