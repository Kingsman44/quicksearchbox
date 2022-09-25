package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
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

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.w */
/* compiled from: PG */
class C9713w extends Fragment implements C68288b {

    /* renamed from: a */
    private ContextWrapper f33555a;

    /* renamed from: b */
    private boolean f33556b;

    /* renamed from: c */
    private volatile C68324h f33557c;

    /* renamed from: d */
    private final Object f33558d = new Object();

    /* renamed from: e */
    private boolean f33559e = false;

    /* renamed from: d */
    private final void m24426d() {
        if (this.f33555a == null) {
            this.f33555a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f33556b = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C68324h mo17981a() {
        if (this.f33557c == null) {
            synchronized (this.f33558d) {
                if (this.f33557c == null) {
                    this.f33557c = new C68324h(this);
                }
            }
        }
        return this.f33557c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo17982b() {
        if (!this.f33559e) {
            this.f33559e = true;
            C9695e eVar = (C9695e) this;
            C74178nm nmVar = (C74178nm) mo17981a().mo17653jN();
            eVar.f33503a = (C86124t) nmVar.f207130a.a.f202006C.mo17428b();
            eVar.f33504b = (SharedPreferences) nmVar.f207130a.a.f203126k.mo17428b();
            l lVar = (l) nmVar.f207130a.a.f202833eY.mo17428b();
            h hVar = (h) nmVar.f207130a.a.f202853es.mo17428b();
            C22871g gVar = (C22871g) nmVar.f207130a.aT.mo17428b();
        }
    }

    public final Context getContext() {
        if (super.getContext() == null && !this.f33556b) {
            return null;
        }
        m24426d();
        return this.f33555a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo17981a().mo17653jN();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f33555a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        m24426d();
        mo17982b();
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        m24426d();
        mo17982b();
    }
}
