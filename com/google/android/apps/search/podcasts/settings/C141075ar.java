package com.google.android.apps.search.podcasts.settings;

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

/* renamed from: com.google.android.apps.search.podcasts.settings.ar */
/* compiled from: PG */
class C141075ar extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f383010a;

    /* renamed from: c */
    private boolean f383011c;

    /* renamed from: d */
    private volatile C47247a f383012d;

    /* renamed from: e */
    private final Object f383013e = new Object();

    /* renamed from: f */
    private boolean f383014f = false;

    /* renamed from: a */
    private final void mo116101a() {
        if (this.f383010a == null) {
            this.f383010a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f383011c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo116102b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo116134d() {
        if (this.f383012d == null) {
            synchronized (this.f383013e) {
                if (this.f383012d == null) {
                    this.f383012d = mo116102b();
                }
            }
        }
        return this.f383012d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo116135f() {
        if (!this.f383014f) {
            this.f383014f = true;
            mo116134d().mo17653jN();
            SettingsFragment settingsFragment = (SettingsFragment) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f383011c) {
            return null;
        }
        mo116101a();
        return this.f383010a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo116134d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f383010a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo116101a();
        mo116135f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo116101a();
        mo116135f();
    }
}
