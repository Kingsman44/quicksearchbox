package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7993b;

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

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.b.h */
/* compiled from: PG */
abstract class C101915h extends C101500a implements C68288b {

    /* renamed from: a */
    private ContextWrapper f284283a;

    /* renamed from: b */
    private boolean f284284b;

    /* renamed from: c */
    private volatile C68324h f284285c;

    /* renamed from: d */
    private final Object f284286d = new Object();

    /* renamed from: e */
    private boolean f284287e = false;

    /* renamed from: b */
    private final void mo92683b() {
        if (this.f284283a == null) {
            this.f284283a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f284284b = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C68324h mo92684d() {
        throw null;
    }

    /* renamed from: f */
    public final C68324h mo92685f() {
        if (this.f284285c == null) {
            synchronized (this.f284286d) {
                if (this.f284285c == null) {
                    this.f284285c = mo92684d();
                }
            }
        }
        return this.f284285c;
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f284284b) {
            return null;
        }
        mo92683b();
        return this.f284283a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo92686j() {
        if (!this.f284287e) {
            this.f284287e = true;
            mo92685f().mo17653jN();
            C101909b bVar = (C101909b) this;
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo92685f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f284283a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo92683b();
        mo92686j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo92683b();
        mo92686j();
    }
}
