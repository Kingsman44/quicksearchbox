package com.google.android.apps.search.pronunciationlearning;

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

/* renamed from: com.google.android.apps.search.pronunciationlearning.al */
/* compiled from: PG */
class C141326al extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f383678a;

    /* renamed from: c */
    private boolean f383679c;

    /* renamed from: d */
    private volatile C47247a f383680d;

    /* renamed from: e */
    private final Object f383681e = new Object();

    /* renamed from: f */
    private boolean f383682f = false;

    /* renamed from: a */
    private final void m229393a() {
        if (this.f383678a == null) {
            this.f383678a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f383679c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C47247a mo116357d() {
        throw null;
    }

    /* renamed from: f */
    public final C47247a mo116358f() {
        if (this.f383680d == null) {
            synchronized (this.f383681e) {
                if (this.f383680d == null) {
                    this.f383680d = mo116357d();
                }
            }
        }
        return this.f383680d;
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f383679c) {
            return null;
        }
        m229393a();
        return this.f383678a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo116359j() {
        if (!this.f383682f) {
            this.f383682f = true;
            mo116358f().mo17653jN();
            C141524z zVar = (C141524z) this;
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo116358f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f383678a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        m229393a();
        mo116359j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        m229393a();
        mo116359j();
    }
}
