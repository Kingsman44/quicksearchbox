package com.google.android.apps.search.transcription.p10679ui;

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

/* renamed from: com.google.android.apps.search.transcription.ui.c */
/* compiled from: PG */
class C141936c extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f385147a;

    /* renamed from: c */
    private boolean f385148c;

    /* renamed from: d */
    private volatile C68324h f385149d;

    /* renamed from: e */
    private final Object f385150e = new Object();

    /* renamed from: f */
    private boolean f385151f = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f385147a == null) {
            this.f385147a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f385148c = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C68324h mo116905a() {
        if (this.f385149d == null) {
            synchronized (this.f385150e) {
                if (this.f385149d == null) {
                    this.f385149d = mo116906b();
                }
            }
        }
        return this.f385149d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C68324h mo116906b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo116907d() {
        if (!this.f385151f) {
            this.f385151f = true;
            mo116905a().mo17653jN();
            C141947n nVar = (C141947n) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f385148c) {
            return null;
        }
        mo17857e();
        return this.f385147a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo116905a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f385147a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo116907d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo116907d();
    }
}
