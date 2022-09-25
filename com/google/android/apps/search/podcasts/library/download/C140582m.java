package com.google.android.apps.search.podcasts.library.download;

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

/* renamed from: com.google.android.apps.search.podcasts.library.download.m */
/* compiled from: PG */
class C140582m extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f381799a;

    /* renamed from: c */
    private boolean f381800c;

    /* renamed from: d */
    private volatile C47247a f381801d;

    /* renamed from: e */
    private final Object f381802e = new Object();

    /* renamed from: f */
    private boolean f381803f = false;

    /* renamed from: a */
    private final void mo115748a() {
        if (this.f381799a == null) {
            this.f381799a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f381800c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo115749b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo115758d() {
        if (this.f381801d == null) {
            synchronized (this.f381802e) {
                if (this.f381801d == null) {
                    this.f381801d = mo115749b();
                }
            }
        }
        return this.f381801d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo115759f() {
        if (!this.f381803f) {
            this.f381803f = true;
            mo115758d().mo17653jN();
            DownloadFragment downloadFragment = (DownloadFragment) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f381800c) {
            return null;
        }
        mo115748a();
        return this.f381799a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo115758d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f381799a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo115748a();
        mo115759f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo115748a();
        mo115759f();
    }
}
