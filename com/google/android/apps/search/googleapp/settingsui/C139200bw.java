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

/* renamed from: com.google.android.apps.search.googleapp.settingsui.bw */
/* compiled from: PG */
class C139200bw extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f378575a;

    /* renamed from: c */
    private boolean f378576c;

    /* renamed from: d */
    private volatile C47247a f378577d;

    /* renamed from: e */
    private final Object f378578e = new Object();

    /* renamed from: f */
    private boolean f378579f = false;

    /* renamed from: a */
    private final void m226157a() {
        if (this.f378575a == null) {
            this.f378575a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f378576c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C47247a mo114796d() {
        throw null;
    }

    /* renamed from: f */
    public final C47247a mo114816f() {
        if (this.f378577d == null) {
            synchronized (this.f378578e) {
                if (this.f378577d == null) {
                    this.f378577d = mo114796d();
                }
            }
        }
        return this.f378577d;
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f378576c) {
            return null;
        }
        m226157a();
        return this.f378575a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo114817j() {
        if (!this.f378579f) {
            this.f378579f = true;
            mo114816f().mo17653jN();
            C139173b bVar = (C139173b) this;
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo114816f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f378575a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        m226157a();
        mo114817j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        m226157a();
        mo114817j();
    }
}
