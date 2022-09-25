package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10285c.p10286a;

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

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.c.a.e */
/* compiled from: PG */
class C135726e extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f369691a;

    /* renamed from: c */
    private boolean f369692c;

    /* renamed from: d */
    private volatile C47247a f369693d;

    /* renamed from: e */
    private final Object f369694e = new Object();

    /* renamed from: f */
    private boolean f369695f = false;

    /* renamed from: a */
    private final void mo112500a() {
        if (this.f369691a == null) {
            this.f369691a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f369692c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo112501b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo112502d() {
        if (this.f369693d == null) {
            synchronized (this.f369694e) {
                if (this.f369693d == null) {
                    this.f369693d = mo112501b();
                }
            }
        }
        return this.f369693d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo112503f() {
        if (!this.f369695f) {
            this.f369695f = true;
            mo112502d().mo17653jN();
            C135723b bVar = (C135723b) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f369692c) {
            return null;
        }
        mo112500a();
        return this.f369691a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo112502d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f369691a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo112500a();
        mo112503f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo112500a();
        mo112503f();
    }
}
