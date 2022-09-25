package com.google.android.libraries.lens.view.sampleimages;

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

/* renamed from: com.google.android.libraries.lens.view.sampleimages.p */
/* compiled from: PG */
class C27712p extends C0260w implements C68288b {

    /* renamed from: a */
    private ContextWrapper f75663a;

    /* renamed from: b */
    private boolean f75664b;

    /* renamed from: c */
    private volatile C47247a f75665c;

    /* renamed from: d */
    private final Object f75666d = new Object();

    /* renamed from: e */
    private boolean f75667e = false;

    /* renamed from: a */
    private final void mo33180a() {
        if (this.f75663a == null) {
            this.f75663a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f75664b = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo33181b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo33193d() {
        if (this.f75665c == null) {
            synchronized (this.f75666d) {
                if (this.f75665c == null) {
                    this.f75665c = mo33181b();
                }
            }
        }
        return this.f75665c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo33194f() {
        if (!this.f75667e) {
            this.f75667e = true;
            mo33193d().mo17653jN();
            C27701e eVar = (C27701e) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f75664b) {
            return null;
        }
        mo33180a();
        return this.f75663a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo33193d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f75663a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo33180a();
        mo33194f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo33180a();
        mo33194f();
    }
}
