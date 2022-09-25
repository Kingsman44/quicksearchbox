package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8007i;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7970b.C101500a;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.i.s */
/* compiled from: PG */
abstract class C102117s extends C101500a implements C68288b {

    /* renamed from: a */
    private ContextWrapper f284877a;

    /* renamed from: b */
    private boolean f284878b;

    /* renamed from: c */
    private volatile C68324h f284879c;

    /* renamed from: d */
    private final Object f284880d = new Object();

    /* renamed from: e */
    private boolean f284881e = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f284877a == null) {
            this.f284877a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f284878b = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: b */
    public final C68324h mo92886b() {
        if (this.f284879c == null) {
            synchronized (this.f284880d) {
                if (this.f284879c == null) {
                    this.f284879c = mo92860d();
                }
            }
        }
        return this.f284879c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C68324h mo92860d() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo92887f() {
        if (!this.f284881e) {
            this.f284881e = true;
            mo92886b().mo17653jN();
            C102081ac acVar = (C102081ac) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f284878b) {
            return null;
        }
        mo17857e();
        return this.f284877a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo92886b().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f284877a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo92887f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo92887f();
    }
}
