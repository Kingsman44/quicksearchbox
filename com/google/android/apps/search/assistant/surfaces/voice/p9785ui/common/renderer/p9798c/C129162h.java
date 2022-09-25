package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9798c;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.apps.tiktok.inject.p3654a.p3655a.C47189c;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.c.h */
/* compiled from: PG */
class C129162h extends Fragment implements C68288b {

    /* renamed from: a */
    private ContextWrapper f354806a;

    /* renamed from: b */
    private boolean f354807b;

    /* renamed from: c */
    private volatile C47247a f354808c;

    /* renamed from: d */
    private final Object f354809d = new Object();

    /* renamed from: e */
    private boolean f354810e = false;

    /* renamed from: a */
    private final void mo108866a() {
        if (this.f354806a == null) {
            this.f354806a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f354807b = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo108867b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo108869d() {
        if (this.f354808c == null) {
            synchronized (this.f354809d) {
                if (this.f354808c == null) {
                    this.f354808c = mo108867b();
                }
            }
        }
        return this.f354808c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo108870f() {
        if (!this.f354810e) {
            this.f354810e = true;
            mo108869d().mo17653jN();
            C129155b bVar = (C129155b) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f354807b) {
            return null;
        }
        mo108866a();
        return this.f354806a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo108869d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f354806a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo108866a();
        mo108870f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo108866a();
        mo108870f();
    }
}
