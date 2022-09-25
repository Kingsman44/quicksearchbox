package com.google.android.apps.search.googleapp.accounts.p10126ui.features.help;

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

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.features.help.p */
/* compiled from: PG */
class C133320p extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f363292a;

    /* renamed from: c */
    private boolean f363293c;

    /* renamed from: d */
    private volatile C47247a f363294d;

    /* renamed from: e */
    private final Object f363295e = new Object();

    /* renamed from: f */
    private boolean f363296f = false;

    /* renamed from: a */
    private final void mo111072a() {
        if (this.f363292a == null) {
            this.f363292a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f363293c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo111073b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo111076d() {
        if (this.f363294d == null) {
            synchronized (this.f363295e) {
                if (this.f363294d == null) {
                    this.f363294d = mo111073b();
                }
            }
        }
        return this.f363294d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo111077f() {
        if (!this.f363296f) {
            this.f363296f = true;
            mo111076d().mo17653jN();
            C133313j jVar = (C133313j) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f363293c) {
            return null;
        }
        mo111072a();
        return this.f363292a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo111076d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f363292a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo111072a();
        mo111077f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo111072a();
        mo111077f();
    }
}
