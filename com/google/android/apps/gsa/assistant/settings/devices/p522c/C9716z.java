package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.android.apps.gsa.assist.p501a.C9325m;
import com.google.android.apps.gsa.assist.p503c.p504a.C9388a;
import com.google.android.apps.gsa.assistant.settings.shared.h;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;
import dagger.p5294a.C68219e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.z */
/* compiled from: PG */
class C9716z extends Fragment implements C68288b {

    /* renamed from: a */
    private ContextWrapper f33570a;

    /* renamed from: b */
    private boolean f33571b;

    /* renamed from: c */
    private volatile C68324h f33572c;

    /* renamed from: d */
    private final Object f33573d = new Object();

    /* renamed from: e */
    private boolean f33574e = false;

    /* renamed from: a */
    private final void mo17978a() {
        if (this.f33570a == null) {
            this.f33570a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f33571b = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: b */
    public final C68324h mo17987b() {
        if (this.f33572c == null) {
            synchronized (this.f33573d) {
                if (this.f33572c == null) {
                    this.f33572c = new C68324h(this);
                }
            }
        }
        return this.f33572c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo17988d() {
        if (!this.f33574e) {
            this.f33574e = true;
            C9711u uVar = (C9711u) this;
            C74178nm nmVar = (C74178nm) mo17987b().mo17653jN();
            uVar.f33541a = (C86124t) nmVar.f207130a.a.f202006C.mo17428b();
            uVar.f33542b = (C9388a) nmVar.f207130a.a.f202764dI.mo17428b();
            uVar.f33543c = nmVar.mo70060b();
            uVar.f33544d = nmVar.f207130a.b.mo67560h();
            uVar.f33545e = (C9325m) nmVar.f207130a.br.mo17428b();
            uVar.f33546f = nmVar.f207136c.mo69375g();
            h hVar = (h) nmVar.f207130a.a.f202853es.mo17428b();
            l lVar = (l) nmVar.f207130a.a.f202833eY.mo17428b();
            C22871g gVar = (C22871g) nmVar.f207130a.aT.mo17428b();
            C22871g gVar2 = (C22871g) nmVar.f207130a.aV.mo17428b();
            uVar.f33547g = C68219e.m98518a(nmVar.f207130a.b.f200178eg);
        }
    }

    public final Context getContext() {
        if (super.getContext() == null && !this.f33571b) {
            return null;
        }
        mo17978a();
        return this.f33570a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo17987b().mo17653jN();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f33570a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17978a();
        mo17988d();
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        mo17978a();
        mo17988d();
    }
}
