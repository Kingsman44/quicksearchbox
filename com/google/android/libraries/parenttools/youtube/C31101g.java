package com.google.android.libraries.parenttools.youtube;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.gms.auth.C142915o;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.libraries.parenttools.youtube.g */
/* compiled from: PG */
class C31101g extends Fragment implements C68288b {

    /* renamed from: a */
    private ContextWrapper f83788a;

    /* renamed from: b */
    private boolean f83789b;

    /* renamed from: c */
    private volatile C68324h f83790c;

    /* renamed from: d */
    private final Object f83791d = new Object();

    /* renamed from: e */
    private boolean f83792e = false;

    /* renamed from: d */
    private final void mo36841d() {
        if (this.f83788a == null) {
            this.f83788a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f83789b = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C68324h mo36852a() {
        if (this.f83790c == null) {
            synchronized (this.f83791d) {
                if (this.f83790c == null) {
                    this.f83790c = new C68324h(this);
                }
            }
        }
        return this.f83790c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo36853b() {
        if (!this.f83792e) {
            this.f83792e = true;
            ((C31093aa) this).f83764g = (C142915o) ((C74178nm) mo36852a().mo17653jN()).f207130a.aH.mo17428b();
        }
    }

    public final Context getContext() {
        if (super.getContext() == null && !this.f83789b) {
            return null;
        }
        mo36841d();
        return this.f83788a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo36852a().mo17653jN();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f83788a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo36841d();
        mo36853b();
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        mo36841d();
        mo36853b();
    }
}
