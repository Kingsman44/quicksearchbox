package com.google.android.libraries.web.contrib.p3358b.p3359a;

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

/* renamed from: com.google.android.libraries.web.contrib.b.a.l */
/* compiled from: PG */
class C43399l extends Fragment implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f113382a;

    /* renamed from: b */
    private volatile C47222f f113383b;

    /* renamed from: c */
    private final Object f113384c = new Object();

    /* renamed from: a */
    private final void mo46492a() {
        if (this.f113382a == null) {
            this.f113382a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo46493b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo46496d() {
        if (this.f113383b == null) {
            synchronized (this.f113384c) {
                if (this.f113383b == null) {
                    this.f113383b = mo46493b();
                }
            }
        }
        return this.f113383b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo46497f() {
        C43393f fVar = (C43393f) this;
        ((C43398k) mo46496d().mo17653jN()).mo46495jW();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo46492a();
        return this.f113382a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo46496d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f113382a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo46492a();
        mo46497f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo46492a();
        mo46497f();
    }
}
