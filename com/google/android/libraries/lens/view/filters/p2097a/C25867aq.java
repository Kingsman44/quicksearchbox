package com.google.android.libraries.lens.view.filters.p2097a;

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

/* renamed from: com.google.android.libraries.lens.view.filters.a.aq */
/* compiled from: PG */
class C25867aq extends Fragment implements C68288b {

    /* renamed from: a */
    private ContextWrapper f70279a;

    /* renamed from: b */
    private boolean f70280b;

    /* renamed from: c */
    private volatile C47247a f70281c;

    /* renamed from: d */
    private final Object f70282d = new Object();

    /* renamed from: e */
    private boolean f70283e = false;

    /* renamed from: a */
    private final void mo31043a() {
        if (this.f70279a == null) {
            this.f70279a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f70280b = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo31032b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo31033d() {
        if (this.f70281c == null) {
            synchronized (this.f70282d) {
                if (this.f70281c == null) {
                    this.f70281c = mo31032b();
                }
            }
        }
        return this.f70281c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo31034f() {
        if (!this.f70283e) {
            this.f70283e = true;
            mo31033d().mo17653jN();
            C25876i iVar = (C25876i) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f70280b) {
            return null;
        }
        mo31043a();
        return this.f70279a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo31033d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f70279a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo31043a();
        mo31034f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo31043a();
        mo31034f();
    }
}
