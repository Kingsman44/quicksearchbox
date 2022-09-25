package com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.feedback;

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

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.feedback.e */
/* compiled from: PG */
class C135693e extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f369616a;

    /* renamed from: c */
    private boolean f369617c;

    /* renamed from: d */
    private volatile C47247a f369618d;

    /* renamed from: e */
    private final Object f369619e = new Object();

    /* renamed from: f */
    private boolean f369620f = false;

    /* renamed from: a */
    private final void mo112472a() {
        if (this.f369616a == null) {
            this.f369616a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f369617c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo112473b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo112474d() {
        if (this.f369618d == null) {
            synchronized (this.f369619e) {
                if (this.f369618d == null) {
                    this.f369618d = mo112473b();
                }
            }
        }
        return this.f369618d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo112475f() {
        if (!this.f369620f) {
            this.f369620f = true;
            mo112474d().mo17653jN();
            C135690b bVar = (C135690b) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f369617c) {
            return null;
        }
        mo112472a();
        return this.f369616a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo112474d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f369616a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo112472a();
        mo112475f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo112472a();
        mo112475f();
    }
}
