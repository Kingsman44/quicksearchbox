package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10290f;

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

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.f.f */
/* compiled from: PG */
class C135785f extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f369865a;

    /* renamed from: c */
    private boolean f369866c;

    /* renamed from: d */
    private volatile C47247a f369867d;

    /* renamed from: e */
    private final Object f369868e = new Object();

    /* renamed from: f */
    private boolean f369869f = false;

    /* renamed from: a */
    private final void m220329a() {
        if (this.f369865a == null) {
            this.f369865a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f369866c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C47247a mo112558d() {
        throw null;
    }

    /* renamed from: f */
    public final C47247a mo112559f() {
        if (this.f369867d == null) {
            synchronized (this.f369868e) {
                if (this.f369867d == null) {
                    this.f369867d = mo112558d();
                }
            }
        }
        return this.f369867d;
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f369866c) {
            return null;
        }
        m220329a();
        return this.f369865a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo112560j() {
        if (!this.f369869f) {
            this.f369869f = true;
            mo112559f().mo17653jN();
            C135782d dVar = (C135782d) this;
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo112559f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f369865a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        m220329a();
        mo112560j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        m220329a();
        mo112560j();
    }
}
