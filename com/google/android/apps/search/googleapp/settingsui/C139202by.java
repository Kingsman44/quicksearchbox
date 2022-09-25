package com.google.android.apps.search.googleapp.settingsui;

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

/* renamed from: com.google.android.apps.search.googleapp.settingsui.by */
/* compiled from: PG */
class C139202by extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f378585a;

    /* renamed from: c */
    private boolean f378586c;

    /* renamed from: d */
    private volatile C47247a f378587d;

    /* renamed from: e */
    private final Object f378588e = new Object();

    /* renamed from: f */
    private boolean f378589f = false;

    /* renamed from: a */
    private final void m226167a() {
        if (this.f378585a == null) {
            this.f378585a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f378586c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C47247a mo114821d() {
        throw null;
    }

    /* renamed from: f */
    public final C47247a mo114822f() {
        if (this.f378587d == null) {
            synchronized (this.f378588e) {
                if (this.f378587d == null) {
                    this.f378587d = mo114821d();
                }
            }
        }
        return this.f378587d;
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f378586c) {
            return null;
        }
        m226167a();
        return this.f378585a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo114823j() {
        if (!this.f378589f) {
            this.f378589f = true;
            mo114822f().mo17653jN();
            C139238k kVar = (C139238k) this;
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo114822f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f378585a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        m226167a();
        mo114823j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        m226167a();
        mo114823j();
    }
}
