package com.google.android.apps.search.googleapp.search.settings.personalresults;

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

/* renamed from: com.google.android.apps.search.googleapp.search.settings.personalresults.r */
/* compiled from: PG */
class C137678r extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f374478a;

    /* renamed from: c */
    private boolean f374479c;

    /* renamed from: d */
    private volatile C47247a f374480d;

    /* renamed from: e */
    private final Object f374481e = new Object();

    /* renamed from: f */
    private boolean f374482f = false;

    /* renamed from: a */
    private final void mo113895a() {
        if (this.f374478a == null) {
            this.f374478a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f374479c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo113896b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo113897d() {
        if (this.f374480d == null) {
            synchronized (this.f374481e) {
                if (this.f374480d == null) {
                    this.f374480d = mo113896b();
                }
            }
        }
        return this.f374480d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo113898f() {
        if (!this.f374482f) {
            this.f374482f = true;
            mo113897d().mo17653jN();
            C137671k kVar = (C137671k) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f374479c) {
            return null;
        }
        mo113895a();
        return this.f374478a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo113897d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f374478a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo113895a();
        mo113898f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo113895a();
        mo113898f();
    }
}
