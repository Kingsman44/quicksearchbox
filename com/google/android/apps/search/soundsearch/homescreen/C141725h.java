package com.google.android.apps.search.soundsearch.homescreen;

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

/* renamed from: com.google.android.apps.search.soundsearch.homescreen.h */
/* compiled from: PG */
class C141725h extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f384688a;

    /* renamed from: c */
    private boolean f384689c;

    /* renamed from: d */
    private volatile C47247a f384690d;

    /* renamed from: e */
    private final Object f384691e = new Object();

    /* renamed from: f */
    private boolean f384692f = false;

    /* renamed from: a */
    private final void mo116676a() {
        if (this.f384688a == null) {
            this.f384688a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f384689c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo116677b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo116685d() {
        if (this.f384690d == null) {
            synchronized (this.f384691e) {
                if (this.f384690d == null) {
                    this.f384690d = mo116677b();
                }
            }
        }
        return this.f384690d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo116686f() {
        if (!this.f384692f) {
            this.f384692f = true;
            mo116685d().mo17653jN();
            C141720c cVar = (C141720c) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f384689c) {
            return null;
        }
        mo116676a();
        return this.f384688a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo116685d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f384688a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo116676a();
        mo116686f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo116676a();
        mo116686f();
    }
}
