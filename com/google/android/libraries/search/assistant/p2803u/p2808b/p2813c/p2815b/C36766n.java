package com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b;

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

/* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.n */
/* compiled from: PG */
class C36766n extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f95812a;

    /* renamed from: c */
    private boolean f95813c;

    /* renamed from: d */
    private volatile C47247a f95814d;

    /* renamed from: e */
    private final Object f95815e = new Object();

    /* renamed from: f */
    private boolean f95816f = false;

    /* renamed from: a */
    private final void mo40373a() {
        if (this.f95812a == null) {
            this.f95812a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f95813c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo40374b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo40379d() {
        if (this.f95814d == null) {
            synchronized (this.f95815e) {
                if (this.f95814d == null) {
                    this.f95814d = mo40374b();
                }
            }
        }
        return this.f95814d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo40380f() {
        if (!this.f95816f) {
            this.f95816f = true;
            mo40379d().mo17653jN();
            C36762j jVar = (C36762j) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f95813c) {
            return null;
        }
        mo40373a();
        return this.f95812a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo40379d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f95812a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo40373a();
        mo40380f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo40373a();
        mo40380f();
    }
}
