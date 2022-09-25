package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.watches;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1629c.C19520a;
import com.google.apps.tiktok.inject.p3654a.p3655a.C47189c;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.ar */
/* compiled from: PG */
class C124945ar extends C19520a implements C68288b {

    /* renamed from: a */
    private ContextWrapper f344742a;

    /* renamed from: c */
    private boolean f344743c;

    /* renamed from: d */
    private volatile C47247a f344744d;

    /* renamed from: e */
    private final Object f344745e = new Object();

    /* renamed from: f */
    private boolean f344746f = false;

    /* renamed from: a */
    private final void mo106721a() {
        if (this.f344742a == null) {
            this.f344742a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f344743c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo106722b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo106739d() {
        if (this.f344744d == null) {
            synchronized (this.f344745e) {
                if (this.f344744d == null) {
                    this.f344744d = mo106722b();
                }
            }
        }
        return this.f344744d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo106740f() {
        if (!this.f344746f) {
            this.f344746f = true;
            mo106739d().mo17653jN();
            AccountMismatchFragment accountMismatchFragment = (AccountMismatchFragment) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f344743c) {
            return null;
        }
        mo106721a();
        return this.f344742a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo106739d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f344742a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo106721a();
        mo106740f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo106721a();
        mo106740f();
    }
}
