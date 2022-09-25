package com.google.android.apps.search.assistant.verticals.ambient.feedback.full;

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

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.feedback.full.ab */
/* compiled from: PG */
class C130621ab extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f357747a;

    /* renamed from: c */
    private boolean f357748c;

    /* renamed from: d */
    private volatile C47247a f357749d;

    /* renamed from: e */
    private final Object f357750e = new Object();

    /* renamed from: f */
    private boolean f357751f = false;

    /* renamed from: a */
    private final void mo109772a() {
        if (this.f357747a == null) {
            this.f357747a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f357748c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo109766b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo109767d() {
        if (this.f357749d == null) {
            synchronized (this.f357750e) {
                if (this.f357749d == null) {
                    this.f357749d = mo109766b();
                }
            }
        }
        return this.f357749d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo109768f() {
        if (!this.f357751f) {
            this.f357751f = true;
            mo109767d().mo17653jN();
            C130629i iVar = (C130629i) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f357748c) {
            return null;
        }
        mo109772a();
        return this.f357747a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo109767d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f357747a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo109772a();
        mo109768f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo109772a();
        mo109768f();
    }
}
