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

/* renamed from: com.google.android.apps.search.googleapp.settingsui.bx */
/* compiled from: PG */
class C139201bx extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f378580a;

    /* renamed from: c */
    private boolean f378581c;

    /* renamed from: d */
    private volatile C47247a f378582d;

    /* renamed from: e */
    private final Object f378583e = new Object();

    /* renamed from: f */
    private boolean f378584f = false;

    /* renamed from: a */
    private final void m226162a() {
        if (this.f378580a == null) {
            this.f378580a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f378581c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C47247a mo114818d() {
        throw null;
    }

    /* renamed from: f */
    public final C47247a mo114819f() {
        if (this.f378582d == null) {
            synchronized (this.f378583e) {
                if (this.f378582d == null) {
                    this.f378582d = mo114818d();
                }
            }
        }
        return this.f378582d;
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f378581c) {
            return null;
        }
        m226162a();
        return this.f378580a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo114820j() {
        if (!this.f378584f) {
            this.f378584f = true;
            mo114819f().mo17653jN();
            C139228f fVar = (C139228f) this;
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo114819f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f378580a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        m226162a();
        mo114820j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        m226162a();
        mo114820j();
    }
}
