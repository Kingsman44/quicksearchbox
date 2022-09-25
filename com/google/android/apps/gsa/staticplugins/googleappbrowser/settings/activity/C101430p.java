package com.google.android.apps.gsa.staticplugins.googleappbrowser.settings.activity;

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

/* renamed from: com.google.android.apps.gsa.staticplugins.googleappbrowser.settings.activity.p */
/* compiled from: PG */
class C101430p extends C19520a implements C68288b {

    /* renamed from: a */
    private ContextWrapper f282995a;

    /* renamed from: c */
    private boolean f282996c;

    /* renamed from: d */
    private volatile C47247a f282997d;

    /* renamed from: e */
    private final Object f282998e = new Object();

    /* renamed from: f */
    private boolean f282999f = false;

    /* renamed from: a */
    private final void mo92287a() {
        if (this.f282995a == null) {
            this.f282995a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f282996c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo92288b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo92296d() {
        if (this.f282997d == null) {
            synchronized (this.f282998e) {
                if (this.f282997d == null) {
                    this.f282997d = mo92288b();
                }
            }
        }
        return this.f282997d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo92297f() {
        if (!this.f282999f) {
            this.f282999f = true;
            mo92296d().mo17653jN();
            C101417f fVar = (C101417f) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f282996c) {
            return null;
        }
        mo92287a();
        return this.f282995a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo92296d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f282995a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo92287a();
        mo92297f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo92287a();
        mo92297f();
    }
}
