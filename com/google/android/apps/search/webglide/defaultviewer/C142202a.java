package com.google.android.apps.search.webglide.defaultviewer;

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

/* renamed from: com.google.android.apps.search.webglide.defaultviewer.a */
/* compiled from: PG */
class C142202a extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f385778a;

    /* renamed from: c */
    private boolean f385779c;

    /* renamed from: d */
    private volatile C47247a f385780d;

    /* renamed from: e */
    private final Object f385781e = new Object();

    /* renamed from: f */
    private boolean f385782f = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f385778a == null) {
            this.f385778a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f385779c = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C47247a mo117054a() {
        if (this.f385780d == null) {
            synchronized (this.f385781e) {
                if (this.f385780d == null) {
                    this.f385780d = mo117052b();
                }
            }
        }
        return this.f385780d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo117052b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo117055d() {
        if (!this.f385782f) {
            this.f385782f = true;
            mo117054a().mo17653jN();
            WebGlideDefaultFragment webGlideDefaultFragment = (WebGlideDefaultFragment) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f385779c) {
            return null;
        }
        mo17857e();
        return this.f385778a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo117054a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f385778a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo117055d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo117055d();
    }
}
