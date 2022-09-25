package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.watches;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.apps.tiktok.inject.baseclasses.C47210f;
import com.google.apps.tiktok.inject.p3654a.p3655a.C47189c;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.au */
/* compiled from: PG */
class C124948au extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f344757a;

    /* renamed from: c */
    private boolean f344758c;

    /* renamed from: d */
    private volatile C47247a f344759d;

    /* renamed from: e */
    private final Object f344760e = new Object();

    /* renamed from: f */
    private boolean f344761f = false;

    /* renamed from: a */
    private final void mo106727a() {
        if (this.f344757a == null) {
            this.f344757a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f344758c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo106728b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo106745d() {
        if (this.f344759d == null) {
            synchronized (this.f344760e) {
                if (this.f344759d == null) {
                    this.f344759d = mo106728b();
                }
            }
        }
        return this.f344759d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo106746f() {
        if (!this.f344761f) {
            this.f344761f = true;
            mo106745d().mo17653jN();
            GacsDataLayerInitFragment gacsDataLayerInitFragment = (GacsDataLayerInitFragment) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f344758c) {
            return null;
        }
        mo106727a();
        return this.f344757a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo106745d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f344757a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo106727a();
        mo106746f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo106727a();
        mo106746f();
    }
}
