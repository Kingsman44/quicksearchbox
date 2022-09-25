package com.google.android.apps.search.podcasts.show;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1629c.p1630a.C19521a;
import com.google.apps.tiktok.inject.p3654a.p3655a.C47189c;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.apps.search.podcasts.show.an */
/* compiled from: PG */
class C141129an extends C19521a implements C68288b {

    /* renamed from: b */
    private ContextWrapper f383160b;

    /* renamed from: c */
    private boolean f383161c;

    /* renamed from: d */
    private volatile C47247a f383162d;

    /* renamed from: e */
    private final Object f383163e = new Object();

    /* renamed from: f */
    private boolean f383164f = false;

    /* renamed from: a */
    private final void mo18360a() {
        if (this.f383160b == null) {
            this.f383160b = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f383161c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo116167b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo116168d() {
        if (this.f383162d == null) {
            synchronized (this.f383163e) {
                if (this.f383162d == null) {
                    this.f383162d = mo116167b();
                }
            }
        }
        return this.f383162d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo116169f() {
        if (!this.f383164f) {
            this.f383164f = true;
            mo116168d().mo17653jN();
            C141133b bVar = (C141133b) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f383161c) {
            return null;
        }
        mo18360a();
        return this.f383160b;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo116168d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f383160b;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo18360a();
        mo116169f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo18360a();
        mo116169f();
    }
}
