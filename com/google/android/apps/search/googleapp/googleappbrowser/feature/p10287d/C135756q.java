package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10287d;

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

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.d.q */
/* compiled from: PG */
class C135756q extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f369776a;

    /* renamed from: c */
    private boolean f369777c;

    /* renamed from: d */
    private volatile C47247a f369778d;

    /* renamed from: e */
    private final Object f369779e = new Object();

    /* renamed from: f */
    private boolean f369780f = false;

    /* renamed from: a */
    private final void mo112520a() {
        if (this.f369776a == null) {
            this.f369776a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f369777c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo112521b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo112526d() {
        if (this.f369778d == null) {
            synchronized (this.f369779e) {
                if (this.f369778d == null) {
                    this.f369778d = mo112521b();
                }
            }
        }
        return this.f369778d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo112527f() {
        if (!this.f369780f) {
            this.f369780f = true;
            mo112526d().mo17653jN();
            C135741d dVar = (C135741d) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f369777c) {
            return null;
        }
        mo112520a();
        return this.f369776a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo112526d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f369776a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo112520a();
        mo112527f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo112520a();
        mo112527f();
    }
}
