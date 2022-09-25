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

/* renamed from: com.google.android.apps.search.podcasts.settings.aq */
/* compiled from: PG */
class C141074aq extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f383005a;

    /* renamed from: c */
    private boolean f383006c;

    /* renamed from: d */
    private volatile C47247a f383007d;

    /* renamed from: e */
    private final Object f383008e = new Object();

    /* renamed from: f */
    private boolean f383009f = false;

    /* renamed from: a */
    private final void mo116099a() {
        if (this.f383005a == null) {
            this.f383005a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f383006c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo116100b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo116132d() {
        if (this.f383007d == null) {
            synchronized (this.f383008e) {
                if (this.f383007d == null) {
                    this.f383007d = mo116100b();
                }
            }
        }
        return this.f383007d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo116133f() {
        if (!this.f383009f) {
            this.f383009f = true;
            mo116132d().mo17653jN();
            NewEpisodeNotificationsSettingsFragment newEpisodeNotificationsSettingsFragment = (NewEpisodeNotificationsSettingsFragment) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f383006c) {
            return null;
        }
        mo116099a();
        return this.f383005a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo116132d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f383005a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo116099a();
        mo116133f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo116099a();
        mo116133f();
    }
}
