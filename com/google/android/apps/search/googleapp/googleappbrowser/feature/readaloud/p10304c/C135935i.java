package com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.p10304c;

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

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.c.i */
/* compiled from: PG */
class C135935i extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f370229a;

    /* renamed from: c */
    private boolean f370230c;

    /* renamed from: d */
    private volatile C47247a f370231d;

    /* renamed from: e */
    private final Object f370232e = new Object();

    /* renamed from: f */
    private boolean f370233f = false;

    /* renamed from: a */
    private final void mo112626a() {
        if (this.f370229a == null) {
            this.f370229a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f370230c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo112627b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo112632d() {
        if (this.f370231d == null) {
            synchronized (this.f370232e) {
                if (this.f370231d == null) {
                    this.f370231d = mo112627b();
                }
            }
        }
        return this.f370231d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo112633f() {
        if (!this.f370233f) {
            this.f370233f = true;
            mo112632d().mo17653jN();
            C135926b bVar = (C135926b) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f370230c) {
            return null;
        }
        mo112626a();
        return this.f370229a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo112632d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f370229a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo112626a();
        mo112633f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo112626a();
        mo112633f();
    }
}
