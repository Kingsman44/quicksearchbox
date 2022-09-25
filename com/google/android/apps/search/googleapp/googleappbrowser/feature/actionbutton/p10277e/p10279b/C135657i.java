package com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10277e.p10279b;

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

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.e.b.i */
/* compiled from: PG */
class C135657i extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f369515a;

    /* renamed from: c */
    private boolean f369516c;

    /* renamed from: d */
    private volatile C47247a f369517d;

    /* renamed from: e */
    private final Object f369518e = new Object();

    /* renamed from: f */
    private boolean f369519f = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f369515a == null) {
            this.f369515a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f369516c = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C47247a mo112446a() {
        if (this.f369517d == null) {
            synchronized (this.f369518e) {
                if (this.f369517d == null) {
                    this.f369517d = mo112447b();
                }
            }
        }
        return this.f369517d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo112447b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo112448d() {
        if (!this.f369519f) {
            this.f369519f = true;
            mo112446a().mo17653jN();
            C135659k kVar = (C135659k) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f369516c) {
            return null;
        }
        mo17857e();
        return this.f369515a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo112446a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f369515a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo112448d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo112448d();
    }
}
