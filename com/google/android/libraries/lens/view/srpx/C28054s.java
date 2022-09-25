package com.google.android.libraries.lens.view.srpx;

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

/* renamed from: com.google.android.libraries.lens.view.srpx.s */
/* compiled from: PG */
class C28054s extends Fragment implements C68288b {

    /* renamed from: a */
    private ContextWrapper f76356a;

    /* renamed from: b */
    private boolean f76357b;

    /* renamed from: c */
    private volatile C47247a f76358c;

    /* renamed from: d */
    private final Object f76359d = new Object();

    /* renamed from: e */
    private boolean f76360e = false;

    /* renamed from: a */
    private final void mo33501a() {
        if (this.f76356a == null) {
            this.f76356a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f76357b = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo33502b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo33506d() {
        if (this.f76358c == null) {
            synchronized (this.f76359d) {
                if (this.f76358c == null) {
                    this.f76358c = mo33502b();
                }
            }
        }
        return this.f76358c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo33507f() {
        if (!this.f76360e) {
            this.f76360e = true;
            mo33506d().mo17653jN();
            C28049o oVar = (C28049o) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f76357b) {
            return null;
        }
        mo33501a();
        return this.f76356a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo33506d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f76356a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo33501a();
        mo33507f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo33501a();
        mo33507f();
    }
}
