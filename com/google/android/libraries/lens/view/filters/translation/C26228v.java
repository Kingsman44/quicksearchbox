package com.google.android.libraries.lens.view.filters.translation;

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

/* renamed from: com.google.android.libraries.lens.view.filters.translation.v */
/* compiled from: PG */
class C26228v extends Fragment implements C68288b {

    /* renamed from: a */
    private ContextWrapper f71270a;

    /* renamed from: b */
    private boolean f71271b;

    /* renamed from: c */
    private volatile C47247a f71272c;

    /* renamed from: d */
    private final Object f71273d = new Object();

    /* renamed from: e */
    private boolean f71274e = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f71270a == null) {
            this.f71270a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f71271b = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C47247a mo31448a() {
        if (this.f71272c == null) {
            synchronized (this.f71273d) {
                if (this.f71272c == null) {
                    this.f71272c = mo31279b();
                }
            }
        }
        return this.f71272c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo31279b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo31449d() {
        if (!this.f71274e) {
            this.f71274e = true;
            mo31448a().mo17653jN();
            C26079bq bqVar = (C26079bq) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f71271b) {
            return null;
        }
        mo17857e();
        return this.f71270a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo31448a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f71270a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo31449d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo31449d();
    }
}
