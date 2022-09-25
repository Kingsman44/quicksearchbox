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

/* renamed from: com.google.android.apps.search.googleapp.launcher.minusone.cx */
/* compiled from: PG */
class C136646cx extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f371968a;

    /* renamed from: c */
    private volatile C47222f f371969c;

    /* renamed from: d */
    private final Object f371970d = new Object();

    /* renamed from: a */
    private final void mo113278a() {
        if (this.f371968a == null) {
            this.f371968a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo113279b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo113303d() {
        if (this.f371969c == null) {
            synchronized (this.f371970d) {
                if (this.f371969c == null) {
                    this.f371969c = mo113279b();
                }
            }
        }
        return this.f371969c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo113304f() {
        C136630ch chVar = (C136630ch) this;
        ((C136634cl) mo113303d().mo17653jN()).mo113282lb();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo113278a();
        return this.f371968a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo113303d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f371968a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo113278a();
        mo113304f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo113278a();
        mo113304f();
    }
}