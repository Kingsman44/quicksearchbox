package com.google.android.apps.search.weather.p10686e;

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

/* renamed from: com.google.android.apps.search.weather.e.h */
/* compiled from: PG */
class C142085h extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f385481a;

    /* renamed from: c */
    private boolean f385482c;

    /* renamed from: d */
    private volatile C47247a f385483d;

    /* renamed from: e */
    private final Object f385484e = new Object();

    /* renamed from: f */
    private boolean f385485f = false;

    /* renamed from: a */
    private final void mo116999a() {
        if (this.f385481a == null) {
            this.f385481a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f385482c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo117000b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo117001d() {
        if (this.f385483d == null) {
            synchronized (this.f385484e) {
                if (this.f385483d == null) {
                    this.f385483d = mo117000b();
                }
            }
        }
        return this.f385483d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo117002f() {
        if (!this.f385485f) {
            this.f385485f = true;
            mo117001d().mo17653jN();
            C142079b bVar = (C142079b) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f385482c) {
            return null;
        }
        mo116999a();
        return this.f385481a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo117001d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f385481a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo116999a();
        mo117002f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo116999a();
        mo117002f();
    }
}
