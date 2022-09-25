package com.google.android.apps.gsa.assistant.settings.features.appactions;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.apps.tiktok.inject.baseclasses.C47210f;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.cf */
/* compiled from: PG */
class C10287cf extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f34860a;

    /* renamed from: c */
    private boolean f34861c;

    /* renamed from: d */
    private volatile C68324h f34862d;

    /* renamed from: e */
    private final Object f34863e = new Object();

    /* renamed from: f */
    private boolean f34864f = false;

    /* renamed from: a */
    private final void mo18368a() {
        if (this.f34860a == null) {
            this.f34860a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f34861c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C68324h mo18369b() {
        throw null;
    }

    /* renamed from: d */
    public final C68324h mo18383d() {
        if (this.f34862d == null) {
            synchronized (this.f34863e) {
                if (this.f34862d == null) {
                    this.f34862d = mo18369b();
                }
            }
        }
        return this.f34862d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo18384f() {
        if (!this.f34864f) {
            this.f34864f = true;
            mo18383d().mo17653jN();
            C10238bn bnVar = (C10238bn) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f34861c) {
            return null;
        }
        mo18368a();
        return this.f34860a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo18383d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f34860a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo18368a();
        mo18384f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo18368a();
        mo18384f();
    }
}
