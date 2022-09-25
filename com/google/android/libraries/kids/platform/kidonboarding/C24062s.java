package com.google.android.libraries.kids.platform.kidonboarding;

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

/* renamed from: com.google.android.libraries.kids.platform.kidonboarding.s */
/* compiled from: PG */
class C24062s extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f65738a;

    /* renamed from: c */
    private boolean f65739c;

    /* renamed from: d */
    private volatile C47247a f65740d;

    /* renamed from: e */
    private final Object f65741e = new Object();

    /* renamed from: f */
    private boolean f65742f = false;

    /* renamed from: a */
    private final void mo29441a() {
        if (this.f65738a == null) {
            this.f65738a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f65739c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo29442b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo29448d() {
        if (this.f65740d == null) {
            synchronized (this.f65741e) {
                if (this.f65740d == null) {
                    this.f65740d = mo29442b();
                }
            }
        }
        return this.f65740d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo29449f() {
        if (!this.f65742f) {
            this.f65742f = true;
            mo29448d().mo17653jN();
            C24052i iVar = (C24052i) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f65739c) {
            return null;
        }
        mo29441a();
        return this.f65738a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo29448d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f65738a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo29441a();
        mo29449f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo29441a();
        mo29449f();
    }
}
