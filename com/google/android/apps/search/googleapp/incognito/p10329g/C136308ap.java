package com.google.android.apps.search.googleapp.incognito.p10329g;

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

/* renamed from: com.google.android.apps.search.googleapp.incognito.g.ap */
/* compiled from: PG */
class C136308ap extends C19520a implements C68288b {

    /* renamed from: a */
    private ContextWrapper f371129a;

    /* renamed from: c */
    private boolean f371130c;

    /* renamed from: d */
    private volatile C47247a f371131d;

    /* renamed from: e */
    private final Object f371132e = new Object();

    /* renamed from: f */
    private boolean f371133f = false;

    /* renamed from: a */
    private final void mo112908a() {
        if (this.f371129a == null) {
            this.f371129a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f371130c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo112897b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo112898d() {
        if (this.f371131d == null) {
            synchronized (this.f371132e) {
                if (this.f371131d == null) {
                    this.f371131d = mo112897b();
                }
            }
        }
        return this.f371131d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo112899f() {
        if (!this.f371133f) {
            this.f371133f = true;
            mo112898d().mo17653jN();
            C136312b bVar = (C136312b) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f371130c) {
            return null;
        }
        mo112908a();
        return this.f371129a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo112898d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f371129a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo112908a();
        mo112899f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo112908a();
        mo112899f();
    }
}
