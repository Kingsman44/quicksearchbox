package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.libraries.gsa.p1876k.C22871g;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;
import dagger.p5294a.C68219e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.ad */
/* compiled from: PG */
class C9649ad extends Fragment implements C68288b {

    /* renamed from: a */
    private ContextWrapper f33383a;

    /* renamed from: b */
    private boolean f33384b;

    /* renamed from: c */
    private volatile C68324h f33385c;

    /* renamed from: d */
    private final Object f33386d = new Object();

    /* renamed from: e */
    private boolean f33387e = false;

    /* renamed from: d */
    private final void m24379d() {
        if (this.f33383a == null) {
            this.f33383a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f33384b = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C68324h mo17925a() {
        if (this.f33385c == null) {
            synchronized (this.f33386d) {
                if (this.f33385c == null) {
                    this.f33385c = new C68324h(this);
                }
            }
        }
        return this.f33385c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo17926b() {
        if (!this.f33387e) {
            this.f33387e = true;
            C9692bg bgVar = (C9692bg) this;
            C74178nm nmVar = (C74178nm) mo17925a().mo17653jN();
            bgVar.f33496a = (SharedPreferences) nmVar.f207130a.a.f203126k.mo17428b();
            bgVar.f33497b = nmVar.mo70061c();
            C86124t tVar = (C86124t) nmVar.f207130a.a.f202006C.mo17428b();
            bgVar.f33498c = (C89037bh) nmVar.f207130a.a.f202730cb.mo17428b();
            bgVar.f33499d = (C22871g) nmVar.f207130a.aT.mo17428b();
            C68219e.m98518a(nmVar.f207130a.a.f202972hE);
            bgVar.f33500e = nmVar.mo70021D();
        }
    }

    public final Context getContext() {
        if (super.getContext() == null && !this.f33384b) {
            return null;
        }
        m24379d();
        return this.f33383a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo17925a().mo17653jN();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f33383a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        m24379d();
        mo17926b();
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        m24379d();
        mo17926b();
    }
}
