package com.google.android.apps.search.podcasts.playerpanel.p10599b;

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

/* renamed from: com.google.android.apps.search.podcasts.playerpanel.b.m */
/* compiled from: PG */
class C140911m extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f382618a;

    /* renamed from: c */
    private boolean f382619c;

    /* renamed from: d */
    private volatile C47247a f382620d;

    /* renamed from: e */
    private final Object f382621e = new Object();

    /* renamed from: f */
    private boolean f382622f = false;

    /* renamed from: a */
    private final void mo115998a() {
        if (this.f382618a == null) {
            this.f382618a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f382619c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo115999b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo116007d() {
        if (this.f382620d == null) {
            synchronized (this.f382621e) {
                if (this.f382620d == null) {
                    this.f382620d = mo115999b();
                }
            }
        }
        return this.f382620d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo116008f() {
        if (!this.f382622f) {
            this.f382622f = true;
            mo116007d().mo17653jN();
            C140898b bVar = (C140898b) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f382619c) {
            return null;
        }
        mo115998a();
        return this.f382618a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo116007d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f382618a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo115998a();
        mo116008f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo115998a();
        mo116008f();
    }
}
