package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.android.apps.gsa.assistant.settings.shared.h;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8419b.p8420a.C110045b;
import com.google.common.base.C58833ax;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.v */
/* compiled from: PG */
class C9712v extends Fragment implements C68288b {

    /* renamed from: a */
    private ContextWrapper f33550a;

    /* renamed from: b */
    private boolean f33551b;

    /* renamed from: c */
    private volatile C68324h f33552c;

    /* renamed from: d */
    private final Object f33553d = new Object();

    /* renamed from: e */
    private boolean f33554e = false;

    /* renamed from: d */
    private final void m24422d() {
        if (this.f33550a == null) {
            this.f33550a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f33551b = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C68324h mo17979a() {
        if (this.f33552c == null) {
            synchronized (this.f33553d) {
                if (this.f33552c == null) {
                    this.f33552c = new C68324h(this);
                }
            }
        }
        return this.f33552c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo17980b() {
        if (!this.f33554e) {
            this.f33554e = true;
            C9672b bVar = (C9672b) this;
            C74178nm nmVar = (C74178nm) mo17979a().mo17653jN();
            bVar.f33449a = C58833ax.m90834k((C110045b) nmVar.f207130a.b.f200104dL.mo17428b());
            bVar.f33450b = (h) nmVar.f207130a.a.f202853es.mo17428b();
        }
    }

    public final Context getContext() {
        if (super.getContext() == null && !this.f33551b) {
            return null;
        }
        m24422d();
        return this.f33550a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo17979a().mo17653jN();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f33550a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        m24422d();
        mo17980b();
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        m24422d();
        mo17980b();
    }
}
