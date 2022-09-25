package com.google.android.apps.search.assistant.surfaces.voice.deeplinks.deeplinktrampolineactivity;

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

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.deeplinks.deeplinktrampolineactivity.k */
/* compiled from: PG */
class C127403k extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f350814a;

    /* renamed from: c */
    private boolean f350815c;

    /* renamed from: d */
    private volatile C47247a f350816d;

    /* renamed from: e */
    private final Object f350817e = new Object();

    /* renamed from: f */
    private boolean f350818f = false;

    /* renamed from: a */
    private final void mo108048a() {
        if (this.f350814a == null) {
            this.f350814a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f350815c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo108049b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo108051d() {
        if (this.f350816d == null) {
            synchronized (this.f350817e) {
                if (this.f350816d == null) {
                    this.f350816d = mo108049b();
                }
            }
        }
        return this.f350816d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo108052f() {
        if (!this.f350818f) {
            this.f350818f = true;
            mo108051d().mo17653jN();
            C127399g gVar = (C127399g) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f350815c) {
            return null;
        }
        mo108048a();
        return this.f350814a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo108051d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f350814a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo108048a();
        mo108052f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo108048a();
        mo108052f();
    }
}
