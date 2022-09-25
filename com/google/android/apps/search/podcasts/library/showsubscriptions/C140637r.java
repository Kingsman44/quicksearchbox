package com.google.android.apps.search.podcasts.library.showsubscriptions;

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

/* renamed from: com.google.android.apps.search.podcasts.library.showsubscriptions.r */
/* compiled from: PG */
class C140637r extends C19520a implements C68288b {

    /* renamed from: a */
    private ContextWrapper f381958a;

    /* renamed from: c */
    private boolean f381959c;

    /* renamed from: d */
    private volatile C47247a f381960d;

    /* renamed from: e */
    private final Object f381961e = new Object();

    /* renamed from: f */
    private boolean f381962f = false;

    /* renamed from: a */
    private final void mo115789a() {
        if (this.f381958a == null) {
            this.f381958a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f381959c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo115790b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo115806d() {
        if (this.f381960d == null) {
            synchronized (this.f381961e) {
                if (this.f381960d == null) {
                    this.f381960d = mo115790b();
                }
            }
        }
        return this.f381960d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo115807f() {
        if (!this.f381962f) {
            this.f381962f = true;
            mo115806d().mo17653jN();
            AddCustomFeedDialogFragment addCustomFeedDialogFragment = (AddCustomFeedDialogFragment) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f381959c) {
            return null;
        }
        mo115789a();
        return this.f381958a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo115806d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f381958a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo115789a();
        mo115807f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo115789a();
        mo115807f();
    }
}
