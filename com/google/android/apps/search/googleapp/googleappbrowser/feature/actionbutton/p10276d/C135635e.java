package com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10276d;

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

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.d.e */
/* compiled from: PG */
class C135635e extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f369462a;

    /* renamed from: c */
    private boolean f369463c;

    /* renamed from: d */
    private volatile C47247a f369464d;

    /* renamed from: e */
    private final Object f369465e = new Object();

    /* renamed from: f */
    private boolean f369466f = false;

    /* renamed from: a */
    private final void mo112433a() {
        if (this.f369462a == null) {
            this.f369462a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f369463c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo112434b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo112435d() {
        if (this.f369464d == null) {
            synchronized (this.f369465e) {
                if (this.f369464d == null) {
                    this.f369464d = mo112434b();
                }
            }
        }
        return this.f369464d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo112436f() {
        if (!this.f369466f) {
            this.f369466f = true;
            mo112435d().mo17653jN();
            C135633c cVar = (C135633c) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f369463c) {
            return null;
        }
        mo112433a();
        return this.f369462a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo112435d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f369462a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo112433a();
        mo112436f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo112433a();
        mo112436f();
    }
}
