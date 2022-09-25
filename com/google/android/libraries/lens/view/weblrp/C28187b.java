package com.google.android.libraries.lens.view.weblrp;

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

/* renamed from: com.google.android.libraries.lens.view.weblrp.b */
/* compiled from: PG */
class C28187b extends Fragment implements C68288b {

    /* renamed from: a */
    private ContextWrapper f76712a;

    /* renamed from: b */
    private boolean f76713b;

    /* renamed from: c */
    private volatile C47247a f76714c;

    /* renamed from: d */
    private final Object f76715d = new Object();

    /* renamed from: e */
    private boolean f76716e = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f76712a == null) {
            this.f76712a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f76713b = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C47247a mo33706a() {
        if (this.f76714c == null) {
            synchronized (this.f76715d) {
                if (this.f76714c == null) {
                    this.f76714c = mo33707b();
                }
            }
        }
        return this.f76714c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo33707b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo33708d() {
        if (!this.f76716e) {
            this.f76716e = true;
            mo33706a().mo17653jN();
            C28201o oVar = (C28201o) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f76713b) {
            return null;
        }
        mo17857e();
        return this.f76712a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo33706a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f76712a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo33708d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo33708d();
    }
}
