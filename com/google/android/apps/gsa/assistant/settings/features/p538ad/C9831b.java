package com.google.android.apps.gsa.assistant.settings.features.p538ad;

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

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ad.b */
/* compiled from: PG */
class C9831b extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f33817a;

    /* renamed from: c */
    private boolean f33818c;

    /* renamed from: d */
    private volatile C68324h f33819d;

    /* renamed from: e */
    private final Object f33820e = new Object();

    /* renamed from: f */
    private boolean f33821f = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f33817a == null) {
            this.f33817a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f33818c = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C68324h mo18060a() {
        if (this.f33819d == null) {
            synchronized (this.f33820e) {
                if (this.f33819d == null) {
                    this.f33819d = mo18061b();
                }
            }
        }
        return this.f33819d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C68324h mo18061b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo18062d() {
        if (!this.f33821f) {
            this.f33821f = true;
            mo18060a().mo17653jN();
            C9841j jVar = (C9841j) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f33818c) {
            return null;
        }
        mo17857e();
        return this.f33817a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo18060a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f33817a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo18062d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo18062d();
    }
}
