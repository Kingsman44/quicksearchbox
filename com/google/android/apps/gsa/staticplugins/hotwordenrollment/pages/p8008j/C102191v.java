package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j;

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

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.v */
/* compiled from: PG */
abstract class C102191v extends C101500a implements C68288b {

    /* renamed from: a */
    private ContextWrapper f285088a;

    /* renamed from: b */
    private boolean f285089b;

    /* renamed from: c */
    private volatile C68324h f285090c;

    /* renamed from: d */
    private final Object f285091d = new Object();

    /* renamed from: e */
    private boolean f285092e = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f285088a == null) {
            this.f285088a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f285089b = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: b */
    public final C68324h mo92941b() {
        if (this.f285090c == null) {
            synchronized (this.f285091d) {
                if (this.f285090c == null) {
                    this.f285090c = mo92906d();
                }
            }
        }
        return this.f285090c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C68324h mo92906d() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo92942f() {
        if (!this.f285092e) {
            this.f285092e = true;
            mo92941b().mo17653jN();
            C102144ap apVar = (C102144ap) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f285089b) {
            return null;
        }
        mo17857e();
        return this.f285088a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo92941b().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f285088a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo92942f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo92942f();
    }
}
