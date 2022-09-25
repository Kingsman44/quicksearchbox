package com.google.android.apps.search.googleapp.search.suggest.p10464ui;

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

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.bi */
/* compiled from: PG */
class C138600bi extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f376944a;

    /* renamed from: c */
    private boolean f376945c;

    /* renamed from: d */
    private volatile C47247a f376946d;

    /* renamed from: e */
    private final Object f376947e = new Object();

    /* renamed from: f */
    private boolean f376948f = false;

    /* renamed from: a */
    private final void mo114320a() {
        if (this.f376944a == null) {
            this.f376944a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f376945c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo114321b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo114387d() {
        if (this.f376946d == null) {
            synchronized (this.f376947e) {
                if (this.f376946d == null) {
                    this.f376946d = mo114321b();
                }
            }
        }
        return this.f376946d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo114388f() {
        if (!this.f376948f) {
            this.f376948f = true;
            mo114387d().mo17653jN();
            C138546aa aaVar = (C138546aa) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f376945c) {
            return null;
        }
        mo114320a();
        return this.f376944a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo114387d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f376944a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo114320a();
        mo114388f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo114320a();
        mo114388f();
    }
}
