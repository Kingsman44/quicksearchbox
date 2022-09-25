package com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a;

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

/* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.a.ag */
/* compiled from: PG */
class C36710ag extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f95637a;

    /* renamed from: c */
    private boolean f95638c;

    /* renamed from: d */
    private volatile C47247a f95639d;

    /* renamed from: e */
    private final Object f95640e = new Object();

    /* renamed from: f */
    private boolean f95641f = false;

    /* renamed from: a */
    private final void m65324a() {
        if (this.f95637a == null) {
            this.f95637a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f95638c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C47247a mo40345d() {
        throw null;
    }

    /* renamed from: f */
    public final C47247a mo40346f() {
        if (this.f95639d == null) {
            synchronized (this.f95640e) {
                if (this.f95639d == null) {
                    this.f95639d = mo40345d();
                }
            }
        }
        return this.f95639d;
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f95638c) {
            return null;
        }
        m65324a();
        return this.f95637a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo40347j() {
        if (!this.f95641f) {
            this.f95641f = true;
            mo40346f().mo17653jN();
            C36748w wVar = (C36748w) this;
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo40346f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f95637a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        m65324a();
        mo40347j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        m65324a();
        mo40347j();
    }
}
