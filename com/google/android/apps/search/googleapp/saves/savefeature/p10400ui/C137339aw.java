package com.google.android.apps.search.googleapp.saves.savefeature.p10400ui;

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

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.ui.aw */
/* compiled from: PG */
class C137339aw extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f373574a;

    /* renamed from: c */
    private boolean f373575c;

    /* renamed from: d */
    private volatile C47247a f373576d;

    /* renamed from: e */
    private final Object f373577e = new Object();

    /* renamed from: f */
    private boolean f373578f = false;

    /* renamed from: a */
    private final void mo113670a() {
        if (this.f373574a == null) {
            this.f373574a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f373575c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo113659b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo113660d() {
        if (this.f373576d == null) {
            synchronized (this.f373577e) {
                if (this.f373576d == null) {
                    this.f373576d = mo113659b();
                }
            }
        }
        return this.f373576d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo113661f() {
        if (!this.f373578f) {
            this.f373578f = true;
            mo113660d().mo17653jN();
            C137343b bVar = (C137343b) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f373575c) {
            return null;
        }
        mo113670a();
        return this.f373574a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo113660d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f373574a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo113670a();
        mo113661f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo113670a();
        mo113661f();
    }
}
