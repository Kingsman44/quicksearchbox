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

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.s */
/* compiled from: PG */
abstract class C102188s extends C101500a implements C68288b {

    /* renamed from: a */
    private ContextWrapper f285073a;

    /* renamed from: b */
    private boolean f285074b;

    /* renamed from: c */
    private volatile C68324h f285075c;

    /* renamed from: d */
    private final Object f285076d = new Object();

    /* renamed from: e */
    private boolean f285077e = false;

    /* renamed from: b */
    private final void mo92928b() {
        if (this.f285073a == null) {
            this.f285073a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f285074b = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C68324h mo92929d() {
        throw null;
    }

    /* renamed from: f */
    public final C68324h mo92935f() {
        if (this.f285075c == null) {
            synchronized (this.f285076d) {
                if (this.f285075c == null) {
                    this.f285075c = mo92929d();
                }
            }
        }
        return this.f285075c;
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f285074b) {
            return null;
        }
        mo92928b();
        return this.f285073a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo92936j() {
        if (!this.f285077e) {
            this.f285077e = true;
            mo92935f().mo17653jN();
            C102178i iVar = (C102178i) this;
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo92935f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f285073a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo92928b();
        mo92936j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo92928b();
        mo92936j();
    }
}
