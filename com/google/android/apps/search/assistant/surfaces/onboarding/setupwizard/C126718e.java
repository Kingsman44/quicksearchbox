package com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard;

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

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.e */
/* compiled from: PG */
class C126718e extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f348990a;

    /* renamed from: c */
    private boolean f348991c;

    /* renamed from: d */
    private volatile C68324h f348992d;

    /* renamed from: e */
    private final Object f348993e = new Object();

    /* renamed from: f */
    private boolean f348994f = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f348990a == null) {
            this.f348990a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f348991c = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C68324h mo107725a() {
        if (this.f348992d == null) {
            synchronized (this.f348993e) {
                if (this.f348992d == null) {
                    this.f348992d = mo107726b();
                }
            }
        }
        return this.f348992d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C68324h mo107726b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo107727d() {
        if (!this.f348994f) {
            this.f348994f = true;
            mo107725a().mo17653jN();
            C126725l lVar = (C126725l) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f348991c) {
            return null;
        }
        mo17857e();
        return this.f348990a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo107725a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f348990a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo107727d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo107727d();
    }
}
