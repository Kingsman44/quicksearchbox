package com.google.android.apps.search.assistant.surfaces.onboarding.web;

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

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.web.q */
/* compiled from: PG */
class C126756q extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f349069a;

    /* renamed from: c */
    private boolean f349070c;

    /* renamed from: d */
    private volatile C47247a f349071d;

    /* renamed from: e */
    private final Object f349072e = new Object();

    /* renamed from: f */
    private boolean f349073f = false;

    /* renamed from: a */
    private final void mo107742a() {
        if (this.f349069a == null) {
            this.f349069a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f349070c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo107743b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo107745d() {
        if (this.f349071d == null) {
            synchronized (this.f349072e) {
                if (this.f349071d == null) {
                    this.f349071d = mo107743b();
                }
            }
        }
        return this.f349071d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo107746f() {
        if (!this.f349073f) {
            this.f349073f = true;
            mo107745d().mo17653jN();
            C126748i iVar = (C126748i) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f349070c) {
            return null;
        }
        mo107742a();
        return this.f349069a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo107745d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f349069a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo107742a();
        mo107746f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo107742a();
        mo107746f();
    }
}
