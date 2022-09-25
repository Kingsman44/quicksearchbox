package com.google.android.apps.search.googleapp.customtabs.features.buttons.share;

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

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.buttons.share.r */
/* compiled from: PG */
class C133868r extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f364605a;

    /* renamed from: c */
    private boolean f364606c;

    /* renamed from: d */
    private volatile C47247a f364607d;

    /* renamed from: e */
    private final Object f364608e = new Object();

    /* renamed from: f */
    private boolean f364609f = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f364605a == null) {
            this.f364605a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f364606c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C47247a mo111434a() {
        throw null;
    }

    /* renamed from: b */
    public final C47247a mo111436b() {
        if (this.f364607d == null) {
            synchronized (this.f364608e) {
                if (this.f364607d == null) {
                    this.f364607d = mo111434a();
                }
            }
        }
        return this.f364607d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo111437d() {
        if (!this.f364609f) {
            this.f364609f = true;
            mo111436b().mo17653jN();
            C133862l lVar = (C133862l) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f364606c) {
            return null;
        }
        mo17857e();
        return this.f364605a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo111436b().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f364605a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo111437d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo111437d();
    }
}
