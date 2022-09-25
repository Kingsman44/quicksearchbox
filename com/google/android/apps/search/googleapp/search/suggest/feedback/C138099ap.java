package com.google.android.apps.search.googleapp.search.suggest.feedback;

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

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.feedback.ap */
/* compiled from: PG */
class C138099ap extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f375733a;

    /* renamed from: c */
    private boolean f375734c;

    /* renamed from: d */
    private volatile C47247a f375735d;

    /* renamed from: e */
    private final Object f375736e = new Object();

    /* renamed from: f */
    private boolean f375737f = false;

    /* renamed from: a */
    private final void mo114156a() {
        if (this.f375733a == null) {
            this.f375733a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f375734c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo114148b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo114149d() {
        if (this.f375735d == null) {
            synchronized (this.f375736e) {
                if (this.f375735d == null) {
                    this.f375735d = mo114148b();
                }
            }
        }
        return this.f375735d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo114150f() {
        if (!this.f375737f) {
            this.f375737f = true;
            mo114149d().mo17653jN();
            C138120v vVar = (C138120v) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f375734c) {
            return null;
        }
        mo114156a();
        return this.f375733a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo114149d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f375733a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo114156a();
        mo114150f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo114156a();
        mo114150f();
    }
}
