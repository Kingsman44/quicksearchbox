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

/* renamed from: com.google.android.apps.search.googleapp.settingsui.cd */
/* compiled from: PG */
class C139209cd extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f378609a;

    /* renamed from: c */
    private boolean f378610c;

    /* renamed from: d */
    private volatile C47247a f378611d;

    /* renamed from: e */
    private final Object f378612e = new Object();

    /* renamed from: f */
    private boolean f378613f = false;

    /* renamed from: a */
    private final void mo114792a() {
        if (this.f378609a == null) {
            this.f378609a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f378610c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo114793b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo114834d() {
        if (this.f378611d == null) {
            synchronized (this.f378612e) {
                if (this.f378611d == null) {
                    this.f378611d = mo114793b();
                }
            }
        }
        return this.f378611d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo114835f() {
        if (!this.f378613f) {
            this.f378613f = true;
            mo114834d().mo17653jN();
            C139164ar arVar = (C139164ar) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f378610c) {
            return null;
        }
        mo114792a();
        return this.f378609a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo114834d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f378609a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo114792a();
        mo114835f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo114792a();
        mo114835f();
    }
}
