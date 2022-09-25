package com.google.android.libraries.lens.view;

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

/* renamed from: com.google.android.libraries.lens.view.ad */
/* compiled from: PG */
class C24977ad extends Fragment implements C68288b {

    /* renamed from: a */
    private ContextWrapper f68125a;

    /* renamed from: b */
    private boolean f68126b;

    /* renamed from: c */
    private volatile C47247a f68127c;

    /* renamed from: d */
    private final Object f68128d = new Object();

    /* renamed from: e */
    private boolean f68129e = false;

    /* renamed from: a */
    private final void mo32264a() {
        if (this.f68125a == null) {
            this.f68125a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f68126b = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo30193b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo30194d() {
        if (this.f68127c == null) {
            synchronized (this.f68128d) {
                if (this.f68127c == null) {
                    this.f68127c = mo30193b();
                }
            }
        }
        return this.f68127c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo30195f() {
        if (!this.f68129e) {
            this.f68129e = true;
            mo30194d().mo17653jN();
            C26894i iVar = (C26894i) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f68126b) {
            return null;
        }
        mo32264a();
        return this.f68125a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo30194d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f68125a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo32264a();
        mo30195f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo32264a();
        mo30195f();
    }
}
