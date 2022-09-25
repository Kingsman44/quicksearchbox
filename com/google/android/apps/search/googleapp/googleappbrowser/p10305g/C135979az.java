package com.google.android.apps.search.googleapp.googleappbrowser.p10305g;

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

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.g.az */
/* compiled from: PG */
class C135979az extends C19520a implements C68288b {

    /* renamed from: a */
    private ContextWrapper f370338a;

    /* renamed from: c */
    private boolean f370339c;

    /* renamed from: d */
    private volatile C47247a f370340d;

    /* renamed from: e */
    private final Object f370341e = new Object();

    /* renamed from: f */
    private boolean f370342f = false;

    /* renamed from: a */
    private final void mo112672a() {
        if (this.f370338a == null) {
            this.f370338a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f370339c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo112660b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo112661d() {
        if (this.f370340d == null) {
            synchronized (this.f370341e) {
                if (this.f370340d == null) {
                    this.f370340d = mo112660b();
                }
            }
        }
        return this.f370340d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo112662f() {
        if (!this.f370342f) {
            this.f370342f = true;
            mo112661d().mo17653jN();
            C135996p pVar = (C135996p) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f370339c) {
            return null;
        }
        mo112672a();
        return this.f370338a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo112661d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f370338a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo112672a();
        mo112662f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo112672a();
        mo112662f();
    }
}
