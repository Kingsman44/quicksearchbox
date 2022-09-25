package com.google.android.apps.search.googleapp.search.settings.adspersonalization;

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

/* renamed from: com.google.android.apps.search.googleapp.search.settings.adspersonalization.u */
/* compiled from: PG */
class C137586u extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f374230a;

    /* renamed from: c */
    private boolean f374231c;

    /* renamed from: d */
    private volatile C47247a f374232d;

    /* renamed from: e */
    private final Object f374233e = new Object();

    /* renamed from: f */
    private boolean f374234f = false;

    /* renamed from: a */
    private final void m223527a() {
        if (this.f374230a == null) {
            this.f374230a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f374231c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C47247a mo113833d() {
        throw null;
    }

    /* renamed from: f */
    public final C47247a mo113838f() {
        if (this.f374232d == null) {
            synchronized (this.f374233e) {
                if (this.f374232d == null) {
                    this.f374232d = mo113833d();
                }
            }
        }
        return this.f374232d;
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f374231c) {
            return null;
        }
        m223527a();
        return this.f374230a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo113839j() {
        if (!this.f374234f) {
            this.f374234f = true;
            mo113838f().mo17653jN();
            C137576k kVar = (C137576k) this;
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo113838f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f374230a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        m223527a();
        mo113839j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        m223527a();
        mo113839j();
    }
}
