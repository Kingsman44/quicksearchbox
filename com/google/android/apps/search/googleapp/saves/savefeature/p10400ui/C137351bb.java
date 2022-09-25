package com.google.android.apps.search.googleapp.saves.savefeature.p10400ui;

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

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.ui.bb */
/* compiled from: PG */
class C137351bb extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f373611a;

    /* renamed from: c */
    private boolean f373612c;

    /* renamed from: d */
    private volatile C47247a f373613d;

    /* renamed from: e */
    private final Object f373614e = new Object();

    /* renamed from: f */
    private boolean f373615f = false;

    /* renamed from: a */
    private final void mo113652a() {
        if (this.f373611a == null) {
            this.f373611a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f373612c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo113653b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo113680d() {
        if (this.f373613d == null) {
            synchronized (this.f373614e) {
                if (this.f373613d == null) {
                    this.f373613d = mo113653b();
                }
            }
        }
        return this.f373613d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo113681f() {
        if (!this.f373615f) {
            this.f373615f = true;
            mo113680d().mo17653jN();
            C137328am amVar = (C137328am) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f373612c) {
            return null;
        }
        mo113652a();
        return this.f373611a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo113680d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f373611a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo113652a();
        mo113681f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo113652a();
        mo113681f();
    }
}
