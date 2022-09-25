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

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.bk */
/* compiled from: PG */
class C135518bk extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f369167a;

    /* renamed from: c */
    private boolean f369168c;

    /* renamed from: d */
    private volatile C47247a f369169d;

    /* renamed from: e */
    private final Object f369170e = new Object();

    /* renamed from: f */
    private boolean f369171f = false;

    /* renamed from: a */
    private final void mo112691a() {
        if (this.f369167a == null) {
            this.f369167a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f369168c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo112379b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo112380d() {
        if (this.f369169d == null) {
            synchronized (this.f369170e) {
                if (this.f369169d == null) {
                    this.f369169d = mo112379b();
                }
            }
        }
        return this.f369169d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo112381f() {
        if (!this.f369171f) {
            this.f369171f = true;
            mo112380d().mo17653jN();
            C136020o oVar = (C136020o) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f369168c) {
            return null;
        }
        mo112691a();
        return this.f369167a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo112380d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f369167a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo112691a();
        mo112381f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo112691a();
        mo112381f();
    }
}
