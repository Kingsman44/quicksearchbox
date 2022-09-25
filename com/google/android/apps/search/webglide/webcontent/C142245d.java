package com.google.android.apps.search.webglide.webcontent;

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

/* renamed from: com.google.android.apps.search.webglide.webcontent.d */
/* compiled from: PG */
class C142245d extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f385893a;

    /* renamed from: c */
    private boolean f385894c;

    /* renamed from: d */
    private volatile C47247a f385895d;

    /* renamed from: e */
    private final Object f385896e = new Object();

    /* renamed from: f */
    private boolean f385897f = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f385893a == null) {
            this.f385893a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f385894c = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C47247a mo117079a() {
        if (this.f385895d == null) {
            synchronized (this.f385896e) {
                if (this.f385895d == null) {
                    this.f385895d = mo117080b();
                }
            }
        }
        return this.f385895d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo117080b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo117081d() {
        if (!this.f385897f) {
            this.f385897f = true;
            mo117079a().mo17653jN();
            C142249h hVar = (C142249h) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f385894c) {
            return null;
        }
        mo17857e();
        return this.f385893a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo117079a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f385893a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo117081d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo117081d();
    }
}
