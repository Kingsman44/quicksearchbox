package com.google.android.apps.search.googleapp.search.srp;

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

/* renamed from: com.google.android.apps.search.googleapp.search.srp.aw */
/* compiled from: PG */
class C137724aw extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f374631a;

    /* renamed from: c */
    private boolean f374632c;

    /* renamed from: d */
    private volatile C47247a f374633d;

    /* renamed from: e */
    private final Object f374634e = new Object();

    /* renamed from: f */
    private boolean f374635f = false;

    /* renamed from: a */
    private final void mo113933a() {
        if (this.f374631a == null) {
            this.f374631a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f374632c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo113927b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo113928d() {
        if (this.f374633d == null) {
            synchronized (this.f374634e) {
                if (this.f374633d == null) {
                    this.f374633d = mo113927b();
                }
            }
        }
        return this.f374633d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo113929f() {
        if (!this.f374635f) {
            this.f374635f = true;
            mo113928d().mo17653jN();
            C137733c cVar = (C137733c) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f374632c) {
            return null;
        }
        mo113933a();
        return this.f374631a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo113928d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f374631a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo113933a();
        mo113929f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo113933a();
        mo113929f();
    }
}
