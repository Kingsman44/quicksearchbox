package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7995d;

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

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.d.e */
/* compiled from: PG */
abstract class C101925e extends C101500a implements C68288b {

    /* renamed from: a */
    private ContextWrapper f284315a;

    /* renamed from: b */
    private boolean f284316b;

    /* renamed from: c */
    private volatile C68324h f284317c;

    /* renamed from: d */
    private final Object f284318d = new Object();

    /* renamed from: e */
    private boolean f284319e = false;

    /* renamed from: b */
    private final void mo92691b() {
        if (this.f284315a == null) {
            this.f284315a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f284316b = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C68324h mo92692d() {
        throw null;
    }

    /* renamed from: f */
    public final C68324h mo92693f() {
        if (this.f284317c == null) {
            synchronized (this.f284318d) {
                if (this.f284317c == null) {
                    this.f284317c = mo92692d();
                }
            }
        }
        return this.f284317c;
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f284316b) {
            return null;
        }
        mo92691b();
        return this.f284315a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo92694j() {
        if (!this.f284319e) {
            this.f284319e = true;
            mo92693f().mo17653jN();
            C101922b bVar = (C101922b) this;
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo92693f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f284315a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo92691b();
        mo92694j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo92691b();
        mo92694j();
    }
}
