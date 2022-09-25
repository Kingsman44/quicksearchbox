package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting;

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

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.ac */
/* compiled from: PG */
class C129176ac extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f354839a;

    /* renamed from: c */
    private boolean f354840c;

    /* renamed from: d */
    private volatile C47247a f354841d;

    /* renamed from: e */
    private final Object f354842e = new Object();

    /* renamed from: f */
    private boolean f354843f = false;

    /* renamed from: a */
    private final void mo108905a() {
        if (this.f354839a == null) {
            this.f354839a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f354840c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo108878b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo108879d() {
        if (this.f354841d == null) {
            synchronized (this.f354842e) {
                if (this.f354841d == null) {
                    this.f354841d = mo108878b();
                }
            }
        }
        return this.f354841d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo108880f() {
        if (!this.f354843f) {
            this.f354843f = true;
            mo108879d().mo17653jN();
            C129209h hVar = (C129209h) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f354840c) {
            return null;
        }
        mo108905a();
        return this.f354839a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo108879d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f354839a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo108905a();
        mo108880f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo108905a();
        mo108880f();
    }
}
