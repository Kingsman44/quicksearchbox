package com.google.android.apps.search.googleapp.discover.settings.p10218c;

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

/* renamed from: com.google.android.apps.search.googleapp.discover.settings.c.w */
/* compiled from: PG */
class C134663w extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f366711a;

    /* renamed from: c */
    private boolean f366712c;

    /* renamed from: d */
    private volatile C47247a f366713d;

    /* renamed from: e */
    private final Object f366714e = new Object();

    /* renamed from: f */
    private boolean f366715f = false;

    /* renamed from: a */
    private final void mo111857a() {
        if (this.f366711a == null) {
            this.f366711a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f366712c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo111858b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo111866d() {
        if (this.f366713d == null) {
            synchronized (this.f366714e) {
                if (this.f366713d == null) {
                    this.f366713d = mo111858b();
                }
            }
        }
        return this.f366713d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo111867f() {
        if (!this.f366715f) {
            this.f366715f = true;
            mo111866d().mo17653jN();
            C134648i iVar = (C134648i) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f366712c) {
            return null;
        }
        mo111857a();
        return this.f366711a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo111866d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f366711a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo111857a();
        mo111867f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo111857a();
        mo111867f();
    }
}
