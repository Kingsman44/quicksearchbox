package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.android.apps.gsa.assistant.settings.shared.h;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.smartspace.C92122r;
import com.google.android.apps.gsa.smartspace.C92125t;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110402b;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;
import dagger.p5294a.C68219e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.ab */
/* compiled from: PG */
class C9647ab extends Fragment implements C68288b {

    /* renamed from: a */
    private ContextWrapper f33373a;

    /* renamed from: b */
    private boolean f33374b;

    /* renamed from: c */
    private volatile C68324h f33375c;

    /* renamed from: d */
    private final Object f33376d = new Object();

    /* renamed from: e */
    private boolean f33377e = false;

    /* renamed from: d */
    private final void mo17940d() {
        if (this.f33373a == null) {
            this.f33373a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f33374b = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C68324h mo17921a() {
        if (this.f33375c == null) {
            synchronized (this.f33376d) {
                if (this.f33375c == null) {
                    this.f33375c = new C68324h(this);
                }
            }
        }
        return this.f33375c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo17922b() {
        if (!this.f33377e) {
            this.f33377e = true;
            C9664as asVar = (C9664as) this;
            C74178nm nmVar = (C74178nm) mo17921a().mo17653jN();
            asVar.f33410a = (h) nmVar.f207130a.a.f202853es.mo17428b();
            asVar.f33411b = C68219e.m98518a(nmVar.f207130a.a.f202827eS);
            asVar.f33412c = (C86124t) nmVar.f207130a.a.f202006C.mo17428b();
            asVar.f33413d = C68219e.m98518a(nmVar.f207130a.d.f201750ex);
            asVar.f33414e = C68219e.m98518a(nmVar.f207130a.a.f202760dE);
            asVar.f33415f = nmVar.mo70071m();
            asVar.f33423n = (C110402b) nmVar.f207130a.a.f202859ey.mo17428b();
            asVar.f33416g = (C92122r) nmVar.f207130a.a.f202712cJ.mo17428b();
            asVar.f33417h = (C83794j) nmVar.f207130a.a.f202815eG.mo17428b();
            asVar.f33418i = (C92125t) nmVar.f207130a.a.f202834eZ.mo17428b();
        }
    }

    public final Context getContext() {
        if (super.getContext() == null && !this.f33374b) {
            return null;
        }
        mo17940d();
        return this.f33373a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo17921a().mo17653jN();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f33373a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17940d();
        mo17922b();
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        mo17940d();
        mo17922b();
    }
}
