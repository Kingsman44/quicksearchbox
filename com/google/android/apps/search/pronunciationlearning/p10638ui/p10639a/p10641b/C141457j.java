package com.google.android.apps.search.pronunciationlearning.p10638ui.p10639a.p10641b;

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

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.a.b.j */
/* compiled from: PG */
class C141457j extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f383957a;

    /* renamed from: c */
    private boolean f383958c;

    /* renamed from: d */
    private volatile C47247a f383959d;

    /* renamed from: e */
    private final Object f383960e = new Object();

    /* renamed from: f */
    private boolean f383961f = false;

    /* renamed from: a */
    private final void mo116439a() {
        if (this.f383957a == null) {
            this.f383957a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f383958c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo116440b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo116452d() {
        if (this.f383959d == null) {
            synchronized (this.f383960e) {
                if (this.f383959d == null) {
                    this.f383959d = mo116440b();
                }
            }
        }
        return this.f383959d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo116453f() {
        if (!this.f383961f) {
            this.f383961f = true;
            mo116452d().mo17653jN();
            C141443b bVar = (C141443b) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f383958c) {
            return null;
        }
        mo116439a();
        return this.f383957a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo116452d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f383957a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo116439a();
        mo116453f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo116439a();
        mo116453f();
    }
}
