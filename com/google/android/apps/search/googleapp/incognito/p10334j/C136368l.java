package com.google.android.apps.search.googleapp.incognito.p10334j;

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

/* renamed from: com.google.android.apps.search.googleapp.incognito.j.l */
/* compiled from: PG */
class C136368l extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f371274a;

    /* renamed from: c */
    private boolean f371275c;

    /* renamed from: d */
    private volatile C47247a f371276d;

    /* renamed from: e */
    private final Object f371277e = new Object();

    /* renamed from: f */
    private boolean f371278f = false;

    /* renamed from: a */
    private final void m221577a() {
        if (this.f371274a == null) {
            this.f371274a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f371275c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C47247a mo112942d() {
        throw null;
    }

    /* renamed from: f */
    public final C47247a mo112946f() {
        if (this.f371276d == null) {
            synchronized (this.f371277e) {
                if (this.f371276d == null) {
                    this.f371276d = mo112942d();
                }
            }
        }
        return this.f371276d;
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f371275c) {
            return null;
        }
        m221577a();
        return this.f371274a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo112947j() {
        if (!this.f371278f) {
            this.f371278f = true;
            mo112946f().mo17653jN();
            C136363g gVar = (C136363g) this;
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo112946f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f371274a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        m221577a();
        mo112947j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        m221577a();
        mo112947j();
    }
}
