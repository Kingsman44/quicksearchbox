package com.google.android.apps.search.podcasts.explore;

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

/* renamed from: com.google.android.apps.search.podcasts.explore.o */
/* compiled from: PG */
class C140277o extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f381097a;

    /* renamed from: c */
    private boolean f381098c;

    /* renamed from: d */
    private volatile C47247a f381099d;

    /* renamed from: e */
    private final Object f381100e = new Object();

    /* renamed from: f */
    private boolean f381101f = false;

    /* renamed from: a */
    private final void mo115538a() {
        if (this.f381097a == null) {
            this.f381097a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f381098c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo115539b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo115545d() {
        if (this.f381099d == null) {
            synchronized (this.f381100e) {
                if (this.f381099d == null) {
                    this.f381099d = mo115539b();
                }
            }
        }
        return this.f381099d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo115546f() {
        if (!this.f381101f) {
            this.f381101f = true;
            mo115545d().mo17653jN();
            C140272k kVar = (C140272k) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f381098c) {
            return null;
        }
        mo115538a();
        return this.f381097a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo115545d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f381097a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo115538a();
        mo115546f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo115538a();
        mo115546f();
    }
}
