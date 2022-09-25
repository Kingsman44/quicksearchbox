package com.google.android.libraries.lens.view.imageviewer;

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

/* renamed from: com.google.android.libraries.lens.view.imageviewer.u */
/* compiled from: PG */
class C26958u extends Fragment implements C68288b {

    /* renamed from: a */
    private ContextWrapper f73475a;

    /* renamed from: b */
    private boolean f73476b;

    /* renamed from: c */
    private volatile C47247a f73477c;

    /* renamed from: d */
    private final Object f73478d = new Object();

    /* renamed from: e */
    private boolean f73479e = false;

    /* renamed from: a */
    private final void mo32334a() {
        if (this.f73475a == null) {
            this.f73475a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f73476b = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo32335b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo32345d() {
        if (this.f73477c == null) {
            synchronized (this.f73478d) {
                if (this.f73477c == null) {
                    this.f73477c = mo32335b();
                }
            }
        }
        return this.f73477c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo32346f() {
        if (!this.f73479e) {
            this.f73479e = true;
            mo32345d().mo17653jN();
            C26940d dVar = (C26940d) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f73476b) {
            return null;
        }
        mo32334a();
        return this.f73475a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo32345d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f73475a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo32334a();
        mo32346f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo32334a();
        mo32346f();
    }
}
