package com.google.android.apps.search.podcasts.library;

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

/* renamed from: com.google.android.apps.search.podcasts.library.c */
/* compiled from: PG */
class C140568c extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f381769a;

    /* renamed from: c */
    private boolean f381770c;

    /* renamed from: d */
    private volatile C47247a f381771d;

    /* renamed from: e */
    private final Object f381772e = new Object();

    /* renamed from: f */
    private boolean f381773f = false;

    /* renamed from: a */
    private final void mo115739a() {
        if (this.f381769a == null) {
            this.f381769a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f381770c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo115740b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo115746d() {
        if (this.f381771d == null) {
            synchronized (this.f381772e) {
                if (this.f381771d == null) {
                    this.f381771d = mo115740b();
                }
            }
        }
        return this.f381771d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo115747f() {
        if (!this.f381773f) {
            this.f381773f = true;
            mo115746d().mo17653jN();
            LibraryFragment libraryFragment = (LibraryFragment) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f381770c) {
            return null;
        }
        mo115739a();
        return this.f381769a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo115746d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f381769a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo115739a();
        mo115747f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo115739a();
        mo115747f();
    }
}
