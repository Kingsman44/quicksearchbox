package com.google.android.apps.search.googleapp.search.settings.locationconsent;

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

/* renamed from: com.google.android.apps.search.googleapp.search.settings.locationconsent.s */
/* compiled from: PG */
class C137660s extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f374438a;

    /* renamed from: c */
    private boolean f374439c;

    /* renamed from: d */
    private volatile C47247a f374440d;

    /* renamed from: e */
    private final Object f374441e = new Object();

    /* renamed from: f */
    private boolean f374442f = false;

    /* renamed from: a */
    private final void m223709a() {
        if (this.f374438a == null) {
            this.f374438a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f374439c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C47247a mo113882d() {
        throw null;
    }

    /* renamed from: f */
    public final C47247a mo113888f() {
        if (this.f374440d == null) {
            synchronized (this.f374441e) {
                if (this.f374440d == null) {
                    this.f374440d = mo113882d();
                }
            }
        }
        return this.f374440d;
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f374439c) {
            return null;
        }
        m223709a();
        return this.f374438a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo113889j() {
        if (!this.f374442f) {
            this.f374442f = true;
            mo113888f().mo17653jN();
            C137651k kVar = (C137651k) this;
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo113888f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f374438a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        m223709a();
        mo113889j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        m223709a();
        mo113889j();
    }
}
