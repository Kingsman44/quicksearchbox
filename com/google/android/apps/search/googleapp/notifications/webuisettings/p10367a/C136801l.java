package com.google.android.apps.search.googleapp.notifications.webuisettings.p10367a;

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

/* renamed from: com.google.android.apps.search.googleapp.notifications.webuisettings.a.l */
/* compiled from: PG */
class C136801l extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f372384a;

    /* renamed from: c */
    private boolean f372385c;

    /* renamed from: d */
    private volatile C47247a f372386d;

    /* renamed from: e */
    private final Object f372387e = new Object();

    /* renamed from: f */
    private boolean f372388f = false;

    /* renamed from: a */
    private final void mo113371a() {
        if (this.f372384a == null) {
            this.f372384a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f372385c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo113372b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo113375d() {
        if (this.f372386d == null) {
            synchronized (this.f372387e) {
                if (this.f372386d == null) {
                    this.f372386d = mo113372b();
                }
            }
        }
        return this.f372386d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo113376f() {
        if (!this.f372388f) {
            this.f372388f = true;
            mo113375d().mo17653jN();
            C136795f fVar = (C136795f) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f372385c) {
            return null;
        }
        mo113371a();
        return this.f372384a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo113375d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f372384a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo113371a();
        mo113376f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo113371a();
        mo113376f();
    }
}
