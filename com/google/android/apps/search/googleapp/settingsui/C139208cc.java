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

/* renamed from: com.google.android.apps.search.googleapp.settingsui.cc */
/* compiled from: PG */
class C139208cc extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f378604a;

    /* renamed from: c */
    private boolean f378605c;

    /* renamed from: d */
    private volatile C47247a f378606d;

    /* renamed from: e */
    private final Object f378607e = new Object();

    /* renamed from: f */
    private boolean f378608f = false;

    /* renamed from: a */
    private final void mo114770a() {
        if (this.f378604a == null) {
            this.f378604a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f378605c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo114771b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo114832d() {
        if (this.f378606d == null) {
            synchronized (this.f378607e) {
                if (this.f378606d == null) {
                    this.f378606d = mo114771b();
                }
            }
        }
        return this.f378606d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo114833f() {
        if (!this.f378608f) {
            this.f378608f = true;
            mo114832d().mo17653jN();
            SettingFragmentHostFragment settingFragmentHostFragment = (SettingFragmentHostFragment) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f378605c) {
            return null;
        }
        mo114770a();
        return this.f378604a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo114832d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f378604a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo114770a();
        mo114833f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo114770a();
        mo114833f();
    }
}
