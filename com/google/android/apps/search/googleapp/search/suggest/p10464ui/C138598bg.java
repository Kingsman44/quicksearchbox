package com.google.android.apps.search.googleapp.search.suggest.p10464ui;

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

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.bg */
/* compiled from: PG */
class C138598bg extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f376934a;

    /* renamed from: c */
    private boolean f376935c;

    /* renamed from: d */
    private volatile C47247a f376936d;

    /* renamed from: e */
    private final Object f376937e = new Object();

    /* renamed from: f */
    private boolean f376938f = false;

    /* renamed from: a */
    private final void mo114337a() {
        if (this.f376934a == null) {
            this.f376934a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f376935c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo114338b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo114382d() {
        if (this.f376936d == null) {
            synchronized (this.f376937e) {
                if (this.f376936d == null) {
                    this.f376936d = mo114338b();
                }
            }
        }
        return this.f376936d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo114383f() {
        if (!this.f376938f) {
            this.f376938f = true;
            mo114382d().mo17653jN();
            C138575b bVar = (C138575b) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f376935c) {
            return null;
        }
        mo114337a();
        return this.f376934a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo114382d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f376934a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo114337a();
        mo114383f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo114337a();
        mo114383f();
    }
}
