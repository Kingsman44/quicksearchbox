package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

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

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.bx */
/* compiled from: PG */
class C124853bx extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f344455a;

    /* renamed from: c */
    private boolean f344456c;

    /* renamed from: d */
    private volatile C47247a f344457d;

    /* renamed from: e */
    private final Object f344458e = new Object();

    /* renamed from: f */
    private boolean f344459f = false;

    /* renamed from: a */
    private final void mo106625a() {
        if (this.f344455a == null) {
            this.f344455a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f344456c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo106626b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo106676d() {
        if (this.f344457d == null) {
            synchronized (this.f344458e) {
                if (this.f344457d == null) {
                    this.f344457d = mo106626b();
                }
            }
        }
        return this.f344457d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo106677f() {
        if (!this.f344459f) {
            this.f344459f = true;
            mo106676d().mo17653jN();
            EnableAssistantFragment enableAssistantFragment = (EnableAssistantFragment) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f344456c) {
            return null;
        }
        mo106625a();
        return this.f344455a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo106676d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f344455a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo106625a();
        mo106677f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo106625a();
        mo106677f();
    }
}
