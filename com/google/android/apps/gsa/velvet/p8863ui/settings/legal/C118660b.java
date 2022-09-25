package com.google.android.apps.gsa.velvet.p8863ui.settings.legal;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.C0227cs;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.apps.gsa.velvet.ui.settings.legal.b */
/* compiled from: PG */
class C118660b extends C0227cs implements C68288b {

    /* renamed from: h */
    private ContextWrapper f331024h;

    /* renamed from: i */
    private boolean f331025i;

    /* renamed from: j */
    private volatile C68324h f331026j;

    /* renamed from: k */
    private final Object f331027k = new Object();

    /* renamed from: l */
    private boolean f331028l = false;

    /* renamed from: f */
    private final void m196992f() {
        if (this.f331024h == null) {
            this.f331024h = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f331025i = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: d */
    public final C68324h mo103845d() {
        if (this.f331026j == null) {
            synchronized (this.f331027k) {
                if (this.f331026j == null) {
                    this.f331026j = new C68324h(this);
                }
            }
        }
        return this.f331026j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo103846e() {
        if (!this.f331028l) {
            this.f331028l = true;
            mo103845d().mo17653jN();
            C118671m mVar = (C118671m) this;
        }
    }

    public final Context getContext() {
        if (super.getContext() == null && !this.f331025i) {
            return null;
        }
        m196992f();
        return this.f331024h;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo103845d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f331024h;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        m196992f();
        mo103846e();
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        m196992f();
        mo103846e();
    }
}
