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

/* renamed from: com.google.android.apps.search.googleapp.settingsui.ce */
/* compiled from: PG */
abstract class C139210ce extends C19501a implements C68288b {

    /* renamed from: f */
    private ContextWrapper f378614f;

    /* renamed from: g */
    private boolean f378615g;

    /* renamed from: h */
    private volatile C47247a f378616h;

    /* renamed from: i */
    private final Object f378617i = new Object();

    /* renamed from: j */
    private boolean f378618j = false;

    /* renamed from: b */
    private final void mo114774b() {
        if (this.f378614f == null) {
            this.f378614f = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f378615g = C68297a.m98634a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f378615g) {
            return null;
        }
        mo114774b();
        return this.f378614f;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo114836n().mo17653jN();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C47247a mo114775m() {
        throw null;
    }

    /* renamed from: n */
    public final C47247a mo114836n() {
        if (this.f378616h == null) {
            synchronized (this.f378617i) {
                if (this.f378616h == null) {
                    this.f378616h = mo114775m();
                }
            }
        }
        return this.f378616h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo114837o() {
        if (!this.f378618j) {
            this.f378618j = true;
            mo114836n().mo17653jN();
            SettingsPageFragment settingsPageFragment = (SettingsPageFragment) this;
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f378614f;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo114774b();
        mo114837o();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo114774b();
        mo114837o();
    }
}
