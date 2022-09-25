package com.google.android.libraries.lens.view.onboarding;

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

/* renamed from: com.google.android.libraries.lens.view.onboarding.bh */
/* compiled from: PG */
class C27502bh extends Fragment implements C68288b {

    /* renamed from: a */
    private ContextWrapper f75207a;

    /* renamed from: b */
    private boolean f75208b;

    /* renamed from: c */
    private volatile C47247a f75209c;

    /* renamed from: d */
    private final Object f75210d = new Object();

    /* renamed from: e */
    private boolean f75211e = false;

    /* renamed from: a */
    private final void mo33058a() {
        if (this.f75207a == null) {
            this.f75207a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f75208b = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo33040b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo33041d() {
        if (this.f75209c == null) {
            synchronized (this.f75210d) {
                if (this.f75209c == null) {
                    this.f75209c = mo33040b();
                }
            }
        }
        return this.f75209c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo33042f() {
        if (!this.f75211e) {
            this.f75211e = true;
            mo33041d().mo17653jN();
            C27520r rVar = (C27520r) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f75208b) {
            return null;
        }
        mo33058a();
        return this.f75207a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo33041d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f75207a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo33058a();
        mo33042f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo33058a();
        mo33042f();
    }
}
