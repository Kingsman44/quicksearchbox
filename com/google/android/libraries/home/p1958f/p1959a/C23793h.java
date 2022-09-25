package com.google.android.libraries.home.p1958f.p1959a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import androidx.preference.C3983ai;
import com.google.android.apps.gsa.assistant.settings.features.p5777z.p5778a.C73551a;
import com.google.android.apps.gsa.assistant.settings.features.p5777z.p5780c.C73555c;
import com.google.android.apps.gsa.assistant.settings.features.p5777z.p5780c.C73556f;
import com.google.android.apps.gsa.assistant.settings.features.p5777z.p5780c.C73557g;
import com.google.android.apps.gsa.assistant.settings.shared.C73794z;
import com.google.android.apps.gsa.assistant.settings.shared.h;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.binaries.satin.app.C73964bv;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.binaries.satin.app.aso;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7195y.C91183ao;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.libraries.search.p2871b.C37215b;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.libraries.home.f.a.h */
/* compiled from: PG */
public abstract class C23793h extends C3983ai implements C68288b {

    /* renamed from: e */
    private ContextWrapper f65198e;

    /* renamed from: f */
    private boolean f65199f;

    /* renamed from: g */
    private volatile C68324h f65200g;

    /* renamed from: h */
    private final Object f65201h = new Object();

    /* renamed from: i */
    private boolean f65202i = false;

    /* renamed from: n */
    private final void mo29128n() {
        if (this.f65198e == null) {
            this.f65198e = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f65199f = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: b */
    public final C68324h mo29150b() {
        if (this.f65200g == null) {
            synchronized (this.f65201h) {
                if (this.f65200g == null) {
                    this.f65200g = new C68324h(this);
                }
            }
        }
        return this.f65200g;
    }

    public final Context getContext() {
        if (super.getContext() == null && !this.f65199f) {
            return null;
        }
        mo29128n();
        return this.f65198e;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo29150b().mo17653jN();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo29151m() {
        if (!this.f65202i) {
            this.f65202i = true;
            C23782ah ahVar = (C23782ah) this;
            C74178nm nmVar = (C74178nm) mo29150b().mo17653jN();
            ahVar.f65163f = (C37215b) nmVar.f207130a.a.f202604aH.mo17428b();
            C73964bv bvVar = nmVar.f207136c;
            ahVar.f65170m = new C73555c((h) bvVar.f205604c.a.f202853es.mo17428b(), new C73551a((C86124t) bvVar.f205604c.a.f202006C.mo17428b()), (C91097g) bvVar.f205799i.mo17428b());
            aso aso = nmVar.f207130a.d;
            ahVar.f65168k = new C73794z((h) aso.f201488a.a.f202853es.mo17428b(), (C86054o) aso.f201488a.a.f202324I.mo17428b());
            C73964bv bvVar2 = nmVar.f207136c;
            ahVar.f65171n = new C73556f((h) bvVar2.f205604c.a.f202853es.mo17428b(), (l) bvVar2.f205604c.a.f202833eY.mo17428b());
            ahVar.f65169l = new C73557g((C91183ao) nmVar.f207136c.f205604c.a.f202736ch.mo17428b());
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f65198e;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo29128n();
        mo29151m();
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        mo29128n();
        mo29151m();
    }
}
