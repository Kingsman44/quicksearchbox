package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.binaries.satin.app.aqy;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.p7825dm.p7832g.C99788b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;
import dagger.p5294a.C68219e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.x */
/* compiled from: PG */
class C102193x extends Fragment implements C68288b {

    /* renamed from: a */
    private ContextWrapper f285098a;

    /* renamed from: b */
    private boolean f285099b;

    /* renamed from: c */
    private volatile C68324h f285100c;

    /* renamed from: d */
    private final Object f285101d = new Object();

    /* renamed from: e */
    private boolean f285102e = false;

    /* renamed from: a */
    private final void mo92348a() {
        if (this.f285098a == null) {
            this.f285098a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f285099b = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: b */
    public final C68324h mo92945b() {
        if (this.f285100c == null) {
            synchronized (this.f285101d) {
                if (this.f285100c == null) {
                    this.f285100c = new C68324h(this);
                }
            }
        }
        return this.f285100c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo92946d() {
        if (!this.f285102e) {
            this.f285102e = true;
            C102166bj bjVar = (C102166bj) this;
            C74178nm nmVar = (C74178nm) mo92945b().mo17653jN();
            bjVar.f285002b = C68219e.m98518a(nmVar.f207130a.bb);
            bjVar.f285003c = (C86124t) nmVar.f207130a.a.f202006C.mo17428b();
            bjVar.f285004d = C68219e.m98518a(nmVar.f207130a.a.f202586Q);
            aqy aqy = nmVar.f207130a;
            bjVar.f285010j = new C99788b(aqy.d.f201705eE);
            bjVar.f285005e = (C22871g) aqy.aT.mo17428b();
            bjVar.f285006f = (C86054o) nmVar.f207130a.a.f202324I.mo17428b();
        }
    }

    public final Context getContext() {
        if (super.getContext() == null && !this.f285099b) {
            return null;
        }
        mo92348a();
        return this.f285098a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo92945b().mo17653jN();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f285098a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo92348a();
        mo92946d();
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        mo92348a();
        mo92946d();
    }
}
