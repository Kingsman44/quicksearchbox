package com.google.android.apps.search.transcription.p10679ui;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.apps.tiktok.inject.baseclasses.C47210f;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.apps.search.transcription.ui.d */
/* compiled from: PG */
class C141937d extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f385152a;

    /* renamed from: c */
    private boolean f385153c;

    /* renamed from: d */
    private volatile C68324h f385154d;

    /* renamed from: e */
    private final Object f385155e = new Object();

    /* renamed from: f */
    private boolean f385156f = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f385152a == null) {
            this.f385152a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f385153c = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C68324h mo116908a() {
        if (this.f385154d == null) {
            synchronized (this.f385155e) {
                if (this.f385154d == null) {
                    this.f385154d = mo116909b();
                }
            }
        }
        return this.f385154d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C68324h mo116909b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo116910d() {
        if (!this.f385156f) {
            this.f385156f = true;
            mo116908a().mo17653jN();
            C141955u uVar = (C141955u) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f385153c) {
            return null;
        }
        mo17857e();
        return this.f385152a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo116908a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f385152a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo116910d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo116910d();
    }
}
