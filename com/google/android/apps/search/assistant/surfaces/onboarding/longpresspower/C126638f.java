package com.google.android.apps.search.assistant.surfaces.onboarding.longpresspower;

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

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.longpresspower.f */
/* compiled from: PG */
class C126638f extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f348757a;

    /* renamed from: c */
    private boolean f348758c;

    /* renamed from: d */
    private volatile C68324h f348759d;

    /* renamed from: e */
    private final Object f348760e = new Object();

    /* renamed from: f */
    private boolean f348761f = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f348757a == null) {
            this.f348757a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f348758c = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C68324h mo107647a() {
        if (this.f348759d == null) {
            synchronized (this.f348760e) {
                if (this.f348759d == null) {
                    this.f348759d = mo107648b();
                }
            }
        }
        return this.f348759d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C68324h mo107648b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo107649d() {
        if (!this.f348761f) {
            this.f348761f = true;
            mo107647a().mo17653jN();
            C126652t tVar = (C126652t) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f348758c) {
            return null;
        }
        mo17857e();
        return this.f348757a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo107647a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f348757a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo107649d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo107649d();
    }
}
