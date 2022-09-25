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

/* renamed from: com.google.android.libraries.home.f.a.e */
/* compiled from: PG */
public class C23790e extends C0260w implements C68288b {

    /* renamed from: a */
    private ContextWrapper f65183a;

    /* renamed from: b */
    private boolean f65184b;

    /* renamed from: c */
    private volatile C68324h f65185c;

    /* renamed from: d */
    private final Object f65186d = new Object();

    /* renamed from: e */
    private boolean f65187e = false;

    /* renamed from: a */
    private final void mo29143a() {
        if (this.f65183a == null) {
            this.f65183a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f65184b = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: b */
    public final C68324h mo29144b() {
        if (this.f65185c == null) {
            synchronized (this.f65186d) {
                if (this.f65185c == null) {
                    this.f65185c = new C68324h(this);
                }
            }
        }
        return this.f65185c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo29145d() {
        if (!this.f65187e) {
            this.f65187e = true;
            mo29144b().mo17653jN();
            C23789d dVar = (C23789d) this;
        }
    }

    public final Context getContext() {
        if (super.getContext() == null && !this.f65184b) {
            return null;
        }
        mo29143a();
        return this.f65183a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo29144b().mo17653jN();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f65183a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo29143a();
        mo29145d();
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        mo29143a();
        mo29145d();
    }
}
