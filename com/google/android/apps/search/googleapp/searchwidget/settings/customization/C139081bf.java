package com.google.android.apps.search.googleapp.searchwidget.settings.customization;

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

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.settings.customization.bf */
/* compiled from: PG */
class C139081bf extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f378256a;

    /* renamed from: c */
    private boolean f378257c;

    /* renamed from: d */
    private volatile C47247a f378258d;

    /* renamed from: e */
    private final Object f378259e = new Object();

    /* renamed from: f */
    private boolean f378260f = false;

    /* renamed from: a */
    private final void mo114726a() {
        if (this.f378256a == null) {
            this.f378256a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f378257c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo114697b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo114698d() {
        if (this.f378258d == null) {
            synchronized (this.f378259e) {
                if (this.f378258d == null) {
                    this.f378258d = mo114697b();
                }
            }
        }
        return this.f378258d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo114699f() {
        if (!this.f378260f) {
            this.f378260f = true;
            mo114698d().mo17653jN();
            C139107e eVar = (C139107e) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f378257c) {
            return null;
        }
        mo114726a();
        return this.f378256a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo114698d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f378256a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo114726a();
        mo114699f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo114726a();
        mo114699f();
    }
}
