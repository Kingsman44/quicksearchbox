package com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.apps.tiktok.inject.baseclasses.C47210f;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47216a;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.common.base.C58838bb;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.i.a.ae */
/* compiled from: PG */
class C136497ae extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f371606a;

    /* renamed from: c */
    private volatile C47222f f371607c;

    /* renamed from: d */
    private final Object f371608d = new Object();

    /* renamed from: a */
    private final void mo113101a() {
        if (this.f371606a == null) {
            this.f371606a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo113093b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo113094d() {
        if (this.f371607c == null) {
            synchronized (this.f371608d) {
                if (this.f371607c == null) {
                    this.f371607c = mo113093b();
                }
            }
        }
        return this.f371607c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo113095f() {
        C136504g gVar = (C136504g) this;
        ((C136510m) mo113094d().mo17653jN()).mo113113ah();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo113101a();
        return this.f371606a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo113094d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f371606a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo113101a();
        mo113095f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo113101a();
        mo113095f();
    }
}
