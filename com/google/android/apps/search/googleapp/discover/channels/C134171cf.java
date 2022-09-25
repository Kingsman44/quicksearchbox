package com.google.android.apps.search.googleapp.discover.channels;

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

/* renamed from: com.google.android.apps.search.googleapp.discover.channels.cf */
/* compiled from: PG */
class C134171cf extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f365485a;

    /* renamed from: c */
    private boolean f365486c;

    /* renamed from: d */
    private volatile C47247a f365487d;

    /* renamed from: e */
    private final Object f365488e = new Object();

    /* renamed from: f */
    private boolean f365489f = false;

    /* renamed from: a */
    private final void m217661a() {
        if (this.f365485a == null) {
            this.f365485a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f365486c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C47247a mo111584d() {
        throw null;
    }

    /* renamed from: f */
    public final C47247a mo111593f() {
        if (this.f365487d == null) {
            synchronized (this.f365488e) {
                if (this.f365487d == null) {
                    this.f365487d = mo111584d();
                }
            }
        }
        return this.f365487d;
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f365486c) {
            return null;
        }
        m217661a();
        return this.f365485a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo111594j() {
        if (!this.f365489f) {
            this.f365489f = true;
            mo111593f().mo17653jN();
            C134163by byVar = (C134163by) this;
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo111593f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f365485a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        m217661a();
        mo111594j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        m217661a();
        mo111594j();
    }
}
