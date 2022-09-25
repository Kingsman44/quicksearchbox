package com.google.android.apps.search.podcasts.searchresults;

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

/* renamed from: com.google.android.apps.search.podcasts.searchresults.j */
/* compiled from: PG */
class C141046j extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f382910a;

    /* renamed from: c */
    private boolean f382911c;

    /* renamed from: d */
    private volatile C47247a f382912d;

    /* renamed from: e */
    private final Object f382913e = new Object();

    /* renamed from: f */
    private boolean f382914f = false;

    /* renamed from: a */
    private final void mo116086a() {
        if (this.f382910a == null) {
            this.f382910a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f382911c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo116087b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo116095d() {
        if (this.f382912d == null) {
            synchronized (this.f382913e) {
                if (this.f382912d == null) {
                    this.f382912d = mo116087b();
                }
            }
        }
        return this.f382912d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo116096f() {
        if (!this.f382914f) {
            this.f382914f = true;
            mo116095d().mo17653jN();
            SearchResultsFragment searchResultsFragment = (SearchResultsFragment) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f382911c) {
            return null;
        }
        mo116086a();
        return this.f382910a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo116095d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f382910a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo116086a();
        mo116096f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo116086a();
        mo116096f();
    }
}
