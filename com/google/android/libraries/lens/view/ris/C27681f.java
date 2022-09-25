package com.google.android.libraries.lens.view.ris;

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

/* renamed from: com.google.android.libraries.lens.view.ris.f */
/* compiled from: PG */
class C27681f extends Fragment implements C68288b {

    /* renamed from: a */
    private ContextWrapper f75595a;

    /* renamed from: b */
    private boolean f75596b;

    /* renamed from: c */
    private volatile C47247a f75597c;

    /* renamed from: d */
    private final Object f75598d = new Object();

    /* renamed from: e */
    private boolean f75599e = false;

    /* renamed from: a */
    private final void mo33167a() {
        if (this.f75595a == null) {
            this.f75595a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f75596b = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo33168b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo33171d() {
        if (this.f75597c == null) {
            synchronized (this.f75598d) {
                if (this.f75597c == null) {
                    this.f75597c = mo33168b();
                }
            }
        }
        return this.f75597c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo33172f() {
        if (!this.f75599e) {
            this.f75599e = true;
            mo33171d().mo17653jN();
            C27677c cVar = (C27677c) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f75596b) {
            return null;
        }
        mo33167a();
        return this.f75595a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo33171d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f75595a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo33167a();
        mo33172f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo33167a();
        mo33172f();
    }
}
