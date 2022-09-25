package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

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

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.bz */
/* compiled from: PG */
class C124855bz extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f344465a;

    /* renamed from: c */
    private boolean f344466c;

    /* renamed from: d */
    private volatile C47247a f344467d;

    /* renamed from: e */
    private final Object f344468e = new Object();

    /* renamed from: f */
    private boolean f344469f = false;

    /* renamed from: a */
    private final void mo106629a() {
        if (this.f344465a == null) {
            this.f344465a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f344466c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo106630b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo106680d() {
        if (this.f344467d == null) {
            synchronized (this.f344468e) {
                if (this.f344467d == null) {
                    this.f344467d = mo106630b();
                }
            }
        }
        return this.f344467d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo106681f() {
        if (!this.f344469f) {
            this.f344469f = true;
            mo106680d().mo17653jN();
            InitSetupFragment initSetupFragment = (InitSetupFragment) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f344466c) {
            return null;
        }
        mo106629a();
        return this.f344465a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo106680d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f344465a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo106629a();
        mo106681f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo106629a();
        mo106681f();
    }
}
