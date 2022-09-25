package com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3102b.p3106b.p3107a;

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

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.a.b.b.a.u */
/* compiled from: PG */
class C39967u extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f105073a;

    /* renamed from: c */
    private boolean f105074c;

    /* renamed from: d */
    private volatile C47247a f105075d;

    /* renamed from: e */
    private final Object f105076e = new Object();

    /* renamed from: f */
    private boolean f105077f = false;

    /* renamed from: a */
    private final void mo42093a() {
        if (this.f105073a == null) {
            this.f105073a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f105074c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo42094b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo42096d() {
        if (this.f105075d == null) {
            synchronized (this.f105076e) {
                if (this.f105075d == null) {
                    this.f105075d = mo42094b();
                }
            }
        }
        return this.f105075d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo42097f() {
        if (!this.f105077f) {
            this.f105077f = true;
            mo42096d().mo17653jN();
            C39953i iVar = (C39953i) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f105074c) {
            return null;
        }
        mo42093a();
        return this.f105073a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo42096d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f105073a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo42093a();
        mo42097f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo42093a();
        mo42097f();
    }
}
