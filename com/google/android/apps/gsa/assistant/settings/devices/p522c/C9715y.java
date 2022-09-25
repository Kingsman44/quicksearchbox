package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.android.apps.gsa.assistant.settings.base.C9499b;
import com.google.android.apps.gsa.assistant.settings.shared.h;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;
import dagger.p5294a.C68219e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.y */
/* compiled from: PG */
class C9715y extends C9499b implements C68288b {

    /* renamed from: a */
    private ContextWrapper f33565a;

    /* renamed from: b */
    private boolean f33566b;

    /* renamed from: c */
    private volatile C68324h f33567c;

    /* renamed from: d */
    private final Object f33568d = new Object();

    /* renamed from: e */
    private boolean f33569e = false;

    /* renamed from: b */
    private final void m24434b() {
        if (this.f33565a == null) {
            this.f33565a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f33566b = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: d */
    public final C68324h mo17985d() {
        if (this.f33567c == null) {
            synchronized (this.f33568d) {
                if (this.f33567c == null) {
                    this.f33567c = new C68324h(this);
                }
            }
        }
        return this.f33567c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo17986e() {
        if (!this.f33569e) {
            this.f33569e = true;
            C9702l lVar = (C9702l) this;
            C74178nm nmVar = (C74178nm) mo17985d().mo17653jN();
            lVar.f33528a = (h) nmVar.f207130a.a.f202853es.mo17428b();
            lVar.f33529b = (C86124t) nmVar.f207130a.a.f202006C.mo17428b();
            lVar.f33530c = C68219e.m98518a(nmVar.f207130a.a.f203126k);
            lVar.f33531d = C68219e.m98518a(nmVar.f207130a.d.f201749ew);
        }
    }

    public final Context getContext() {
        if (super.getContext() == null && !this.f33566b) {
            return null;
        }
        m24434b();
        return this.f33565a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo17985d().mo17653jN();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f33565a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        m24434b();
        mo17986e();
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        m24434b();
        mo17986e();
    }
}
