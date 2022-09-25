package com.google.android.libraries.lens.view.imageviewer;

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

/* renamed from: com.google.android.libraries.lens.view.imageviewer.v */
/* compiled from: PG */
class C26959v extends C0260w implements C68288b {

    /* renamed from: a */
    private ContextWrapper f73480a;

    /* renamed from: b */
    private boolean f73481b;

    /* renamed from: c */
    private volatile C47247a f73482c;

    /* renamed from: d */
    private final Object f73483d = new Object();

    /* renamed from: e */
    private boolean f73484e = false;

    /* renamed from: a */
    private final void mo32341a() {
        if (this.f73480a == null) {
            this.f73480a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f73481b = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo32342b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo32347d() {
        if (this.f73482c == null) {
            synchronized (this.f73483d) {
                if (this.f73482c == null) {
                    this.f73482c = mo32342b();
                }
            }
        }
        return this.f73482c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo32348f() {
        if (!this.f73484e) {
            this.f73484e = true;
            mo32347d().mo17653jN();
            C26952o oVar = (C26952o) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f73481b) {
            return null;
        }
        mo32341a();
        return this.f73480a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo32347d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f73480a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo32341a();
        mo32348f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo32341a();
        mo32348f();
    }
}
