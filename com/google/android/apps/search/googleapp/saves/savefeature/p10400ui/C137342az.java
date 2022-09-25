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

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.ui.az */
/* compiled from: PG */
class C137342az extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f373586a;

    /* renamed from: c */
    private boolean f373587c;

    /* renamed from: d */
    private volatile C47247a f373588d;

    /* renamed from: e */
    private final Object f373589e = new Object();

    /* renamed from: f */
    private boolean f373590f = false;

    /* renamed from: a */
    private final void m223149a() {
        if (this.f373586a == null) {
            this.f373586a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f373587c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C47247a mo113667d() {
        throw null;
    }

    /* renamed from: f */
    public final C47247a mo113668f() {
        if (this.f373588d == null) {
            synchronized (this.f373589e) {
                if (this.f373588d == null) {
                    this.f373588d = mo113667d();
                }
            }
        }
        return this.f373588d;
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f373587c) {
            return null;
        }
        m223149a();
        return this.f373586a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo113669j() {
        if (!this.f373590f) {
            this.f373590f = true;
            mo113668f().mo17653jN();
            C137370s sVar = (C137370s) this;
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo113668f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f373586a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        m223149a();
        mo113669j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        m223149a();
        mo113669j();
    }
}
