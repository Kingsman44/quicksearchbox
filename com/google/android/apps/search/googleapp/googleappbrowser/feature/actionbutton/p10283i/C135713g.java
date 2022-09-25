package com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10283i;

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

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.i.g */
/* compiled from: PG */
class C135713g extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f369656a;

    /* renamed from: c */
    private boolean f369657c;

    /* renamed from: d */
    private volatile C47247a f369658d;

    /* renamed from: e */
    private final Object f369659e = new Object();

    /* renamed from: f */
    private boolean f369660f = false;

    /* renamed from: a */
    private final void mo112489a() {
        if (this.f369656a == null) {
            this.f369656a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f369657c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo112490b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo112491d() {
        if (this.f369658d == null) {
            synchronized (this.f369659e) {
                if (this.f369658d == null) {
                    this.f369658d = mo112490b();
                }
            }
        }
        return this.f369658d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo112492f() {
        if (!this.f369660f) {
            this.f369660f = true;
            mo112491d().mo17653jN();
            C135710d dVar = (C135710d) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f369657c) {
            return null;
        }
        mo112489a();
        return this.f369656a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo112491d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f369656a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo112489a();
        mo112492f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo112489a();
        mo112492f();
    }
}
