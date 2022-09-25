package com.google.android.libraries.web.p3420k;

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

/* renamed from: com.google.android.libraries.web.k.e */
/* compiled from: PG */
class C43859e extends Fragment implements C68288b {

    /* renamed from: a */
    private ContextWrapper f114300a;

    /* renamed from: b */
    private boolean f114301b;

    /* renamed from: c */
    private volatile C47247a f114302c;

    /* renamed from: d */
    private final Object f114303d = new Object();

    /* renamed from: e */
    private boolean f114304e = false;

    /* renamed from: a */
    private final void mo46852a() {
        if (this.f114300a == null) {
            this.f114300a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f114301b = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo46853b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo46869d() {
        if (this.f114302c == null) {
            synchronized (this.f114303d) {
                if (this.f114302c == null) {
                    this.f114302c = mo46853b();
                }
            }
        }
        return this.f114302c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo46870f() {
        if (!this.f114304e) {
            this.f114304e = true;
            mo46869d().mo17653jN();
            C43855b bVar = (C43855b) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f114301b) {
            return null;
        }
        mo46852a();
        return this.f114300a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo46869d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f114300a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo46852a();
        mo46870f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo46852a();
        mo46870f();
    }
}
