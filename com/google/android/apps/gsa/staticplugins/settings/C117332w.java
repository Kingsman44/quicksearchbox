package com.google.android.apps.gsa.staticplugins.settings;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import androidx.preference.C3983ai;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.nga.api.C74712bm;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.p7184t.C91090a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.common.base.C58833ax;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.apps.gsa.staticplugins.settings.w */
/* compiled from: PG */
abstract class C117332w extends C3983ai implements C68288b {

    /* renamed from: e */
    private ContextWrapper f325696e;

    /* renamed from: f */
    private boolean f325697f;

    /* renamed from: g */
    private volatile C68324h f325698g;

    /* renamed from: h */
    private final Object f325699h = new Object();

    /* renamed from: i */
    private boolean f325700i = false;

    /* renamed from: n */
    private final void m194979n() {
        if (this.f325696e == null) {
            this.f325696e = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f325697f = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: b */
    public final C68324h mo103263b() {
        if (this.f325698g == null) {
            synchronized (this.f325699h) {
                if (this.f325698g == null) {
                    this.f325698g = new C68324h(this);
                }
            }
        }
        return this.f325698g;
    }

    public final Context getContext() {
        if (super.getContext() == null && !this.f325697f) {
            return null;
        }
        m194979n();
        return this.f325696e;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo103263b().mo17653jN();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo103264m() {
        if (!this.f325700i) {
            this.f325700i = true;
            RootSettingsFragment rootSettingsFragment = (RootSettingsFragment) this;
            C74178nm nmVar = (C74178nm) mo103263b().mo17653jN();
            rootSettingsFragment.f325605f = (C91090a) nmVar.f207136c.f205763f.mo17428b();
            rootSettingsFragment.f325616q = (C117320l) nmVar.f207130a.b.f200940t.mo17428b();
            rootSettingsFragment.f325615p = (C117327r) nmVar.f207130a.b.f200993u.mo17428b();
            rootSettingsFragment.f325606g = (C28310af) nmVar.f207130a.a.f202878fQ.mo17428b();
            rootSettingsFragment.f325607h = (C28443m) nmVar.f207130a.a.f202879fR.mo17428b();
            rootSettingsFragment.f325608i = (SharedPreferences) nmVar.f207130a.a.f203126k.mo17428b();
            rootSettingsFragment.f325609j = (C58833ax) nmVar.f207130a.a.f202980hM.mo17428b();
            rootSettingsFragment.f325610k = C58833ax.m90834k((C74712bm) nmVar.f207130a.d.f201752ez.mo17428b());
            rootSettingsFragment.f325611l = ((Boolean) nmVar.f207130a.ce.mo17428b()).booleanValue();
            rootSettingsFragment.f325612m = (C22871g) nmVar.f207130a.aT.mo17428b();
            rootSettingsFragment.f325613n = (C86124t) nmVar.f207130a.a.f202006C.mo17428b();
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f325696e;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        m194979n();
        mo103264m();
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        m194979n();
        mo103264m();
    }
}
