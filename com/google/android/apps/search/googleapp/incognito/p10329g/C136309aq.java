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

/* renamed from: com.google.android.apps.search.googleapp.incognito.g.aq */
/* compiled from: PG */
class C136309aq extends C19520a implements C68288b {

    /* renamed from: a */
    private ContextWrapper f371134a;

    /* renamed from: c */
    private boolean f371135c;

    /* renamed from: d */
    private volatile C47247a f371136d;

    /* renamed from: e */
    private final Object f371137e = new Object();

    /* renamed from: f */
    private boolean f371138f = false;

    /* renamed from: a */
    private final void mo112913a() {
        if (this.f371134a == null) {
            this.f371134a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f371135c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo112900b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo112901d() {
        if (this.f371136d == null) {
            synchronized (this.f371137e) {
                if (this.f371136d == null) {
                    this.f371136d = mo112900b();
                }
            }
        }
        return this.f371136d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo112902f() {
        if (!this.f371138f) {
            this.f371138f = true;
            mo112901d().mo17653jN();
            C136318h hVar = (C136318h) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f371135c) {
            return null;
        }
        mo112913a();
        return this.f371134a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo112901d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f371134a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo112913a();
        mo112902f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo112913a();
        mo112902f();
    }
}
