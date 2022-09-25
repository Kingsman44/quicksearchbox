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

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.onboarding.ac */
/* compiled from: PG */
class C15395ac extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f46196a;

    /* renamed from: c */
    private boolean f46197c;

    /* renamed from: d */
    private volatile C68324h f46198d;

    /* renamed from: e */
    private final Object f46199e = new Object();

    /* renamed from: f */
    private boolean f46200f = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f46196a == null) {
            this.f46196a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f46197c = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C68324h mo22299a() {
        if (this.f46198d == null) {
            synchronized (this.f46199e) {
                if (this.f46198d == null) {
                    this.f46198d = mo22300b();
                }
            }
        }
        return this.f46198d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C68324h mo22300b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo22301d() {
        if (!this.f46200f) {
            this.f46200f = true;
            mo22299a().mo17653jN();
            C15410ar arVar = (C15410ar) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f46197c) {
            return null;
        }
        mo17857e();
        return this.f46196a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo22299a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f46196a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo22301d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo22301d();
    }
}
