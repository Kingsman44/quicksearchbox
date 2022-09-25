package com.google.android.apps.search.googleapp.googleappbrowser.pane.p10307a;

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

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.pane.a.b */
/* compiled from: PG */
class C136023b extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f370452a;

    /* renamed from: c */
    private boolean f370453c;

    /* renamed from: d */
    private volatile C47247a f370454d;

    /* renamed from: e */
    private final Object f370455e = new Object();

    /* renamed from: f */
    private boolean f370456f = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f370452a == null) {
            this.f370452a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f370453c = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C47247a mo112695a() {
        if (this.f370454d == null) {
            synchronized (this.f370455e) {
                if (this.f370454d == null) {
                    this.f370454d = mo112696b();
                }
            }
        }
        return this.f370454d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo112696b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo112697d() {
        if (!this.f370456f) {
            this.f370456f = true;
            mo112695a().mo17653jN();
            C136029h hVar = (C136029h) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f370453c) {
            return null;
        }
        mo17857e();
        return this.f370452a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo112695a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f370452a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo112697d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo112697d();
    }
}
