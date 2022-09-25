package com.google.android.libraries.lens.view.p2113h.p2132j;

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

/* renamed from: com.google.android.libraries.lens.view.h.j.h */
/* compiled from: PG */
class C26893h extends C0260w implements C68288b {

    /* renamed from: a */
    private ContextWrapper f73311a;

    /* renamed from: b */
    private boolean f73312b;

    /* renamed from: c */
    private volatile C47247a f73313c;

    /* renamed from: d */
    private final Object f73314d = new Object();

    /* renamed from: e */
    private boolean f73315e = false;

    /* renamed from: a */
    private final void mo32259a() {
        if (this.f73311a == null) {
            this.f73311a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f73312b = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo32260b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo32262d() {
        if (this.f73313c == null) {
            synchronized (this.f73314d) {
                if (this.f73313c == null) {
                    this.f73313c = mo32260b();
                }
            }
        }
        return this.f73313c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo32263f() {
        if (!this.f73315e) {
            this.f73315e = true;
            mo32262d().mo17653jN();
            C26888c cVar = (C26888c) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f73312b) {
            return null;
        }
        mo32259a();
        return this.f73311a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo32262d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f73311a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo32259a();
        mo32263f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo32259a();
        mo32263f();
    }
}
