package com.google.android.apps.search.xblend.xpane;

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

/* renamed from: com.google.android.apps.search.xblend.xpane.c */
/* compiled from: PG */
class C142277c extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f385994a;

    /* renamed from: c */
    private boolean f385995c;

    /* renamed from: d */
    private volatile C47247a f385996d;

    /* renamed from: e */
    private final Object f385997e = new Object();

    /* renamed from: f */
    private boolean f385998f = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f385994a == null) {
            this.f385994a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f385995c = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C47247a mo117106a() {
        if (this.f385996d == null) {
            synchronized (this.f385997e) {
                if (this.f385996d == null) {
                    this.f385996d = mo117107b();
                }
            }
        }
        return this.f385996d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo117107b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo117108d() {
        if (!this.f385998f) {
            this.f385998f = true;
            mo117106a().mo17653jN();
            C142283i iVar = (C142283i) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f385995c) {
            return null;
        }
        mo17857e();
        return this.f385994a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo117106a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f385994a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo117108d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo117108d();
    }
}
