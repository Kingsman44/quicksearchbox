package com.google.android.apps.search.assistant.verticals.family.custodio;

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

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.fv */
/* compiled from: PG */
class C132328fv extends C19520a implements C68288b {

    /* renamed from: a */
    private ContextWrapper f361211a;

    /* renamed from: c */
    private boolean f361212c;

    /* renamed from: d */
    private volatile C47247a f361213d;

    /* renamed from: e */
    private final Object f361214e = new Object();

    /* renamed from: f */
    private boolean f361215f = false;

    /* renamed from: a */
    private final void mo110447a() {
        if (this.f361211a == null) {
            this.f361211a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f361212c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo110448b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo110643d() {
        if (this.f361213d == null) {
            synchronized (this.f361214e) {
                if (this.f361213d == null) {
                    this.f361213d = mo110448b();
                }
            }
        }
        return this.f361213d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo110644f() {
        if (!this.f361215f) {
            this.f361215f = true;
            mo110643d().mo17653jN();
            GenericCustodioDialogFragment genericCustodioDialogFragment = (GenericCustodioDialogFragment) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f361212c) {
            return null;
        }
        mo110447a();
        return this.f361211a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo110643d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f361211a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo110447a();
        mo110644f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo110447a();
        mo110644f();
    }
}
