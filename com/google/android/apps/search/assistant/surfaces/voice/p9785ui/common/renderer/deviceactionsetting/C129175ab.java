package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting;

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

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.ab */
/* compiled from: PG */
class C129175ab extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f354834a;

    /* renamed from: c */
    private boolean f354835c;

    /* renamed from: d */
    private volatile C47247a f354836d;

    /* renamed from: e */
    private final Object f354837e = new Object();

    /* renamed from: f */
    private boolean f354838f = false;

    /* renamed from: a */
    private final void m210856a() {
        if (this.f354834a == null) {
            this.f354834a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f354835c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C47247a mo108875d() {
        throw null;
    }

    /* renamed from: f */
    public final C47247a mo108876f() {
        if (this.f354836d == null) {
            synchronized (this.f354837e) {
                if (this.f354836d == null) {
                    this.f354836d = mo108875d();
                }
            }
        }
        return this.f354836d;
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f354835c) {
            return null;
        }
        m210856a();
        return this.f354834a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo108877j() {
        if (!this.f354838f) {
            this.f354838f = true;
            mo108876f().mo17653jN();
            C129180b bVar = (C129180b) this;
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo108876f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f354834a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        m210856a();
        mo108877j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        m210856a();
        mo108877j();
    }
}
