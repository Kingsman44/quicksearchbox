package com.google.android.libraries.lens.view.p2065ai;

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

/* renamed from: com.google.android.libraries.lens.view.ai.au */
/* compiled from: PG */
class C25161au extends Fragment implements C68288b {

    /* renamed from: a */
    private ContextWrapper f68540a;

    /* renamed from: b */
    private boolean f68541b;

    /* renamed from: c */
    private volatile C47247a f68542c;

    /* renamed from: d */
    private final Object f68543d = new Object();

    /* renamed from: e */
    private boolean f68544e = false;

    /* renamed from: a */
    private final void mo30329a() {
        if (this.f68540a == null) {
            this.f68540a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f68541b = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo30304b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo30305d() {
        if (this.f68542c == null) {
            synchronized (this.f68543d) {
                if (this.f68542c == null) {
                    this.f68542c = mo30304b();
                }
            }
        }
        return this.f68542c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo30306f() {
        if (!this.f68544e) {
            this.f68544e = true;
            mo30305d().mo17653jN();
            C25187y yVar = (C25187y) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f68541b) {
            return null;
        }
        mo30329a();
        return this.f68540a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo30305d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f68540a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo30329a();
        mo30306f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo30329a();
        mo30306f();
    }
}
