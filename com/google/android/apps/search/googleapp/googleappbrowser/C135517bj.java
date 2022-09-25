package com.google.android.apps.search.googleapp.googleappbrowser;

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

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.bj */
/* compiled from: PG */
class C135517bj extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f369162a;

    /* renamed from: c */
    private boolean f369163c;

    /* renamed from: d */
    private volatile C47247a f369164d;

    /* renamed from: e */
    private final Object f369165e = new Object();

    /* renamed from: f */
    private boolean f369166f = false;

    /* renamed from: a */
    private final void m219719a() {
        if (this.f369162a == null) {
            this.f369162a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f369163c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C47247a mo112347d() {
        throw null;
    }

    /* renamed from: f */
    public final C47247a mo112377f() {
        if (this.f369164d == null) {
            synchronized (this.f369165e) {
                if (this.f369164d == null) {
                    this.f369164d = mo112347d();
                }
            }
        }
        return this.f369164d;
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f369163c) {
            return null;
        }
        m219719a();
        return this.f369162a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo112378j() {
        if (!this.f369166f) {
            this.f369166f = true;
            mo112377f().mo17653jN();
            GoogleAppBrowserCoordinatorFragment googleAppBrowserCoordinatorFragment = (GoogleAppBrowserCoordinatorFragment) this;
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo112377f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f369162a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        m219719a();
        mo112378j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        m219719a();
        mo112378j();
    }
}
