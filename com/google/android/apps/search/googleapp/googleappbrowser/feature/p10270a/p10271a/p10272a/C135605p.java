package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10270a.p10271a.p10272a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.apps.tiktok.inject.p3654a.p3655a.C47189c;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.a.a.a.p */
/* compiled from: PG */
class C135605p extends Fragment implements C68288b {

    /* renamed from: a */
    private ContextWrapper f369383a;

    /* renamed from: b */
    private boolean f369384b;

    /* renamed from: c */
    private volatile C47247a f369385c;

    /* renamed from: d */
    private final Object f369386d = new Object();

    /* renamed from: e */
    private boolean f369387e = false;

    /* renamed from: a */
    private final void mo112402a() {
        if (this.f369383a == null) {
            this.f369383a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f369384b = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo112403b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo112410d() {
        if (this.f369385c == null) {
            synchronized (this.f369386d) {
                if (this.f369385c == null) {
                    this.f369385c = mo112403b();
                }
            }
        }
        return this.f369385c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo112411f() {
        if (!this.f369387e) {
            this.f369387e = true;
            mo112410d().mo17653jN();
            C135597h hVar = (C135597h) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f369384b) {
            return null;
        }
        mo112402a();
        return this.f369383a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo112410d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f369383a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo112402a();
        mo112411f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo112402a();
        mo112411f();
    }
}
