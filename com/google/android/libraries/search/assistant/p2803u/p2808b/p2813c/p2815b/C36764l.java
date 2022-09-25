package com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b;

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

/* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.l */
/* compiled from: PG */
class C36764l extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f95802a;

    /* renamed from: c */
    private boolean f95803c;

    /* renamed from: d */
    private volatile C47247a f95804d;

    /* renamed from: e */
    private final Object f95805e = new Object();

    /* renamed from: f */
    private boolean f95806f = false;

    /* renamed from: a */
    private final void mo40367a() {
        if (this.f95802a == null) {
            this.f95802a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f95803c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo40368b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo40375d() {
        if (this.f95804d == null) {
            synchronized (this.f95805e) {
                if (this.f95804d == null) {
                    this.f95804d = mo40368b();
                }
            }
        }
        return this.f95804d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo40376f() {
        if (!this.f95806f) {
            this.f95806f = true;
            mo40375d().mo17653jN();
            C36752b bVar = (C36752b) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f95803c) {
            return null;
        }
        mo40367a();
        return this.f95802a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo40375d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f95802a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo40367a();
        mo40376f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo40367a();
        mo40376f();
    }
}
