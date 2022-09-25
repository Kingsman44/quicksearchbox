package com.google.android.apps.search.googleapp.discover.secondscreen;

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

/* renamed from: com.google.android.apps.search.googleapp.discover.secondscreen.q */
/* compiled from: PG */
class C134626q extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f366613a;

    /* renamed from: c */
    private boolean f366614c;

    /* renamed from: d */
    private volatile C47247a f366615d;

    /* renamed from: e */
    private final Object f366616e = new Object();

    /* renamed from: f */
    private boolean f366617f = false;

    /* renamed from: a */
    private final void mo111847a() {
        if (this.f366613a == null) {
            this.f366613a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f366614c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo111848b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo111852d() {
        if (this.f366615d == null) {
            synchronized (this.f366616e) {
                if (this.f366615d == null) {
                    this.f366615d = mo111848b();
                }
            }
        }
        return this.f366615d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo111853f() {
        if (!this.f366617f) {
            this.f366617f = true;
            mo111852d().mo17653jN();
            C134619j jVar = (C134619j) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f366614c) {
            return null;
        }
        mo111847a();
        return this.f366613a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo111852d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f366613a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo111847a();
        mo111853f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo111847a();
        mo111853f();
    }
}
