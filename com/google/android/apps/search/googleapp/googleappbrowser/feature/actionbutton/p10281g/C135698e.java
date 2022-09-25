package com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10281g;

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

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.g.e */
/* compiled from: PG */
class C135698e extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f369629a;

    /* renamed from: c */
    private boolean f369630c;

    /* renamed from: d */
    private volatile C47247a f369631d;

    /* renamed from: e */
    private final Object f369632e = new Object();

    /* renamed from: f */
    private boolean f369633f = false;

    /* renamed from: a */
    private final void mo112476a() {
        if (this.f369629a == null) {
            this.f369629a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f369630c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo112477b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo112478d() {
        if (this.f369631d == null) {
            synchronized (this.f369632e) {
                if (this.f369631d == null) {
                    this.f369631d = mo112477b();
                }
            }
        }
        return this.f369631d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo112479f() {
        if (!this.f369633f) {
            this.f369633f = true;
            mo112478d().mo17653jN();
            C135696c cVar = (C135696c) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f369630c) {
            return null;
        }
        mo112476a();
        return this.f369629a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo112478d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f369629a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo112476a();
        mo112479f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo112476a();
        mo112479f();
    }
}
