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

/* renamed from: com.google.android.libraries.lens.view.c.af */
/* compiled from: PG */
class C25705af extends Fragment implements C68288b {

    /* renamed from: a */
    private ContextWrapper f69893a;

    /* renamed from: b */
    private boolean f69894b;

    /* renamed from: c */
    private volatile C47247a f69895c;

    /* renamed from: d */
    private final Object f69896d = new Object();

    /* renamed from: e */
    private boolean f69897e = false;

    /* renamed from: a */
    private final void mo30833a() {
        if (this.f69893a == null) {
            this.f69893a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f69894b = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo30834b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo30843d() {
        if (this.f69895c == null) {
            synchronized (this.f69896d) {
                if (this.f69895c == null) {
                    this.f69895c = mo30834b();
                }
            }
        }
        return this.f69895c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo30844f() {
        if (!this.f69897e) {
            this.f69897e = true;
            mo30843d().mo17653jN();
            C25700aa aaVar = (C25700aa) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f69894b) {
            return null;
        }
        mo30833a();
        return this.f69893a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo30843d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f69893a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo30833a();
        mo30844f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo30833a();
        mo30844f();
    }
}
