package com.google.android.libraries.lens.view.filters;

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

/* renamed from: com.google.android.libraries.lens.view.filters.bi */
/* compiled from: PG */
class C25930bi extends Fragment implements C68288b {

    /* renamed from: a */
    private ContextWrapper f70447a;

    /* renamed from: b */
    private boolean f70448b;

    /* renamed from: c */
    private volatile C47247a f70449c;

    /* renamed from: d */
    private final Object f70450d = new Object();

    /* renamed from: e */
    private boolean f70451e = false;

    /* renamed from: a */
    private final void mo31221a() {
        if (this.f70447a == null) {
            this.f70447a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f70448b = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo31090b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo31091d() {
        if (this.f70449c == null) {
            synchronized (this.f70450d) {
                if (this.f70449c == null) {
                    this.f70449c = mo31090b();
                }
            }
        }
        return this.f70449c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo31092f() {
        if (!this.f70451e) {
            this.f70451e = true;
            mo31091d().mo17653jN();
            C26019p pVar = (C26019p) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f70448b) {
            return null;
        }
        mo31221a();
        return this.f70447a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo31091d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f70447a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo31221a();
        mo31092f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo31221a();
        mo31092f();
    }
}
