package com.google.android.apps.search.assistant.surfaces.onboarding.oobe;

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

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.oobe.u */
/* compiled from: PG */
class C126683u extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f348862a;

    /* renamed from: c */
    private boolean f348863c;

    /* renamed from: d */
    private volatile C47247a f348864d;

    /* renamed from: e */
    private final Object f348865e = new Object();

    /* renamed from: f */
    private boolean f348866f = false;

    /* renamed from: a */
    private final void mo107670a() {
        if (this.f348862a == null) {
            this.f348862a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f348863c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo107671b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo107676d() {
        if (this.f348864d == null) {
            synchronized (this.f348865e) {
                if (this.f348864d == null) {
                    this.f348864d = mo107671b();
                }
            }
        }
        return this.f348864d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo107677f() {
        if (!this.f348866f) {
            this.f348866f = true;
            mo107676d().mo17653jN();
            C126669j jVar = (C126669j) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f348863c) {
            return null;
        }
        mo107670a();
        return this.f348862a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo107676d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f348862a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo107670a();
        mo107677f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo107670a();
        mo107677f();
    }
}
