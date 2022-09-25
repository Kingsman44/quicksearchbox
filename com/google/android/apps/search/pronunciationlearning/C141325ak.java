package com.google.android.apps.search.pronunciationlearning;

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

/* renamed from: com.google.android.apps.search.pronunciationlearning.ak */
/* compiled from: PG */
class C141325ak extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f383673a;

    /* renamed from: c */
    private boolean f383674c;

    /* renamed from: d */
    private volatile C47247a f383675d;

    /* renamed from: e */
    private final Object f383676e = new Object();

    /* renamed from: f */
    private boolean f383677f = false;

    /* renamed from: a */
    private final void m229388a() {
        if (this.f383673a == null) {
            this.f383673a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f383674c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C47247a mo116354d() {
        throw null;
    }

    /* renamed from: f */
    public final C47247a mo116355f() {
        if (this.f383675d == null) {
            synchronized (this.f383676e) {
                if (this.f383675d == null) {
                    this.f383675d = mo116354d();
                }
            }
        }
        return this.f383675d;
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f383674c) {
            return null;
        }
        m229388a();
        return this.f383673a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo116356j() {
        if (!this.f383677f) {
            this.f383677f = true;
            mo116355f().mo17653jN();
            C141415j jVar = (C141415j) this;
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo116355f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f383673a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        m229388a();
        mo116356j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        m229388a();
        mo116356j();
    }
}
