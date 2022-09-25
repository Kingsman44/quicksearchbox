package com.google.android.apps.search.webglide.navroot;

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

/* renamed from: com.google.android.apps.search.webglide.navroot.d */
/* compiled from: PG */
class C142229d extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f385855a;

    /* renamed from: c */
    private boolean f385856c;

    /* renamed from: d */
    private volatile C47247a f385857d;

    /* renamed from: e */
    private final Object f385858e = new Object();

    /* renamed from: f */
    private boolean f385859f = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f385855a == null) {
            this.f385855a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f385856c = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C47247a mo117070a() {
        if (this.f385857d == null) {
            synchronized (this.f385858e) {
                if (this.f385857d == null) {
                    this.f385857d = mo117071b();
                }
            }
        }
        return this.f385857d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo117071b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo117072d() {
        if (!this.f385859f) {
            this.f385859f = true;
            mo117070a().mo17653jN();
            C142240o oVar = (C142240o) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f385856c) {
            return null;
        }
        mo17857e();
        return this.f385855a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo117070a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f385855a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo117072d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo117072d();
    }
}
