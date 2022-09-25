package com.google.android.libraries.lens.view.p2057ag;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.C0260w;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.apps.tiktok.inject.p3654a.p3655a.C47189c;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.libraries.lens.view.ag.p */
/* compiled from: PG */
class C25114p extends C0260w implements C68288b {

    /* renamed from: a */
    private ContextWrapper f68406a;

    /* renamed from: b */
    private boolean f68407b;

    /* renamed from: c */
    private volatile C47247a f68408c;

    /* renamed from: d */
    private final Object f68409d = new Object();

    /* renamed from: e */
    private boolean f68410e = false;

    /* renamed from: a */
    private final void mo30259a() {
        if (this.f68406a == null) {
            this.f68406a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f68407b = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo30260b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo30265d() {
        if (this.f68408c == null) {
            synchronized (this.f68409d) {
                if (this.f68408c == null) {
                    this.f68408c = mo30260b();
                }
            }
        }
        return this.f68408c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo30266f() {
        if (!this.f68410e) {
            this.f68410e = true;
            mo30265d().mo17653jN();
            C25105g gVar = (C25105g) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f68407b) {
            return null;
        }
        mo30259a();
        return this.f68406a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo30265d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f68406a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo30259a();
        mo30266f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo30259a();
        mo30266f();
    }
}
