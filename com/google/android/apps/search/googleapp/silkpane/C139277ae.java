package com.google.android.apps.search.googleapp.silkpane;

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

/* renamed from: com.google.android.apps.search.googleapp.silkpane.ae */
/* compiled from: PG */
class C139277ae extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f378822a;

    /* renamed from: c */
    private boolean f378823c;

    /* renamed from: d */
    private volatile C47247a f378824d;

    /* renamed from: e */
    private final Object f378825e = new Object();

    /* renamed from: f */
    private boolean f378826f = false;

    /* renamed from: a */
    private final void mo114884a() {
        if (this.f378822a == null) {
            this.f378822a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f378823c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo114874b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo114875d() {
        if (this.f378824d == null) {
            synchronized (this.f378825e) {
                if (this.f378824d == null) {
                    this.f378824d = mo114874b();
                }
            }
        }
        return this.f378824d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo114876f() {
        if (!this.f378826f) {
            this.f378826f = true;
            mo114875d().mo17653jN();
            C139303y yVar = (C139303y) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f378823c) {
            return null;
        }
        mo114884a();
        return this.f378822a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo114875d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f378822a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo114884a();
        mo114876f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo114884a();
        mo114876f();
    }
}
