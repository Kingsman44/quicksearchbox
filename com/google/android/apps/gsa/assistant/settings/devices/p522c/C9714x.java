package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.android.apps.gsa.binaries.satin.app.C73964bv;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8419b.p8420a.C110045b;
import com.google.common.base.C58833ax;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.x */
/* compiled from: PG */
class C9714x extends Fragment implements C68288b {

    /* renamed from: a */
    private ContextWrapper f33560a;

    /* renamed from: b */
    private boolean f33561b;

    /* renamed from: c */
    private volatile C68324h f33562c;

    /* renamed from: d */
    private final Object f33563d = new Object();

    /* renamed from: e */
    private boolean f33564e = false;

    /* renamed from: d */
    private final void m24430d() {
        if (this.f33560a == null) {
            this.f33560a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f33561b = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C68324h mo17983a() {
        if (this.f33562c == null) {
            synchronized (this.f33563d) {
                if (this.f33562c == null) {
                    this.f33562c = new C68324h(this);
                }
            }
        }
        return this.f33562c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo17984b() {
        if (!this.f33564e) {
            this.f33564e = true;
            C9697g gVar = (C9697g) this;
            C74178nm nmVar = (C74178nm) mo17983a().mo17653jN();
            C73964bv bvVar = nmVar.f207136c;
            gVar.f33506a = bvVar.f205564bM;
            gVar.f33507b = bvVar.f205565bN;
            gVar.f33508c = bvVar.f205566bO;
            gVar.f33509d = bvVar.f205567bP;
            gVar.f33510e = bvVar.f205568bQ;
            gVar.f33511f = bvVar.f205569bR;
            gVar.f33512g = bvVar.f205570bS;
            gVar.f33513h = bvVar.f205571bT;
            gVar.f33514i = (C86124t) nmVar.f207130a.a.f202006C.mo17428b();
            gVar.f33515j = C58833ax.m90834k((C110045b) nmVar.f207130a.b.f200104dL.mo17428b());
            gVar.f33516k = (C9650ae) nmVar.f207136c.f205572bU.mo17428b();
        }
    }

    public final Context getContext() {
        if (super.getContext() == null && !this.f33561b) {
            return null;
        }
        m24430d();
        return this.f33560a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo17983a().mo17653jN();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f33560a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        m24430d();
        mo17984b();
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        m24430d();
        mo17984b();
    }
}
