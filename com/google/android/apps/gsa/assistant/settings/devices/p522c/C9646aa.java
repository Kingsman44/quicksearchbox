package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.aa */
/* compiled from: PG */
class C9646aa extends Fragment implements C68288b {

    /* renamed from: a */
    private ContextWrapper f33368a;

    /* renamed from: b */
    private boolean f33369b;

    /* renamed from: c */
    private volatile C68324h f33370c;

    /* renamed from: d */
    private final Object f33371d = new Object();

    /* renamed from: e */
    private boolean f33372e = false;

    /* renamed from: d */
    private final void m24367d() {
        if (this.f33368a == null) {
            this.f33368a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f33369b = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C68324h mo17919a() {
        if (this.f33370c == null) {
            synchronized (this.f33371d) {
                if (this.f33370c == null) {
                    this.f33370c = new C68324h(this);
                }
            }
        }
        return this.f33370c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo17920b() {
        if (!this.f33372e) {
            this.f33372e = true;
            C9652ag agVar = (C9652ag) this;
            C74178nm nmVar = (C74178nm) mo17919a().mo17653jN();
            agVar.f33390a = (bm) nmVar.f207130a.a.f202218G.mo17428b();
            agVar.f33391b = (C9650ae) nmVar.f207136c.f205572bU.mo17428b();
        }
    }

    public final Context getContext() {
        if (super.getContext() == null && !this.f33369b) {
            return null;
        }
        m24367d();
        return this.f33368a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo17919a().mo17653jN();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f33368a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        m24367d();
        mo17920b();
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        m24367d();
        mo17920b();
    }
}
