package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7996e;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7970b.C101500a;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.aj */
/* compiled from: PG */
abstract class C101936aj extends C101500a implements C68288b {

    /* renamed from: a */
    private ContextWrapper f284383a;

    /* renamed from: b */
    private boolean f284384b;

    /* renamed from: c */
    private volatile C68324h f284385c;

    /* renamed from: d */
    private final Object f284386d = new Object();

    /* renamed from: e */
    private boolean f284387e = false;

    /* renamed from: b */
    private final void m168686b() {
        if (this.f284383a == null) {
            this.f284383a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f284384b = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C68324h mo92718f() {
        throw null;
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f284384b) {
            return null;
        }
        m168686b();
        return this.f284383a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: j */
    public final C68324h mo92719j() {
        if (this.f284385c == null) {
            synchronized (this.f284386d) {
                if (this.f284385c == null) {
                    this.f284385c = mo92718f();
                }
            }
        }
        return this.f284385c;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo92719j().mo17653jN();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo92720k() {
        if (!this.f284387e) {
            this.f284387e = true;
            mo92719j().mo17653jN();
            C101970k kVar = (C101970k) this;
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f284383a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        m168686b();
        mo92720k();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        m168686b();
        mo92720k();
    }
}
