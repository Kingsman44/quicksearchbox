package com.google.android.libraries.lens.view.filters.translation.languagepicker;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.C0260w;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.apps.tiktok.inject.p3654a.p3655a.C47189c;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.languagepicker.bq */
/* compiled from: PG */
class C26175bq extends C0260w implements C68288b {

    /* renamed from: a */
    private ContextWrapper f71101a;

    /* renamed from: b */
    private boolean f71102b;

    /* renamed from: c */
    private volatile C47247a f71103c;

    /* renamed from: d */
    private final Object f71104d = new Object();

    /* renamed from: e */
    private boolean f71105e = false;

    /* renamed from: a */
    private final void m48316a() {
        if (this.f71101a == null) {
            this.f71101a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f71102b = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C47247a mo31384d() {
        throw null;
    }

    /* renamed from: f */
    public final C47247a mo31399f() {
        if (this.f71103c == null) {
            synchronized (this.f71104d) {
                if (this.f71103c == null) {
                    this.f71103c = mo31384d();
                }
            }
        }
        return this.f71103c;
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f71102b) {
            return null;
        }
        m48316a();
        return this.f71101a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo31400j() {
        if (!this.f71105e) {
            this.f71105e = true;
            mo31399f().mo17653jN();
            C26149ar arVar = (C26149ar) this;
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo31399f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f71101a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        m48316a();
        mo31400j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        m48316a();
        mo31400j();
    }
}
