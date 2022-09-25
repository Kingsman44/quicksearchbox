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

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.oobe.v */
/* compiled from: PG */
class C126684v extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f348867a;

    /* renamed from: c */
    private boolean f348868c;

    /* renamed from: d */
    private volatile C47247a f348869d;

    /* renamed from: e */
    private final Object f348870e = new Object();

    /* renamed from: f */
    private boolean f348871f = false;

    /* renamed from: a */
    private final void mo107674a() {
        if (this.f348867a == null) {
            this.f348867a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f348868c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo107675b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo107678d() {
        if (this.f348869d == null) {
            synchronized (this.f348870e) {
                if (this.f348869d == null) {
                    this.f348869d = mo107675b();
                }
            }
        }
        return this.f348869d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo107679f() {
        if (!this.f348871f) {
            this.f348871f = true;
            mo107678d().mo17653jN();
            C126679q qVar = (C126679q) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f348868c) {
            return null;
        }
        mo107674a();
        return this.f348867a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo107678d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f348867a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo107674a();
        mo107679f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo107674a();
        mo107679f();
    }
}
