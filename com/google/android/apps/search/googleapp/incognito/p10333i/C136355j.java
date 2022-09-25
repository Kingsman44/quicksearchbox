package com.google.android.apps.search.googleapp.incognito.p10333i;

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

/* renamed from: com.google.android.apps.search.googleapp.incognito.i.j */
/* compiled from: PG */
class C136355j extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f371245a;

    /* renamed from: c */
    private volatile C47222f f371246c;

    /* renamed from: d */
    private final Object f371247d = new Object();

    /* renamed from: a */
    private final void m221543a() {
        if (this.f371245a == null) {
            this.f371245a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C47222f mo112929d() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C47222f mo112935f() {
        if (this.f371246c == null) {
            synchronized (this.f371247d) {
                if (this.f371246c == null) {
                    this.f371246c = mo112929d();
                }
            }
        }
        return this.f371246c;
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        m221543a();
        return this.f371245a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo112936j() {
        C136347b bVar = (C136347b) this;
        ((C136351f) mo112935f().mo17653jN()).mo112932kl();
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo112935f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f371245a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        m221543a();
        mo112936j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        m221543a();
        mo112936j();
    }
}
