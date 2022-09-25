package com.google.android.apps.gsa.staticplugins.opa.ambient.activity;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.smartspace.C92122r;
import com.google.android.apps.gsa.smartspace.C92125t;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.p8247b.C106744d;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.p8248c.C106748c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.p8248c.C106749d;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.p8251f.C106770g;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8428d.C110093d;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8415a.p8417b.C110016c;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60888db;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.activity.aa */
/* compiled from: PG */
class C106400aa extends Fragment implements C68288b {

    /* renamed from: a */
    private ContextWrapper f296797a;

    /* renamed from: b */
    private boolean f296798b;

    /* renamed from: c */
    private volatile C68324h f296799c;

    /* renamed from: d */
    private final Object f296800d = new Object();

    /* renamed from: e */
    private boolean f296801e = false;

    /* renamed from: d */
    private final void m177200d() {
        if (this.f296797a == null) {
            this.f296797a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f296798b = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C68324h mo95508a() {
        if (this.f296799c == null) {
            synchronized (this.f296800d) {
                if (this.f296799c == null) {
                    this.f296799c = new C68324h(this);
                }
            }
        }
        return this.f296799c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo95509b() {
        if (!this.f296801e) {
            this.f296801e = true;
            C106410h hVar = (C106410h) this;
            C74178nm nmVar = (C74178nm) mo95508a().mo17653jN();
            hVar.f296817b = (Activity) nmVar.f207136c.f205710e.mo17428b();
            C90476a aVar = (C90476a) nmVar.f207130a.r.mo17428b();
            C86124t tVar = (C86124t) nmVar.f207130a.a.f202006C.mo17428b();
            hVar.f296818c = new C110093d((Context) nmVar.f207130a.g.mo17428b(), (Activity) nmVar.f207136c.f205710e.mo17428b(), (C86124t) nmVar.f207130a.a.f202006C.mo17428b(), (C58833ax) nmVar.f207130a.a.f202813eE.mo17428b(), (C110016c) nmVar.f207130a.ib.mo17428b());
            hVar.f296819d = (C92125t) nmVar.f207130a.a.f202834eZ.mo17428b();
            bm bmVar = (bm) nmVar.f207130a.a.f202218G.mo17428b();
            hVar.f296820e = (C84516aa) nmVar.f207130a.cK.mo17428b();
            hVar.f296821f = (C60888db) nmVar.f207130a.hV.mo17428b();
            hVar.f296822g = C58495hd.m89902p(22, new C106744d(nmVar.mo70084z()), 15, new C106749d(new C106748c(nmVar.f207130a.hF, nmVar.f207123T, nmVar.f207124U)), 21, nmVar.mo70018A());
            hVar.f296823h = (C90021c) nmVar.f207130a.a.f202006C.mo17428b();
            hVar.f296824i = (C106770g) nmVar.f207125V.mo17428b();
            hVar.f296825j = nmVar.f207136c.f205597bt;
            hVar.f296826k = (C92122r) nmVar.f207130a.a.f202712cJ.mo17428b();
        }
    }

    public final Context getContext() {
        if (super.getContext() == null && !this.f296798b) {
            return null;
        }
        m177200d();
        return this.f296797a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo95508a().mo17653jN();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f296797a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        m177200d();
        mo95509b();
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        m177200d();
        mo95509b();
    }
}
