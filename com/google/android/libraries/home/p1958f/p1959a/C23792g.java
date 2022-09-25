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

/* renamed from: com.google.android.libraries.home.f.a.g */
/* compiled from: PG */
public class C23792g extends C0260w implements C68288b {

    /* renamed from: a */
    private ContextWrapper f65193a;

    /* renamed from: b */
    private boolean f65194b;

    /* renamed from: c */
    private volatile C68324h f65195c;

    /* renamed from: d */
    private final Object f65196d = new Object();

    /* renamed from: e */
    private boolean f65197e = false;

    /* renamed from: d */
    private final void m44317d() {
        if (this.f65193a == null) {
            this.f65193a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f65194b = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C68324h mo29148a() {
        if (this.f65195c == null) {
            synchronized (this.f65196d) {
                if (this.f65195c == null) {
                    this.f65195c = new C68324h(this);
                }
            }
        }
        return this.f65195c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo29149b() {
        if (!this.f65197e) {
            this.f65197e = true;
            mo29148a().mo17653jN();
            C23798m mVar = (C23798m) this;
        }
    }

    public final Context getContext() {
        if (super.getContext() == null && !this.f65194b) {
            return null;
        }
        m44317d();
        return this.f65193a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo29148a().mo17653jN();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f65193a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        m44317d();
        mo29149b();
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        m44317d();
        mo29149b();
    }
}
