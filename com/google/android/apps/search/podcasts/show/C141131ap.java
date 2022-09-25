package com.google.android.apps.search.podcasts.show;

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

/* renamed from: com.google.android.apps.search.podcasts.show.ap */
/* compiled from: PG */
class C141131ap extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f383170a;

    /* renamed from: c */
    private boolean f383171c;

    /* renamed from: d */
    private volatile C47247a f383172d;

    /* renamed from: e */
    private final Object f383173e = new Object();

    /* renamed from: f */
    private boolean f383174f = false;

    /* renamed from: a */
    private final void mo116159a() {
        if (this.f383170a == null) {
            this.f383170a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f383171c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo116160b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo116172d() {
        if (this.f383172d == null) {
            synchronized (this.f383173e) {
                if (this.f383172d == null) {
                    this.f383172d = mo116160b();
                }
            }
        }
        return this.f383172d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo116173f() {
        if (!this.f383174f) {
            this.f383174f = true;
            mo116172d().mo17653jN();
            ShowFragment showFragment = (ShowFragment) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f383171c) {
            return null;
        }
        mo116159a();
        return this.f383170a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo116172d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f383170a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo116159a();
        mo116173f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo116159a();
        mo116173f();
    }
}
