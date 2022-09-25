package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.C0260w;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.d */
/* compiled from: PG */
class C102204d extends C0260w implements C68288b {

    /* renamed from: a */
    private ContextWrapper f285182a;

    /* renamed from: b */
    private boolean f285183b;

    /* renamed from: c */
    private volatile C68324h f285184c;

    /* renamed from: d */
    private final Object f285185d = new Object();

    /* renamed from: e */
    private boolean f285186e = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f285182a == null) {
            this.f285182a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f285183b = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C68324h mo92993a() {
        if (this.f285184c == null) {
            synchronized (this.f285185d) {
                if (this.f285184c == null) {
                    this.f285184c = mo92994b();
                }
            }
        }
        return this.f285184c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C68324h mo92994b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo92995d() {
        if (!this.f285186e) {
            this.f285186e = true;
            mo92993a().mo17653jN();
            C102207g gVar = (C102207g) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f285183b) {
            return null;
        }
        mo17857e();
        return this.f285182a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo92993a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f285182a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo92995d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo92995d();
    }
}
