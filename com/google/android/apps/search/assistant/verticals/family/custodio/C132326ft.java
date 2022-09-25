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

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.ft */
/* compiled from: PG */
class C132326ft extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f361201a;

    /* renamed from: c */
    private boolean f361202c;

    /* renamed from: d */
    private volatile C47247a f361203d;

    /* renamed from: e */
    private final Object f361204e = new Object();

    /* renamed from: f */
    private boolean f361205f = false;

    /* renamed from: a */
    private final void mo110443a() {
        if (this.f361201a == null) {
            this.f361201a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f361202c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo110444b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo110639d() {
        if (this.f361203d == null) {
            synchronized (this.f361204e) {
                if (this.f361203d == null) {
                    this.f361203d = mo110444b();
                }
            }
        }
        return this.f361203d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo110640f() {
        if (!this.f361205f) {
            this.f361205f = true;
            mo110639d().mo17653jN();
            CustodioVideoSettingsFragment custodioVideoSettingsFragment = (CustodioVideoSettingsFragment) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f361202c) {
            return null;
        }
        mo110443a();
        return this.f361201a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo110639d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f361201a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo110443a();
        mo110640f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo110443a();
        mo110640f();
    }
}
