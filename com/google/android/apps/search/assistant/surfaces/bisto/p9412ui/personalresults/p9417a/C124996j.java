package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.personalresults.p9417a;

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

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.personalresults.a.j */
/* compiled from: PG */
class C124996j extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f344894a;

    /* renamed from: c */
    private boolean f344895c;

    /* renamed from: d */
    private volatile C47247a f344896d;

    /* renamed from: e */
    private final Object f344897e = new Object();

    /* renamed from: f */
    private boolean f344898f = false;

    /* renamed from: a */
    private final void mo106763a() {
        if (this.f344894a == null) {
            this.f344894a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f344895c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo106764b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo106769d() {
        if (this.f344896d == null) {
            synchronized (this.f344897e) {
                if (this.f344896d == null) {
                    this.f344896d = mo106764b();
                }
            }
        }
        return this.f344896d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo106770f() {
        if (!this.f344898f) {
            this.f344898f = true;
            mo106769d().mo17653jN();
            C124986b bVar = (C124986b) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f344895c) {
            return null;
        }
        mo106763a();
        return this.f344894a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo106769d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f344894a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo106763a();
        mo106770f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo106763a();
        mo106770f();
    }
}
