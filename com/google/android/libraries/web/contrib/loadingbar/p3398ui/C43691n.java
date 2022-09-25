package com.google.android.libraries.web.contrib.loadingbar.p3398ui;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.apps.tiktok.inject.p3654a.p3655a.C47189c;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47216a;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import com.google.common.base.C58838bb;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.web.contrib.loadingbar.ui.n */
/* compiled from: PG */
class C43691n extends Fragment implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f113992a;

    /* renamed from: b */
    private volatile C47222f f113993b;

    /* renamed from: c */
    private final Object f113994c = new Object();

    /* renamed from: a */
    private final void mo46697a() {
        if (this.f113992a == null) {
            this.f113992a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo46698b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo46705d() {
        if (this.f113993b == null) {
            synchronized (this.f113994c) {
                if (this.f113993b == null) {
                    this.f113993b = mo46698b();
                }
            }
        }
        return this.f113993b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo46706f() {
        C43678b bVar = (C43678b) this;
        ((C43682e) mo46705d().mo17653jN()).mo46700kF();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo46697a();
        return this.f113992a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo46705d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f113992a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo46697a();
        mo46706f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo46697a();
        mo46706f();
    }
}
