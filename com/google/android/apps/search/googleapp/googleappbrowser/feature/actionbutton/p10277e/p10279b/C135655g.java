package com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10277e.p10279b;

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

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.e.b.g */
/* compiled from: PG */
class C135655g extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f369505a;

    /* renamed from: c */
    private boolean f369506c;

    /* renamed from: d */
    private volatile C47247a f369507d;

    /* renamed from: e */
    private final Object f369508e = new Object();

    /* renamed from: f */
    private boolean f369509f = false;

    /* renamed from: a */
    private final void mo112438a() {
        if (this.f369505a == null) {
            this.f369505a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f369506c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo112439b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo112442d() {
        if (this.f369507d == null) {
            synchronized (this.f369508e) {
                if (this.f369507d == null) {
                    this.f369507d = mo112439b();
                }
            }
        }
        return this.f369507d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo112443f() {
        if (!this.f369509f) {
            this.f369509f = true;
            mo112442d().mo17653jN();
            C135650b bVar = (C135650b) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f369506c) {
            return null;
        }
        mo112438a();
        return this.f369505a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo112442d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f369505a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo112438a();
        mo112443f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo112438a();
        mo112443f();
    }
}
