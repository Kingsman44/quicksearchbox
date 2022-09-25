package com.google.android.apps.search.googleapp.search.settings;

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

/* renamed from: com.google.android.apps.search.googleapp.search.settings.e */
/* compiled from: PG */
class C137611e extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f374313a;

    /* renamed from: c */
    private boolean f374314c;

    /* renamed from: d */
    private volatile C47247a f374315d;

    /* renamed from: e */
    private final Object f374316e = new Object();

    /* renamed from: f */
    private boolean f374317f = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f374313a == null) {
            this.f374313a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f374314c = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C47247a mo113857a() {
        if (this.f374315d == null) {
            synchronized (this.f374316e) {
                if (this.f374315d == null) {
                    this.f374315d = mo113858b();
                }
            }
        }
        return this.f374315d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo113858b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo113859d() {
        if (!this.f374317f) {
            this.f374317f = true;
            mo113857a().mo17653jN();
            C137639g gVar = (C137639g) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f374314c) {
            return null;
        }
        mo17857e();
        return this.f374313a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo113857a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f374313a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo113859d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo113859d();
    }
}
