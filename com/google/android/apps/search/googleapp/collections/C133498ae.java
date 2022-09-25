package com.google.android.apps.search.googleapp.collections;

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

/* renamed from: com.google.android.apps.search.googleapp.collections.ae */
/* compiled from: PG */
class C133498ae extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f363754a;

    /* renamed from: c */
    private boolean f363755c;

    /* renamed from: d */
    private volatile C47247a f363756d;

    /* renamed from: e */
    private final Object f363757e = new Object();

    /* renamed from: f */
    private boolean f363758f = false;

    /* renamed from: a */
    private final void mo111194a() {
        if (this.f363754a == null) {
            this.f363754a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f363755c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo111195b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo111202d() {
        if (this.f363756d == null) {
            synchronized (this.f363757e) {
                if (this.f363756d == null) {
                    this.f363756d = mo111195b();
                }
            }
        }
        return this.f363756d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo111203f() {
        if (!this.f363758f) {
            this.f363758f = true;
            mo111202d().mo17653jN();
            CollectionsTabFragment collectionsTabFragment = (CollectionsTabFragment) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f363755c) {
            return null;
        }
        mo111194a();
        return this.f363754a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo111202d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f363754a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo111194a();
        mo111203f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo111194a();
        mo111203f();
    }
}
