package com.google.android.apps.search.googleapp.settingsui;

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

/* renamed from: com.google.android.apps.search.googleapp.settingsui.ch */
/* compiled from: PG */
class C139213ch extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f378629a;

    /* renamed from: c */
    private boolean f378630c;

    /* renamed from: d */
    private volatile C47247a f378631d;

    /* renamed from: e */
    private final Object f378632e = new Object();

    /* renamed from: f */
    private boolean f378633f = false;

    /* renamed from: a */
    private final void mo114811a() {
        if (this.f378629a == null) {
            this.f378629a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f378630c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo114812b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo114842d() {
        if (this.f378631d == null) {
            synchronized (this.f378632e) {
                if (this.f378631d == null) {
                    this.f378631d = mo114812b();
                }
            }
        }
        return this.f378631d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo114843f() {
        if (!this.f378633f) {
            this.f378633f = true;
            mo114842d().mo17653jN();
            C139196bs bsVar = (C139196bs) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f378630c) {
            return null;
        }
        mo114811a();
        return this.f378629a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo114842d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f378629a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo114811a();
        mo114843f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo114811a();
        mo114843f();
    }
}
