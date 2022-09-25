package com.google.android.libraries.lens.view.p2092c;

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

/* renamed from: com.google.android.libraries.lens.view.c.ae */
/* compiled from: PG */
class C25704ae extends Fragment implements C68288b {

    /* renamed from: a */
    private ContextWrapper f69888a;

    /* renamed from: b */
    private boolean f69889b;

    /* renamed from: c */
    private volatile C47247a f69890c;

    /* renamed from: d */
    private final Object f69891d = new Object();

    /* renamed from: e */
    private boolean f69892e = false;

    /* renamed from: a */
    private final void mo30845a() {
        if (this.f69888a == null) {
            this.f69888a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f69889b = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo30840b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo30841d() {
        if (this.f69890c == null) {
            synchronized (this.f69891d) {
                if (this.f69890c == null) {
                    this.f69890c = mo30840b();
                }
            }
        }
        return this.f69890c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo30842f() {
        if (!this.f69892e) {
            this.f69892e = true;
            mo30841d().mo17653jN();
            C25707c cVar = (C25707c) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f69889b) {
            return null;
        }
        mo30845a();
        return this.f69888a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo30841d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f69888a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo30845a();
        mo30842f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo30845a();
        mo30842f();
    }
}
