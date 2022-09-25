package com.google.android.apps.search.assistant.verticals.family.custodio;

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

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.fj */
/* compiled from: PG */
class C132316fj extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f361151a;

    /* renamed from: c */
    private boolean f361152c;

    /* renamed from: d */
    private volatile C47247a f361153d;

    /* renamed from: e */
    private final Object f361154e = new Object();

    /* renamed from: f */
    private boolean f361155f = false;

    /* renamed from: a */
    private final void mo110425a() {
        if (this.f361151a == null) {
            this.f361151a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f361152c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo110426b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo110619d() {
        if (this.f361153d == null) {
            synchronized (this.f361154e) {
                if (this.f361153d == null) {
                    this.f361153d = mo110426b();
                }
            }
        }
        return this.f361153d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo110620f() {
        if (!this.f361155f) {
            this.f361155f = true;
            mo110619d().mo17653jN();
            CustodioMediaSettingsFragment custodioMediaSettingsFragment = (CustodioMediaSettingsFragment) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f361152c) {
            return null;
        }
        mo110425a();
        return this.f361151a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo110619d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f361151a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo110425a();
        mo110620f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo110425a();
        mo110620f();
    }
}
