package com.google.android.apps.search.googleapp.search.voicesearch.settings;

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

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.settings.v */
/* compiled from: PG */
class C138907v extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f377830a;

    /* renamed from: c */
    private boolean f377831c;

    /* renamed from: d */
    private volatile C47247a f377832d;

    /* renamed from: e */
    private final Object f377833e = new Object();

    /* renamed from: f */
    private boolean f377834f = false;

    /* renamed from: a */
    private final void mo114622a() {
        if (this.f377830a == null) {
            this.f377830a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f377831c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo114623b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo114629d() {
        if (this.f377832d == null) {
            synchronized (this.f377833e) {
                if (this.f377832d == null) {
                    this.f377832d = mo114623b();
                }
            }
        }
        return this.f377832d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo114630f() {
        if (!this.f377834f) {
            this.f377834f = true;
            mo114629d().mo17653jN();
            C138896l lVar = (C138896l) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f377831c) {
            return null;
        }
        mo114622a();
        return this.f377830a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo114629d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f377830a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo114622a();
        mo114630f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo114622a();
        mo114630f();
    }
}
