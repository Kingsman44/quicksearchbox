package com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a;

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

/* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.a.ae */
/* compiled from: PG */
class C36708ae extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f95627a;

    /* renamed from: c */
    private boolean f95628c;

    /* renamed from: d */
    private volatile C47247a f95629d;

    /* renamed from: e */
    private final Object f95630e = new Object();

    /* renamed from: f */
    private boolean f95631f = false;

    /* renamed from: a */
    private final void mo40355a() {
        if (this.f95627a == null) {
            this.f95627a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f95628c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo40339b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo40340d() {
        if (this.f95629d == null) {
            synchronized (this.f95630e) {
                if (this.f95629d == null) {
                    this.f95629d = mo40339b();
                }
            }
        }
        return this.f95629d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo40341f() {
        if (!this.f95631f) {
            this.f95631f = true;
            mo40340d().mo17653jN();
            C36725b bVar = (C36725b) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f95628c) {
            return null;
        }
        mo40355a();
        return this.f95627a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo40340d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f95627a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo40355a();
        mo40341f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo40355a();
        mo40341f();
    }
}
