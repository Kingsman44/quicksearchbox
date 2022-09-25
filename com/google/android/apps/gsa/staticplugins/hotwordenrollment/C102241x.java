package com.google.android.apps.gsa.staticplugins.hotwordenrollment;

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

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.x */
/* compiled from: PG */
class C102241x extends Fragment implements C68288b {

    /* renamed from: a */
    private ContextWrapper f285285a;

    /* renamed from: b */
    private boolean f285286b;

    /* renamed from: c */
    private volatile C68324h f285287c;

    /* renamed from: d */
    private final Object f285288d = new Object();

    /* renamed from: e */
    private boolean f285289e = false;

    /* renamed from: a */
    private final void mo92674a() {
        if (this.f285285a == null) {
            this.f285285a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f285286b = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C68324h mo92675b() {
        throw null;
    }

    /* renamed from: d */
    public final C68324h mo93038d() {
        if (this.f285287c == null) {
            synchronized (this.f285288d) {
                if (this.f285287c == null) {
                    this.f285287c = mo92675b();
                }
            }
        }
        return this.f285287c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo93039f() {
        if (!this.f285289e) {
            this.f285289e = true;
            mo93038d().mo17653jN();
            C101892n nVar = (C101892n) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f285286b) {
            return null;
        }
        mo92674a();
        return this.f285285a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo93038d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f285285a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo92674a();
        mo93039f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo92674a();
        mo93039f();
    }
}
