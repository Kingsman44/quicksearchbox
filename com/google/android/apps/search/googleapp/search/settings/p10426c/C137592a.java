package com.google.android.apps.search.googleapp.search.settings.p10426c;

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

/* renamed from: com.google.android.apps.search.googleapp.search.settings.c.a */
/* compiled from: PG */
class C137592a extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f374251a;

    /* renamed from: c */
    private boolean f374252c;

    /* renamed from: d */
    private volatile C47247a f374253d;

    /* renamed from: e */
    private final Object f374254e = new Object();

    /* renamed from: f */
    private boolean f374255f = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f374251a == null) {
            this.f374251a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f374252c = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C47247a mo113842a() {
        if (this.f374253d == null) {
            synchronized (this.f374254e) {
                if (this.f374253d == null) {
                    this.f374253d = mo113843b();
                }
            }
        }
        return this.f374253d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo113843b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo113844d() {
        if (!this.f374255f) {
            this.f374255f = true;
            mo113842a().mo17653jN();
            C137594c cVar = (C137594c) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f374252c) {
            return null;
        }
        mo17857e();
        return this.f374251a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo113842a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f374251a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo113844d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo113844d();
    }
}
