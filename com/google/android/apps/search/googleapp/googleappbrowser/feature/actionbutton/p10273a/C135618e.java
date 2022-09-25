package com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10273a;

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

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.a.e */
/* compiled from: PG */
class C135618e extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f369420a;

    /* renamed from: c */
    private boolean f369421c;

    /* renamed from: d */
    private volatile C47247a f369422d;

    /* renamed from: e */
    private final Object f369423e = new Object();

    /* renamed from: f */
    private boolean f369424f = false;

    /* renamed from: a */
    private final void mo112418a() {
        if (this.f369420a == null) {
            this.f369420a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f369421c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo112419b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo112420d() {
        if (this.f369422d == null) {
            synchronized (this.f369423e) {
                if (this.f369422d == null) {
                    this.f369422d = mo112419b();
                }
            }
        }
        return this.f369422d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo112421f() {
        if (!this.f369424f) {
            this.f369424f = true;
            mo112420d().mo17653jN();
            C135616c cVar = (C135616c) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f369421c) {
            return null;
        }
        mo112418a();
        return this.f369420a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo112420d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f369420a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo112418a();
        mo112421f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo112418a();
        mo112421f();
    }
}
