package com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard;

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

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.ay */
/* compiled from: PG */
class C126711ay extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f348970a;

    /* renamed from: c */
    private boolean f348971c;

    /* renamed from: d */
    private volatile C47247a f348972d;

    /* renamed from: e */
    private final Object f348973e = new Object();

    /* renamed from: f */
    private boolean f348974f = false;

    /* renamed from: a */
    private final void mo107686a() {
        if (this.f348970a == null) {
            this.f348970a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f348971c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo107687b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo107710d() {
        if (this.f348972d == null) {
            synchronized (this.f348973e) {
                if (this.f348972d == null) {
                    this.f348972d = mo107687b();
                }
            }
        }
        return this.f348972d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo107711f() {
        if (!this.f348974f) {
            this.f348974f = true;
            mo107710d().mo17653jN();
            C126690ad adVar = (C126690ad) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f348971c) {
            return null;
        }
        mo107686a();
        return this.f348970a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo107710d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f348970a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo107686a();
        mo107711f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo107686a();
        mo107711f();
    }
}
