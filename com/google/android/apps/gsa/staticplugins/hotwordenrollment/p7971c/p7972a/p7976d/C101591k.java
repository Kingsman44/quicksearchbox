package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7976d;

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

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.d.k */
/* compiled from: PG */
abstract class C101591k extends C101500a implements C68288b {

    /* renamed from: a */
    private ContextWrapper f283477a;

    /* renamed from: b */
    private boolean f283478b;

    /* renamed from: c */
    private volatile C68324h f283479c;

    /* renamed from: d */
    private final Object f283480d = new Object();

    /* renamed from: e */
    private boolean f283481e = false;

    /* renamed from: b */
    private final void mo92408b() {
        if (this.f283477a == null) {
            this.f283477a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f283478b = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C68324h mo92409d() {
        throw null;
    }

    /* renamed from: f */
    public final C68324h mo92413f() {
        if (this.f283479c == null) {
            synchronized (this.f283480d) {
                if (this.f283479c == null) {
                    this.f283479c = mo92409d();
                }
            }
        }
        return this.f283479c;
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f283478b) {
            return null;
        }
        mo92408b();
        return this.f283477a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo92414j() {
        if (!this.f283481e) {
            this.f283481e = true;
            mo92413f().mo17653jN();
            C101582b bVar = (C101582b) this;
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo92413f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f283477a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo92408b();
        mo92414j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo92408b();
        mo92414j();
    }
}
