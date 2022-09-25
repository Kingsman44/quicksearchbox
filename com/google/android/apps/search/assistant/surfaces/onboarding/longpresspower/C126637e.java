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

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.longpresspower.e */
/* compiled from: PG */
class C126637e extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f348752a;

    /* renamed from: c */
    private boolean f348753c;

    /* renamed from: d */
    private volatile C68324h f348754d;

    /* renamed from: e */
    private final Object f348755e = new Object();

    /* renamed from: f */
    private boolean f348756f = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f348752a == null) {
            this.f348752a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f348753c = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C68324h mo107644a() {
        if (this.f348754d == null) {
            synchronized (this.f348755e) {
                if (this.f348754d == null) {
                    this.f348754d = mo107645b();
                }
            }
        }
        return this.f348754d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C68324h mo107645b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo107646d() {
        if (!this.f348756f) {
            this.f348756f = true;
            mo107644a().mo17653jN();
            C126648p pVar = (C126648p) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f348753c) {
            return null;
        }
        mo17857e();
        return this.f348752a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo107644a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f348752a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo107646d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo107646d();
    }
}
