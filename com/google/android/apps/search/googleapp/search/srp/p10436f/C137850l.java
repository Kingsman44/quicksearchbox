package com.google.android.apps.search.googleapp.search.srp.p10436f;

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

/* renamed from: com.google.android.apps.search.googleapp.search.srp.f.l */
/* compiled from: PG */
class C137850l extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f375058a;

    /* renamed from: c */
    private boolean f375059c;

    /* renamed from: d */
    private volatile C47247a f375060d;

    /* renamed from: e */
    private final Object f375061e = new Object();

    /* renamed from: f */
    private boolean f375062f = false;

    /* renamed from: a */
    private final void mo113995a() {
        if (this.f375058a == null) {
            this.f375058a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f375059c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo113996b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo114005d() {
        if (this.f375060d == null) {
            synchronized (this.f375061e) {
                if (this.f375060d == null) {
                    this.f375060d = mo113996b();
                }
            }
        }
        return this.f375060d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo114006f() {
        if (!this.f375062f) {
            this.f375062f = true;
            mo114005d().mo17653jN();
            C137839c cVar = (C137839c) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f375059c) {
            return null;
        }
        mo113995a();
        return this.f375058a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo114005d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f375058a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo113995a();
        mo114006f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo113995a();
        mo114006f();
    }
}
