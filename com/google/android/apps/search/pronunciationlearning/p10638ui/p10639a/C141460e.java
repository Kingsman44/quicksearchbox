package com.google.android.apps.search.pronunciationlearning.p10638ui.p10639a;

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

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.a.e */
/* compiled from: PG */
class C141460e extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f383968a;

    /* renamed from: c */
    private boolean f383969c;

    /* renamed from: d */
    private volatile C47247a f383970d;

    /* renamed from: e */
    private final Object f383971e = new Object();

    /* renamed from: f */
    private boolean f383972f = false;

    /* renamed from: a */
    private final void mo116437a() {
        if (this.f383968a == null) {
            this.f383968a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f383969c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo116438b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo116455d() {
        if (this.f383970d == null) {
            synchronized (this.f383971e) {
                if (this.f383970d == null) {
                    this.f383970d = mo116438b();
                }
            }
        }
        return this.f383970d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo116456f() {
        if (!this.f383972f) {
            this.f383972f = true;
            mo116455d().mo17653jN();
            C141441b bVar = (C141441b) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f383969c) {
            return null;
        }
        mo116437a();
        return this.f383968a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo116455d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f383968a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo116437a();
        mo116456f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo116437a();
        mo116456f();
    }
}
