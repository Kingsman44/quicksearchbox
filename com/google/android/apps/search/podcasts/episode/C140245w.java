package com.google.android.apps.search.podcasts.episode;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1629c.p1630a.C19521a;
import com.google.apps.tiktok.inject.p3654a.p3655a.C47189c;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.apps.search.podcasts.episode.w */
/* compiled from: PG */
class C140245w extends C19521a implements C68288b {

    /* renamed from: b */
    private ContextWrapper f381003b;

    /* renamed from: c */
    private boolean f381004c;

    /* renamed from: d */
    private volatile C47247a f381005d;

    /* renamed from: e */
    private final Object f381006e = new Object();

    /* renamed from: f */
    private boolean f381007f = false;

    /* renamed from: a */
    private final void mo18360a() {
        if (this.f381003b == null) {
            this.f381003b = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f381004c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo115501b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo115522d() {
        if (this.f381005d == null) {
            synchronized (this.f381006e) {
                if (this.f381005d == null) {
                    this.f381005d = mo115501b();
                }
            }
        }
        return this.f381005d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo115523f() {
        if (!this.f381007f) {
            this.f381007f = true;
            mo115522d().mo17653jN();
            EpisodeActionsDialogFragment episodeActionsDialogFragment = (EpisodeActionsDialogFragment) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f381004c) {
            return null;
        }
        mo18360a();
        return this.f381003b;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo115522d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f381003b;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo18360a();
        mo115523f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo18360a();
        mo115523f();
    }
}
