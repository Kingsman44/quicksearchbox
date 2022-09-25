package com.google.android.apps.search.googleapp.settingsui;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1628b.C19501a;
import com.google.apps.tiktok.inject.p3654a.p3655a.C47189c;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.cg */
/* compiled from: PG */
abstract class C139212cg extends C19501a implements C68288b {

    /* renamed from: f */
    private ContextWrapper f378624f;

    /* renamed from: g */
    private boolean f378625g;

    /* renamed from: h */
    private volatile C47247a f378626h;

    /* renamed from: i */
    private final Object f378627i = new Object();

    /* renamed from: j */
    private boolean f378628j = false;

    /* renamed from: b */
    private final void m226206b() {
        if (this.f378624f == null) {
            this.f378624f = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f378625g = C68297a.m98634a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f378625g) {
            return null;
        }
        m226206b();
        return this.f378624f;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo114840o().mo17653jN();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C47247a mo114777n() {
        throw null;
    }

    /* renamed from: o */
    public final C47247a mo114840o() {
        if (this.f378626h == null) {
            synchronized (this.f378627i) {
                if (this.f378626h == null) {
                    this.f378626h = mo114777n();
                }
            }
        }
        return this.f378626h;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f378624f;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        m226206b();
        mo114841p();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo114841p() {
        if (!this.f378628j) {
            this.f378628j = true;
            mo114840o().mo17653jN();
            SettingsSearchFragment settingsSearchFragment = (SettingsSearchFragment) this;
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        m226206b();
        mo114841p();
    }
}
