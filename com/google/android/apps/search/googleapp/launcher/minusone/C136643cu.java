package com.google.android.apps.search.googleapp.launcher.minusone;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.apps.tiktok.inject.baseclasses.C47210f;
import com.google.apps.tiktok.inject.p3654a.p3655a.C47189c;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47216a;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import com.google.common.base.C58838bb;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.launcher.minusone.cu */
/* compiled from: PG */
class C136643cu extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f371959a;

    /* renamed from: c */
    private volatile C47222f f371960c;

    /* renamed from: d */
    private final Object f371961d = new Object();

    /* renamed from: a */
    private final void mo113264a() {
        if (this.f371959a == null) {
            this.f371959a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo113265b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo113297d() {
        if (this.f371960c == null) {
            synchronized (this.f371961d) {
                if (this.f371960c == null) {
                    this.f371960c = mo113265b();
                }
            }
        }
        return this.f371960c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo113298f() {
        C136601bh bhVar = (C136601bh) this;
        ((C136605bl) mo113297d().mo17653jN()).mo113267kM();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo113264a();
        return this.f371959a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo113297d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f371959a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo113264a();
        mo113298f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo113264a();
        mo113298f();
    }
}
