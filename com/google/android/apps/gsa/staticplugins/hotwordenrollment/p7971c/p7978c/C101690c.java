package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c;

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

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.c */
/* compiled from: PG */
abstract class C101690c extends C101500a implements C68288b {

    /* renamed from: a */
    private ContextWrapper f283739a;

    /* renamed from: b */
    private boolean f283740b;

    /* renamed from: c */
    private volatile C68324h f283741c;

    /* renamed from: d */
    private final Object f283742d = new Object();

    /* renamed from: e */
    private boolean f283743e = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f283739a == null) {
            this.f283739a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f283740b = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: b */
    public final C68324h mo92498b() {
        if (this.f283741c == null) {
            synchronized (this.f283742d) {
                if (this.f283741c == null) {
                    this.f283741c = mo92499d();
                }
            }
        }
        return this.f283741c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C68324h mo92499d() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo92500f() {
        if (!this.f283743e) {
            this.f283743e = true;
            mo92498b().mo17653jN();
            C101713v vVar = (C101713v) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f283740b) {
            return null;
        }
        mo17857e();
        return this.f283739a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo92498b().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f283739a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo92500f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo92500f();
    }
}
