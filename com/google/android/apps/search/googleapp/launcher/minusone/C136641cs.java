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

/* renamed from: com.google.android.apps.search.googleapp.launcher.minusone.cs */
/* compiled from: PG */
class C136641cs extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f371953a;

    /* renamed from: c */
    private volatile C47222f f371954c;

    /* renamed from: d */
    private final Object f371955d = new Object();

    /* renamed from: a */
    private final void mo113256a() {
        if (this.f371953a == null) {
            this.f371953a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo113257b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo113293d() {
        if (this.f371954c == null) {
            synchronized (this.f371955d) {
                if (this.f371954c == null) {
                    this.f371954c = mo113257b();
                }
            }
        }
        return this.f371954c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo113294f() {
        C136588aw awVar = (C136588aw) this;
        ((C136594ba) mo113293d().mo17653jN()).mo113259kI();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo113256a();
        return this.f371953a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo113293d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f371953a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo113256a();
        mo113294f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo113256a();
        mo113294f();
    }
}
