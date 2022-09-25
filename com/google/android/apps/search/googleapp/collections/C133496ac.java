package com.google.android.apps.search.googleapp.collections;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1629c.C19520a;
import com.google.apps.tiktok.inject.p3654a.p3655a.C47189c;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.apps.search.googleapp.collections.ac */
/* compiled from: PG */
class C133496ac extends C19520a implements C68288b {

    /* renamed from: a */
    private ContextWrapper f363744a;

    /* renamed from: c */
    private boolean f363745c;

    /* renamed from: d */
    private volatile C47247a f363746d;

    /* renamed from: e */
    private final Object f363747e = new Object();

    /* renamed from: f */
    private boolean f363748f = false;

    /* renamed from: a */
    private final void mo111206a() {
        if (this.f363744a == null) {
            this.f363744a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f363745c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo111196b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo111197d() {
        if (this.f363746d == null) {
            synchronized (this.f363747e) {
                if (this.f363746d == null) {
                    this.f363746d = mo111196b();
                }
            }
        }
        return this.f363746d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo111198f() {
        if (!this.f363748f) {
            this.f363748f = true;
            mo111197d().mo17653jN();
            C133505c cVar = (C133505c) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f363745c) {
            return null;
        }
        mo111206a();
        return this.f363744a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo111197d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f363744a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo111206a();
        mo111198f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo111206a();
        mo111198f();
    }
}
