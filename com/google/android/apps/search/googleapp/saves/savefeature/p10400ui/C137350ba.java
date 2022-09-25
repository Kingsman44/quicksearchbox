package com.google.android.apps.search.googleapp.saves.savefeature.p10400ui;

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

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.ui.ba */
/* compiled from: PG */
class C137350ba extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f373606a;

    /* renamed from: c */
    private boolean f373607c;

    /* renamed from: d */
    private volatile C47247a f373608d;

    /* renamed from: e */
    private final Object f373609e = new Object();

    /* renamed from: f */
    private boolean f373610f = false;

    /* renamed from: a */
    private final void mo113637a() {
        if (this.f373606a == null) {
            this.f373606a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f373607c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo113638b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo113678d() {
        if (this.f373608d == null) {
            synchronized (this.f373609e) {
                if (this.f373608d == null) {
                    this.f373608d = mo113638b();
                }
            }
        }
        return this.f373608d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo113679f() {
        if (!this.f373610f) {
            this.f373610f = true;
            mo113678d().mo17653jN();
            C137314ab abVar = (C137314ab) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f373607c) {
            return null;
        }
        mo113637a();
        return this.f373606a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo113678d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f373606a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo113637a();
        mo113679f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo113637a();
        mo113679f();
    }
}
