package com.google.android.apps.search.weather.p10689h;

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

/* renamed from: com.google.android.apps.search.weather.h.a */
/* compiled from: PG */
class C142094a extends C19520a implements C68288b {

    /* renamed from: a */
    private ContextWrapper f385503a;

    /* renamed from: c */
    private boolean f385504c;

    /* renamed from: d */
    private volatile C47247a f385505d;

    /* renamed from: e */
    private final Object f385506e = new Object();

    /* renamed from: f */
    private boolean f385507f = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f385503a == null) {
            this.f385503a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f385504c = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C47247a mo117005a() {
        if (this.f385505d == null) {
            synchronized (this.f385506e) {
                if (this.f385505d == null) {
                    this.f385505d = mo117006b();
                }
            }
        }
        return this.f385505d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo117006b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo117007d() {
        if (!this.f385507f) {
            this.f385507f = true;
            mo117005a().mo17653jN();
            C142097c cVar = (C142097c) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f385504c) {
            return null;
        }
        mo17857e();
        return this.f385503a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo117005a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f385503a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo117007d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo117007d();
    }
}
