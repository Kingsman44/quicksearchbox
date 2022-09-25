package com.google.android.libraries.web.contrib.p3358b.p3359a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
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

/* renamed from: com.google.android.libraries.web.contrib.b.a.m */
/* compiled from: PG */
class C43400m extends Fragment implements C68288b {

    /* renamed from: a */
    private ContextWrapper f113385a;

    /* renamed from: b */
    private boolean f113386b;

    /* renamed from: c */
    private volatile C47247a f113387c;

    /* renamed from: d */
    private final Object f113388d = new Object();

    /* renamed from: e */
    private boolean f113389e = false;

    /* renamed from: a */
    private final void mo46490a() {
        if (this.f113385a == null) {
            this.f113385a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f113386b = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo46491b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo46498d() {
        if (this.f113387c == null) {
            synchronized (this.f113388d) {
                if (this.f113387c == null) {
                    this.f113387c = mo46491b();
                }
            }
        }
        return this.f113387c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo46499f() {
        if (!this.f113389e) {
            this.f113389e = true;
            mo46498d().mo17653jN();
            C43389b bVar = (C43389b) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f113386b) {
            return null;
        }
        mo46490a();
        return this.f113385a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo46498d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f113385a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo46490a();
        mo46499f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo46490a();
        mo46499f();
    }
}
