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

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.aw */
/* compiled from: PG */
class C126709aw extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f348960a;

    /* renamed from: c */
    private boolean f348961c;

    /* renamed from: d */
    private volatile C47247a f348962d;

    /* renamed from: e */
    private final Object f348963e = new Object();

    /* renamed from: f */
    private boolean f348964f = false;

    /* renamed from: a */
    private final void mo107732a() {
        if (this.f348960a == null) {
            this.f348960a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f348961c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo107704b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo107705d() {
        if (this.f348962d == null) {
            synchronized (this.f348963e) {
                if (this.f348962d == null) {
                    this.f348962d = mo107704b();
                }
            }
        }
        return this.f348962d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo107706f() {
        if (!this.f348964f) {
            this.f348964f = true;
            mo107705d().mo17653jN();
            C126730q qVar = (C126730q) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f348961c) {
            return null;
        }
        mo107732a();
        return this.f348960a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo107705d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f348960a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo107732a();
        mo107706f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo107732a();
        mo107706f();
    }
}
