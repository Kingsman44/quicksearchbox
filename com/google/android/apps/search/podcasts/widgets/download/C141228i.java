package com.google.android.apps.search.podcasts.widgets.download;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1629c.p1630a.C19521a;
import com.google.apps.tiktok.inject.p3654a.p3655a.C47189c;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.apps.search.podcasts.widgets.download.i */
/* compiled from: PG */
class C141228i extends C19521a implements C68288b {

    /* renamed from: b */
    private ContextWrapper f383418b;

    /* renamed from: c */
    private boolean f383419c;

    /* renamed from: d */
    private volatile C47247a f383420d;

    /* renamed from: e */
    private final Object f383421e = new Object();

    /* renamed from: f */
    private boolean f383422f = false;

    /* renamed from: a */
    private final void mo18360a() {
        if (this.f383418b == null) {
            this.f383418b = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f383419c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo116231b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo116244d() {
        if (this.f383420d == null) {
            synchronized (this.f383421e) {
                if (this.f383420d == null) {
                    this.f383420d = mo116231b();
                }
            }
        }
        return this.f383420d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo116245f() {
        if (!this.f383422f) {
            this.f383422f = true;
            mo116244d().mo17653jN();
            DownloadActionsDialogFragment downloadActionsDialogFragment = (DownloadActionsDialogFragment) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f383419c) {
            return null;
        }
        mo18360a();
        return this.f383418b;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo116244d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f383418b;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo18360a();
        mo116245f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo18360a();
        mo116245f();
    }
}
