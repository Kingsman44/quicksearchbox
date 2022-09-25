package com.google.android.apps.gsa.staticplugins.opa.appactions;

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

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.at */
/* compiled from: PG */
class C107251at extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f298522a;

    /* renamed from: c */
    private boolean f298523c;

    /* renamed from: d */
    private volatile C68324h f298524d;

    /* renamed from: e */
    private final Object f298525e = new Object();

    /* renamed from: f */
    private boolean f298526f = false;

    /* renamed from: a */
    private final void m178051a() {
        if (this.f298522a == null) {
            this.f298522a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f298523c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C68324h mo95874d() {
        throw null;
    }

    /* renamed from: f */
    public final C68324h mo95875f() {
        if (this.f298524d == null) {
            synchronized (this.f298525e) {
                if (this.f298524d == null) {
                    this.f298524d = mo95874d();
                }
            }
        }
        return this.f298524d;
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f298523c) {
            return null;
        }
        m178051a();
        return this.f298522a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo95876j() {
        if (!this.f298526f) {
            this.f298526f = true;
            mo95875f().mo17653jN();
            C107324y yVar = (C107324y) this;
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo95875f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f298522a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        m178051a();
        mo95876j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        m178051a();
        mo95876j();
    }
}
