package com.google.android.apps.search.assistant.verticals.family.custodio;

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

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.fc */
/* compiled from: PG */
class C132309fc extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f361116a;

    /* renamed from: c */
    private boolean f361117c;

    /* renamed from: d */
    private volatile C47247a f361118d;

    /* renamed from: e */
    private final Object f361119e = new Object();

    /* renamed from: f */
    private boolean f361120f = false;

    /* renamed from: a */
    private final void mo110411a() {
        if (this.f361116a == null) {
            this.f361116a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f361117c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo110412b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo110605d() {
        if (this.f361118d == null) {
            synchronized (this.f361119e) {
                if (this.f361118d == null) {
                    this.f361118d = mo110412b();
                }
            }
        }
        return this.f361118d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo110606f() {
        if (!this.f361120f) {
            this.f361120f = true;
            mo110605d().mo17653jN();
            CustodioAssistantFeaturesSettingsFragment custodioAssistantFeaturesSettingsFragment = (CustodioAssistantFeaturesSettingsFragment) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f361117c) {
            return null;
        }
        mo110411a();
        return this.f361116a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo110605d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f361116a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo110411a();
        mo110606f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo110411a();
        mo110606f();
    }
}
