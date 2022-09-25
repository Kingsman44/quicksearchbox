package com.google.android.apps.search.podcasts;

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

/* renamed from: com.google.android.apps.search.podcasts.aa */
/* compiled from: PG */
class C139963aa extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f380445a;

    /* renamed from: c */
    private boolean f380446c;

    /* renamed from: d */
    private volatile C47247a f380447d;

    /* renamed from: e */
    private final Object f380448e = new Object();

    /* renamed from: f */
    private boolean f380449f = false;

    /* renamed from: a */
    private final void mo115810a() {
        if (this.f380445a == null) {
            this.f380445a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f380446c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo115365b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo115366d() {
        if (this.f380447d == null) {
            synchronized (this.f380448e) {
                if (this.f380447d == null) {
                    this.f380447d = mo115365b();
                }
            }
        }
        return this.f380447d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo115367f() {
        if (!this.f380449f) {
            this.f380449f = true;
            mo115366d().mo17653jN();
            C140639m mVar = (C140639m) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f380446c) {
            return null;
        }
        mo115810a();
        return this.f380445a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo115366d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f380445a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo115810a();
        mo115367f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo115810a();
        mo115367f();
    }
}
