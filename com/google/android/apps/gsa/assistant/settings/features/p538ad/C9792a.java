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

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ad.a */
/* compiled from: PG */
class C9792a extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f33772a;

    /* renamed from: c */
    private boolean f33773c;

    /* renamed from: d */
    private volatile C68324h f33774d;

    /* renamed from: e */
    private final Object f33775e = new Object();

    /* renamed from: f */
    private boolean f33776f = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f33772a == null) {
            this.f33772a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f33773c = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C68324h mo18038a() {
        if (this.f33774d == null) {
            synchronized (this.f33775e) {
                if (this.f33774d == null) {
                    this.f33774d = mo18039b();
                }
            }
        }
        return this.f33774d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C68324h mo18039b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo18040d() {
        if (!this.f33776f) {
            this.f33776f = true;
            mo18038a().mo17653jN();
            C9833d dVar = (C9833d) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f33773c) {
            return null;
        }
        mo17857e();
        return this.f33772a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo18038a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f33772a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo18040d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo18040d();
    }
}
