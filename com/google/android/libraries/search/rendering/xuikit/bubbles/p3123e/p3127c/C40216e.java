package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3127c;

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

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.c.e */
/* compiled from: PG */
class C40216e extends C19520a implements C68288b {

    /* renamed from: a */
    private ContextWrapper f105666a;

    /* renamed from: c */
    private boolean f105667c;

    /* renamed from: d */
    private volatile C47247a f105668d;

    /* renamed from: e */
    private final Object f105669e = new Object();

    /* renamed from: f */
    private boolean f105670f = false;

    /* renamed from: a */
    private final void mo42323a() {
        if (this.f105666a == null) {
            this.f105666a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f105667c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo42324b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo42326d() {
        if (this.f105668d == null) {
            synchronized (this.f105669e) {
                if (this.f105668d == null) {
                    this.f105668d = mo42324b();
                }
            }
        }
        return this.f105668d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo42327f() {
        if (!this.f105670f) {
            this.f105670f = true;
            mo42326d().mo17653jN();
            C40213b bVar = (C40213b) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f105667c) {
            return null;
        }
        mo42323a();
        return this.f105666a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo42326d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f105666a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo42323a();
        mo42327f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo42323a();
        mo42327f();
    }
}
