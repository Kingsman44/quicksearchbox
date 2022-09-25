package com.google.android.apps.search.assistant.verticals.newsplayer.p10069ui;

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

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.ui.bc */
/* compiled from: PG */
class C132483bc extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f361608a;

    /* renamed from: c */
    private boolean f361609c;

    /* renamed from: d */
    private volatile C47247a f361610d;

    /* renamed from: e */
    private final Object f361611e = new Object();

    /* renamed from: f */
    private boolean f361612f = false;

    /* renamed from: a */
    private final void mo110778a() {
        if (this.f361608a == null) {
            this.f361608a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f361609c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo110768b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo110769d() {
        if (this.f361610d == null) {
            synchronized (this.f361611e) {
                if (this.f361610d == null) {
                    this.f361610d = mo110768b();
                }
            }
        }
        return this.f361610d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo110770f() {
        if (!this.f361612f) {
            this.f361612f = true;
            mo110769d().mo17653jN();
            C132495m mVar = (C132495m) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f361609c) {
            return null;
        }
        mo110778a();
        return this.f361608a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo110769d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f361608a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo110778a();
        mo110770f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo110778a();
        mo110770f();
    }
}
