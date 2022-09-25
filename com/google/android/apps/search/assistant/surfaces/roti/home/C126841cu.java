package com.google.android.apps.search.assistant.surfaces.roti.home;

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

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.cu */
/* compiled from: PG */
class C126841cu extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f349310a;

    /* renamed from: c */
    private boolean f349311c;

    /* renamed from: d */
    private volatile C47247a f349312d;

    /* renamed from: e */
    private final Object f349313e = new Object();

    /* renamed from: f */
    private boolean f349314f = false;

    /* renamed from: a */
    private final void mo107791a() {
        if (this.f349310a == null) {
            this.f349310a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f349311c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo107792b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo107828d() {
        if (this.f349312d == null) {
            synchronized (this.f349313e) {
                if (this.f349312d == null) {
                    this.f349312d = mo107792b();
                }
            }
        }
        return this.f349312d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo107829f() {
        if (!this.f349314f) {
            this.f349314f = true;
            mo107828d().mo17653jN();
            C126795bf bfVar = (C126795bf) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f349311c) {
            return null;
        }
        mo107791a();
        return this.f349310a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo107828d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f349310a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo107791a();
        mo107829f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo107791a();
        mo107829f();
    }
}
