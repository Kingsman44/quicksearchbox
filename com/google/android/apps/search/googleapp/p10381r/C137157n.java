package com.google.android.apps.search.googleapp.p10381r;

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

/* renamed from: com.google.android.apps.search.googleapp.r.n */
/* compiled from: PG */
class C137157n extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f373212a;

    /* renamed from: c */
    private boolean f373213c;

    /* renamed from: d */
    private volatile C47247a f373214d;

    /* renamed from: e */
    private final Object f373215e = new Object();

    /* renamed from: f */
    private boolean f373216f = false;

    /* renamed from: a */
    private final void mo113570a() {
        if (this.f373212a == null) {
            this.f373212a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f373213c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo113571b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo113574d() {
        if (this.f373214d == null) {
            synchronized (this.f373215e) {
                if (this.f373214d == null) {
                    this.f373214d = mo113571b();
                }
            }
        }
        return this.f373214d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo113575f() {
        if (!this.f373216f) {
            this.f373216f = true;
            mo113574d().mo17653jN();
            C137152i iVar = (C137152i) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f373213c) {
            return null;
        }
        mo113570a();
        return this.f373212a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo113574d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f373212a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo113570a();
        mo113575f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo113570a();
        mo113575f();
    }
}
