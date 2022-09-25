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

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.f */
/* compiled from: PG */
abstract class C101697f extends C101500a implements C68288b {

    /* renamed from: a */
    private ContextWrapper f283763a;

    /* renamed from: b */
    private boolean f283764b;

    /* renamed from: c */
    private volatile C68324h f283765c;

    /* renamed from: d */
    private final Object f283766d = new Object();

    /* renamed from: e */
    private boolean f283767e = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f283763a == null) {
            this.f283763a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f283764b = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: b */
    public final C68324h mo92505b() {
        if (this.f283765c == null) {
            synchronized (this.f283766d) {
                if (this.f283765c == null) {
                    this.f283765c = mo92462d();
                }
            }
        }
        return this.f283765c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C68324h mo92462d() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo92506f() {
        if (!this.f283767e) {
            this.f283767e = true;
            mo92505b().mo17653jN();
            C101651ao aoVar = (C101651ao) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f283764b) {
            return null;
        }
        mo17857e();
        return this.f283763a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo92505b().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f283763a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo92506f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo92506f();
    }
}
