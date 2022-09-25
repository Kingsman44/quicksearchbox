package com.google.android.apps.search.googleapp.customtabs.features.buttons.help;

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

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.buttons.help.k */
/* compiled from: PG */
class C133838k extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f364541a;

    /* renamed from: c */
    private boolean f364542c;

    /* renamed from: d */
    private volatile C47247a f364543d;

    /* renamed from: e */
    private final Object f364544e = new Object();

    /* renamed from: f */
    private boolean f364545f = false;

    /* renamed from: a */
    private final void mo111415a() {
        if (this.f364541a == null) {
            this.f364541a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f364542c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo111416b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo111417d() {
        if (this.f364543d == null) {
            synchronized (this.f364544e) {
                if (this.f364543d == null) {
                    this.f364543d = mo111416b();
                }
            }
        }
        return this.f364543d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo111418f() {
        if (!this.f364545f) {
            this.f364545f = true;
            mo111417d().mo17653jN();
            C133833f fVar = (C133833f) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f364542c) {
            return null;
        }
        mo111415a();
        return this.f364541a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo111417d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f364541a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo111415a();
        mo111418f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo111415a();
        mo111418f();
    }
}
