package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9416c;

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

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.c.r */
/* compiled from: PG */
class C124875r extends Fragment implements C68288b {

    /* renamed from: a */
    private ContextWrapper f344534a;

    /* renamed from: b */
    private boolean f344535b;

    /* renamed from: c */
    private volatile C47247a f344536c;

    /* renamed from: d */
    private final Object f344537d = new Object();

    /* renamed from: e */
    private boolean f344538e = false;

    /* renamed from: a */
    private final void mo106688a() {
        if (this.f344534a == null) {
            this.f344534a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f344535b = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo106689b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo106694d() {
        if (this.f344536c == null) {
            synchronized (this.f344537d) {
                if (this.f344536c == null) {
                    this.f344536c = mo106689b();
                }
            }
        }
        return this.f344536c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo106695f() {
        if (!this.f344538e) {
            this.f344538e = true;
            mo106694d().mo17653jN();
            C124870m mVar = (C124870m) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f344535b) {
            return null;
        }
        mo106688a();
        return this.f344534a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo106694d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f344534a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo106688a();
        mo106695f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo106688a();
        mo106695f();
    }
}
