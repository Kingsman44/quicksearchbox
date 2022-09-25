package com.google.android.apps.search.googleapp.discover.settings.interestmanagement.p10223a.p10224a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.apps.tiktok.inject.baseclasses.C47210f;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.apps.search.googleapp.discover.settings.interestmanagement.a.a.d */
/* compiled from: PG */
class C134680d extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f366751a;

    /* renamed from: c */
    private boolean f366752c;

    /* renamed from: d */
    private volatile C68324h f366753d;

    /* renamed from: e */
    private final Object f366754e = new Object();

    /* renamed from: f */
    private boolean f366755f = false;

    /* renamed from: a */
    private final void mo111878a() {
        if (this.f366751a == null) {
            this.f366751a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f366752c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C68324h mo111879b() {
        throw null;
    }

    /* renamed from: d */
    public final C68324h mo111880d() {
        if (this.f366753d == null) {
            synchronized (this.f366754e) {
                if (this.f366753d == null) {
                    this.f366753d = mo111879b();
                }
            }
        }
        return this.f366753d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo111881f() {
        if (!this.f366755f) {
            this.f366755f = true;
            mo111880d().mo17653jN();
            C134678b bVar = (C134678b) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f366752c) {
            return null;
        }
        mo111878a();
        return this.f366751a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo111880d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f366751a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo111878a();
        mo111881f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo111878a();
        mo111881f();
    }
}
