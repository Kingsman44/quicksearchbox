package com.google.android.libraries.lens.view.filters.translation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.C0260w;
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

/* renamed from: com.google.android.libraries.lens.view.filters.translation.u */
/* compiled from: PG */
class C26227u extends C0260w implements C68288b {

    /* renamed from: a */
    private ContextWrapper f71265a;

    /* renamed from: b */
    private boolean f71266b;

    /* renamed from: c */
    private volatile C47247a f71267c;

    /* renamed from: d */
    private final Object f71268d = new Object();

    /* renamed from: e */
    private boolean f71269e = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f71265a == null) {
            this.f71265a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f71266b = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C47247a mo31446a() {
        if (this.f71267c == null) {
            synchronized (this.f71268d) {
                if (this.f71267c == null) {
                    this.f71267c = mo31272b();
                }
            }
        }
        return this.f71267c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo31272b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo31447d() {
        if (!this.f71269e) {
            this.f71269e = true;
            mo31446a().mo17653jN();
            C26065bc bcVar = (C26065bc) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f71266b) {
            return null;
        }
        mo17857e();
        return this.f71265a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo31446a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f71265a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo31447d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo31447d();
    }
}
