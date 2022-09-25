package com.google.android.apps.search.googleapp.discover.fullcoverage;

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

/* renamed from: com.google.android.apps.search.googleapp.discover.fullcoverage.p */
/* compiled from: PG */
class C134329p extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f365889a;

    /* renamed from: c */
    private boolean f365890c;

    /* renamed from: d */
    private volatile C47247a f365891d;

    /* renamed from: e */
    private final Object f365892e = new Object();

    /* renamed from: f */
    private boolean f365893f = false;

    /* renamed from: a */
    private final void mo111730a() {
        if (this.f365889a == null) {
            this.f365889a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f365890c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo111731b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo111736d() {
        if (this.f365891d == null) {
            synchronized (this.f365892e) {
                if (this.f365891d == null) {
                    this.f365891d = mo111731b();
                }
            }
        }
        return this.f365891d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo111737f() {
        if (!this.f365893f) {
            this.f365893f = true;
            mo111736d().mo17653jN();
            C134321h hVar = (C134321h) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f365890c) {
            return null;
        }
        mo111730a();
        return this.f365889a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo111736d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f365889a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo111730a();
        mo111737f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo111730a();
        mo111737f();
    }
}
