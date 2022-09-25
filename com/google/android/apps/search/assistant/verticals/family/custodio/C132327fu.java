package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1629c.C19520a;
import com.google.apps.tiktok.inject.p3654a.p3655a.C47189c;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.fu */
/* compiled from: PG */
class C132327fu extends C19520a implements C68288b {

    /* renamed from: a */
    private ContextWrapper f361206a;

    /* renamed from: c */
    private boolean f361207c;

    /* renamed from: d */
    private volatile C47247a f361208d;

    /* renamed from: e */
    private final Object f361209e = new Object();

    /* renamed from: f */
    private boolean f361210f = false;

    /* renamed from: a */
    private final void mo110445a() {
        if (this.f361206a == null) {
            this.f361206a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f361207c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo110446b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo110641d() {
        if (this.f361208d == null) {
            synchronized (this.f361209e) {
                if (this.f361208d == null) {
                    this.f361208d = mo110446b();
                }
            }
        }
        return this.f361208d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo110642f() {
        if (!this.f361210f) {
            this.f361210f = true;
            mo110641d().mo17653jN();
            DeviceListUnlinkDialogFragment deviceListUnlinkDialogFragment = (DeviceListUnlinkDialogFragment) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f361207c) {
            return null;
        }
        mo110445a();
        return this.f361206a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo110641d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f361206a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo110445a();
        mo110642f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo110445a();
        mo110642f();
    }
}
