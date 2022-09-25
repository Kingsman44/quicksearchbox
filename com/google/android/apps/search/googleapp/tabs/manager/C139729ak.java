package com.google.android.apps.search.googleapp.tabs.manager;

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

/* renamed from: com.google.android.apps.search.googleapp.tabs.manager.ak */
/* compiled from: PG */
class C139729ak extends C19520a implements C68288b {

    /* renamed from: a */
    private ContextWrapper f379806a;

    /* renamed from: c */
    private boolean f379807c;

    /* renamed from: d */
    private volatile C47247a f379808d;

    /* renamed from: e */
    private final Object f379809e = new Object();

    /* renamed from: f */
    private boolean f379810f = false;

    /* renamed from: a */
    private final void mo115213a() {
        if (this.f379806a == null) {
            this.f379806a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f379807c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo115203b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo115204d() {
        if (this.f379808d == null) {
            synchronized (this.f379809e) {
                if (this.f379808d == null) {
                    this.f379808d = mo115203b();
                }
            }
        }
        return this.f379808d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo115205f() {
        if (!this.f379810f) {
            this.f379810f = true;
            mo115204d().mo17653jN();
            C139741h hVar = (C139741h) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f379807c) {
            return null;
        }
        mo115213a();
        return this.f379806a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo115204d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f379806a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo115213a();
        mo115205f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo115213a();
        mo115205f();
    }
}
