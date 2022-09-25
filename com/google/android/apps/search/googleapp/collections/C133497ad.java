package com.google.android.apps.search.googleapp.collections;

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

/* renamed from: com.google.android.apps.search.googleapp.collections.ad */
/* compiled from: PG */
class C133497ad extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f363749a;

    /* renamed from: c */
    private boolean f363750c;

    /* renamed from: d */
    private volatile C47247a f363751d;

    /* renamed from: e */
    private final Object f363752e = new Object();

    /* renamed from: f */
    private boolean f363753f = false;

    /* renamed from: a */
    private final void mo111210a() {
        if (this.f363749a == null) {
            this.f363749a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f363750c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo111199b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo111200d() {
        if (this.f363751d == null) {
            synchronized (this.f363752e) {
                if (this.f363751d == null) {
                    this.f363751d = mo111199b();
                }
            }
        }
        return this.f363751d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo111201f() {
        if (!this.f363753f) {
            this.f363753f = true;
            mo111200d().mo17653jN();
            C133512j jVar = (C133512j) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f363750c) {
            return null;
        }
        mo111210a();
        return this.f363749a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo111200d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f363749a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo111210a();
        mo111201f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo111210a();
        mo111201f();
    }
}
