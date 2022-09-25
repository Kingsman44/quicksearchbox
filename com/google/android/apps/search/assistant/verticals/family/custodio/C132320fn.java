package com.google.android.apps.search.assistant.verticals.family.custodio;

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

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.fn */
/* compiled from: PG */
class C132320fn extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f361171a;

    /* renamed from: c */
    private boolean f361172c;

    /* renamed from: d */
    private volatile C47247a f361173d;

    /* renamed from: e */
    private final Object f361174e = new Object();

    /* renamed from: f */
    private boolean f361175f = false;

    /* renamed from: a */
    private final void mo110556a() {
        if (this.f361171a == null) {
            this.f361171a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f361172c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo110557b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo110627d() {
        if (this.f361173d == null) {
            synchronized (this.f361174e) {
                if (this.f361173d == null) {
                    this.f361173d = mo110557b();
                }
            }
        }
        return this.f361173d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo110628f() {
        if (!this.f361175f) {
            this.f361175f = true;
            mo110627d().mo17653jN();
            C132230cp cpVar = (C132230cp) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f361172c) {
            return null;
        }
        mo110556a();
        return this.f361171a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo110627d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f361171a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo110556a();
        mo110628f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo110556a();
        mo110628f();
    }
}
