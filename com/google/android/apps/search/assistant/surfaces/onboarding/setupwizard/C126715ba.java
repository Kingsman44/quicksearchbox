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

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.ba */
/* compiled from: PG */
class C126715ba extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f348981a;

    /* renamed from: c */
    private boolean f348982c;

    /* renamed from: d */
    private volatile C47247a f348983d;

    /* renamed from: e */
    private final Object f348984e = new Object();

    /* renamed from: f */
    private boolean f348985f = false;

    /* renamed from: a */
    private final void m207246a() {
        if (this.f348981a == null) {
            this.f348981a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f348982c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C47247a mo107700d() {
        throw null;
    }

    /* renamed from: f */
    public final C47247a mo107722f() {
        if (this.f348983d == null) {
            synchronized (this.f348984e) {
                if (this.f348983d == null) {
                    this.f348983d = mo107700d();
                }
            }
        }
        return this.f348983d;
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f348982c) {
            return null;
        }
        m207246a();
        return this.f348981a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo107723j() {
        if (!this.f348985f) {
            this.f348985f = true;
            mo107722f().mo17653jN();
            C126704ar arVar = (C126704ar) this;
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo107722f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f348981a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        m207246a();
        mo107723j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        m207246a();
        mo107723j();
    }
}
