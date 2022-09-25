package com.google.android.apps.gsa.assistant.settings.features.p553aj;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.android.apps.gsa.assistant.settings.shared.o;
import com.google.android.apps.gsa.assistant.settings.shared.p5800ui.C73784g;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.smartspace.C92122r;
import com.google.android.libraries.gsa.p1876k.C22871g;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.aj.a */
/* compiled from: PG */
class C10096a extends Fragment implements C68288b {

    /* renamed from: a */
    private ContextWrapper f34378a;

    /* renamed from: b */
    private boolean f34379b;

    /* renamed from: c */
    private volatile C68324h f34380c;

    /* renamed from: d */
    private final Object f34381d = new Object();

    /* renamed from: e */
    private boolean f34382e = false;

    /* renamed from: d */
    private final void mo18307d() {
        if (this.f34378a == null) {
            this.f34378a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f34379b = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C68324h mo18239a() {
        if (this.f34380c == null) {
            synchronized (this.f34381d) {
                if (this.f34380c == null) {
                    this.f34380c = new C68324h(this);
                }
            }
        }
        return this.f34380c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo18240b() {
        if (!this.f34382e) {
            this.f34382e = true;
            C10166y yVar = (C10166y) this;
            C74178nm nmVar = (C74178nm) mo18239a().mo17653jN();
            yVar.f34553a = (C86124t) nmVar.f207130a.a.f202006C.mo17428b();
            yVar.f34554b = nmVar.mo70071m();
            nmVar.mo70046ab();
            yVar.f34555c = (o) nmVar.f207130a.a.f203120ju.mo17428b();
            yVar.f34556d = nmVar.f207136c.f205597bt;
            C22871g gVar = (C22871g) nmVar.f207130a.aT.mo17428b();
            yVar.f34557e = (C89656k) nmVar.f207130a.it.mo17428b();
            yVar.f34558f = (C92122r) nmVar.f207130a.a.f202712cJ.mo17428b();
            yVar.f34559g = (C83794j) nmVar.f207130a.a.f202815eG.mo17428b();
            yVar.f34560h = (C73784g) nmVar.f207136c.f205574bW.mo17428b();
        }
    }

    public final Context getContext() {
        if (super.getContext() == null && !this.f34379b) {
            return null;
        }
        mo18307d();
        return this.f34378a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo18239a().mo17653jN();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f34378a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo18307d();
        mo18240b();
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        mo18307d();
        mo18240b();
    }
}
