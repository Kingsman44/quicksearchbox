package com.google.android.apps.gsa.velvet.p8863ui.settings.legal;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.apps.gsa.velvet.ui.settings.legal.c */
/* compiled from: PG */
class C118661c extends Fragment implements C68288b {

    /* renamed from: a */
    private ContextWrapper f331029a;

    /* renamed from: b */
    private boolean f331030b;

    /* renamed from: c */
    private volatile C68324h f331031c;

    /* renamed from: d */
    private final Object f331032d = new Object();

    /* renamed from: e */
    private boolean f331033e = false;

    /* renamed from: d */
    private final void m196996d() {
        if (this.f331029a == null) {
            this.f331029a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f331030b = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C68324h mo103847a() {
        if (this.f331031c == null) {
            synchronized (this.f331032d) {
                if (this.f331031c == null) {
                    this.f331031c = new C68324h(this);
                }
            }
        }
        return this.f331031c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo103848b() {
        if (!this.f331033e) {
            this.f331033e = true;
            mo103847a().mo17653jN();
            C118672n nVar = (C118672n) this;
        }
    }

    public final Context getContext() {
        if (super.getContext() == null && !this.f331030b) {
            return null;
        }
        m196996d();
        return this.f331029a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo103847a().mo17653jN();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f331029a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        m196996d();
        mo103848b();
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        m196996d();
        mo103848b();
    }
}
