package com.google.android.apps.gsa.assistant.settings.features.appactions;

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

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.cb */
/* compiled from: PG */
class C10283cb extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f34840a;

    /* renamed from: c */
    private boolean f34841c;

    /* renamed from: d */
    private volatile C68324h f34842d;

    /* renamed from: e */
    private final Object f34843e = new Object();

    /* renamed from: f */
    private boolean f34844f = false;

    /* renamed from: a */
    private final void mo18350a() {
        if (this.f34840a == null) {
            this.f34840a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f34841c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C68324h mo18351b() {
        throw null;
    }

    /* renamed from: d */
    public final C68324h mo18374d() {
        if (this.f34842d == null) {
            synchronized (this.f34843e) {
                if (this.f34842d == null) {
                    this.f34842d = mo18351b();
                }
            }
        }
        return this.f34842d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo18375f() {
        if (!this.f34844f) {
            this.f34844f = true;
            mo18374d().mo17653jN();
            C10221b bVar = (C10221b) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f34841c) {
            return null;
        }
        mo18350a();
        return this.f34840a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo18374d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f34840a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo18350a();
        mo18375f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo18350a();
        mo18375f();
    }
}
