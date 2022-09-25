package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10296j;

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

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.j.e */
/* compiled from: PG */
class C135866e extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f370031a;

    /* renamed from: c */
    private boolean f370032c;

    /* renamed from: d */
    private volatile C47247a f370033d;

    /* renamed from: e */
    private final Object f370034e = new Object();

    /* renamed from: f */
    private boolean f370035f = false;

    /* renamed from: a */
    private final void mo112588a() {
        if (this.f370031a == null) {
            this.f370031a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f370032c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo112589b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo112590d() {
        if (this.f370033d == null) {
            synchronized (this.f370034e) {
                if (this.f370033d == null) {
                    this.f370033d = mo112589b();
                }
            }
        }
        return this.f370033d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo112591f() {
        if (!this.f370035f) {
            this.f370035f = true;
            mo112590d().mo17653jN();
            C135862b bVar = (C135862b) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f370032c) {
            return null;
        }
        mo112588a();
        return this.f370031a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo112590d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f370031a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo112588a();
        mo112591f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo112588a();
        mo112591f();
    }
}
