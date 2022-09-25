package com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10277e;

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

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.e.s */
/* compiled from: PG */
class C135677s extends C19521a implements C68288b {

    /* renamed from: b */
    private ContextWrapper f369561b;

    /* renamed from: c */
    private boolean f369562c;

    /* renamed from: d */
    private volatile C47247a f369563d;

    /* renamed from: e */
    private final Object f369564e = new Object();

    /* renamed from: f */
    private boolean f369565f = false;

    /* renamed from: a */
    private final void mo18360a() {
        if (this.f369561b == null) {
            this.f369561b = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f369562c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo112437b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo112461d() {
        if (this.f369563d == null) {
            synchronized (this.f369564e) {
                if (this.f369563d == null) {
                    this.f369563d = mo112437b();
                }
            }
        }
        return this.f369563d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo112462f() {
        if (!this.f369565f) {
            this.f369565f = true;
            mo112461d().mo17653jN();
            C135648b bVar = (C135648b) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f369562c) {
            return null;
        }
        mo18360a();
        return this.f369561b;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo112461d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f369561b;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo18360a();
        mo112462f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo18360a();
        mo112462f();
    }
}
