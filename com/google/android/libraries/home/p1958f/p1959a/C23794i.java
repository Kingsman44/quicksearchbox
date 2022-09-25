package com.google.android.libraries.home.p1958f.p1959a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.C0260w;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.libraries.home.f.a.i */
/* compiled from: PG */
public class C23794i extends C0260w implements C68288b {

    /* renamed from: a */
    private ContextWrapper f65203a;

    /* renamed from: b */
    private boolean f65204b;

    /* renamed from: c */
    private volatile C68324h f65205c;

    /* renamed from: d */
    private final Object f65206d = new Object();

    /* renamed from: e */
    private boolean f65207e = false;

    /* renamed from: d */
    private final void m44325d() {
        if (this.f65203a == null) {
            this.f65203a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f65204b = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C68324h mo29152a() {
        if (this.f65205c == null) {
            synchronized (this.f65206d) {
                if (this.f65205c == null) {
                    this.f65205c = new C68324h(this);
                }
            }
        }
        return this.f65205c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo29153b() {
        if (!this.f65207e) {
            this.f65207e = true;
            mo29152a().mo17653jN();
            C23786al alVar = (C23786al) this;
        }
    }

    public final Context getContext() {
        if (super.getContext() == null && !this.f65204b) {
            return null;
        }
        m44325d();
        return this.f65203a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo29152a().mo17653jN();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f65203a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        m44325d();
        mo29153b();
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        m44325d();
        mo29153b();
    }
}
