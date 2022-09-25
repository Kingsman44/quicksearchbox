package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.android.apps.gsa.assistant.shared.C73844bk;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.ac */
/* compiled from: PG */
class C9648ac extends Fragment implements C68288b {

    /* renamed from: a */
    private ContextWrapper f33378a;

    /* renamed from: b */
    private boolean f33379b;

    /* renamed from: c */
    private volatile C68324h f33380c;

    /* renamed from: d */
    private final Object f33381d = new Object();

    /* renamed from: e */
    private boolean f33382e = false;

    /* renamed from: d */
    private final void m24375d() {
        if (this.f33378a == null) {
            this.f33378a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f33379b = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C68324h mo17923a() {
        if (this.f33380c == null) {
            synchronized (this.f33381d) {
                if (this.f33380c == null) {
                    this.f33380c = new C68324h(this);
                }
            }
        }
        return this.f33380c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo17924b() {
        if (!this.f33382e) {
            this.f33382e = true;
            C9670ay ayVar = (C9670ay) this;
            C74178nm nmVar = (C74178nm) mo17923a().mo17653jN();
            ayVar.f33441b = nmVar.f207136c.f205597bt;
            ayVar.f33442c = C58833ax.m90834k((C73844bk) nmVar.f207130a.d.f201751ey.mo17428b());
            ayVar.f33443d = (C22871g) nmVar.f207130a.aT.mo17428b();
            ayVar.f33444e = (C86124t) nmVar.f207130a.a.f202006C.mo17428b();
        }
    }

    public final Context getContext() {
        if (super.getContext() == null && !this.f33379b) {
            return null;
        }
        m24375d();
        return this.f33378a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo17923a().mo17653jN();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f33378a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        m24375d();
        mo17924b();
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        m24375d();
        mo17924b();
    }
}
