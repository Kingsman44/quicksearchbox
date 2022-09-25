package com.google.android.libraries.assistant.auto.tng.morris.onboarding;

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

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.onboarding.aa */
/* compiled from: PG */
class C15393aa extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f46186a;

    /* renamed from: c */
    private boolean f46187c;

    /* renamed from: d */
    private volatile C68324h f46188d;

    /* renamed from: e */
    private final Object f46189e = new Object();

    /* renamed from: f */
    private boolean f46190f = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f46186a == null) {
            this.f46186a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f46187c = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C68324h mo22293a() {
        if (this.f46188d == null) {
            synchronized (this.f46189e) {
                if (this.f46188d == null) {
                    this.f46188d = mo22294b();
                }
            }
        }
        return this.f46188d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C68324h mo22294b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo22295d() {
        if (!this.f46190f) {
            this.f46190f = true;
            mo22293a().mo17653jN();
            C15400ah ahVar = (C15400ah) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f46187c) {
            return null;
        }
        mo17857e();
        return this.f46186a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo22293a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f46186a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo22295d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo22295d();
    }
}
