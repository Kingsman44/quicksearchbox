package com.google.android.libraries.lens.view.gallery;

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

/* renamed from: com.google.android.libraries.lens.view.gallery.at */
/* compiled from: PG */
class C26319at extends Fragment implements C68288b {

    /* renamed from: a */
    private ContextWrapper f71543a;

    /* renamed from: b */
    private boolean f71544b;

    /* renamed from: c */
    private volatile C47247a f71545c;

    /* renamed from: d */
    private final Object f71546d = new Object();

    /* renamed from: e */
    private boolean f71547e = false;

    /* renamed from: a */
    private final void mo31626a() {
        if (this.f71543a == null) {
            this.f71543a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f71544b = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo31520b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo31521d() {
        if (this.f71545c == null) {
            synchronized (this.f71546d) {
                if (this.f71545c == null) {
                    this.f71545c = mo31520b();
                }
            }
        }
        return this.f71545c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo31522f() {
        if (!this.f71547e) {
            this.f71547e = true;
            mo31521d().mo17653jN();
            C26422i iVar = (C26422i) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f71544b) {
            return null;
        }
        mo31626a();
        return this.f71543a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo31521d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f71543a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo31626a();
        mo31522f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo31626a();
        mo31522f();
    }
}
