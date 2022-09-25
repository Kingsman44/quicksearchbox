package com.google.android.apps.search.googleapp.notificationsurvey;

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

/* renamed from: com.google.android.apps.search.googleapp.notificationsurvey.r */
/* compiled from: PG */
class C136828r extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f372438a;

    /* renamed from: c */
    private boolean f372439c;

    /* renamed from: d */
    private volatile C47247a f372440d;

    /* renamed from: e */
    private final Object f372441e = new Object();

    /* renamed from: f */
    private boolean f372442f = false;

    /* renamed from: a */
    private final void mo113383a() {
        if (this.f372438a == null) {
            this.f372438a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f372439c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo113384b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo113391d() {
        if (this.f372440d == null) {
            synchronized (this.f372441e) {
                if (this.f372440d == null) {
                    this.f372440d = mo113384b();
                }
            }
        }
        return this.f372440d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo113392f() {
        if (!this.f372442f) {
            this.f372442f = true;
            mo113391d().mo17653jN();
            C136813d dVar = (C136813d) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f372439c) {
            return null;
        }
        mo113383a();
        return this.f372438a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo113391d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f372438a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo113383a();
        mo113392f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo113383a();
        mo113392f();
    }
}
