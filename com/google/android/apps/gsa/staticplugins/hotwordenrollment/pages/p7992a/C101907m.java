package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7992a;

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

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.a.m */
/* compiled from: PG */
abstract class C101907m extends C101500a implements C68288b {

    /* renamed from: a */
    private ContextWrapper f284260a;

    /* renamed from: b */
    private boolean f284261b;

    /* renamed from: c */
    private volatile C68324h f284262c;

    /* renamed from: d */
    private final Object f284263d = new Object();

    /* renamed from: e */
    private boolean f284264e = false;

    /* renamed from: b */
    private final void mo92677b() {
        if (this.f284260a == null) {
            this.f284260a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f284261b = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C68324h mo92678d() {
        throw null;
    }

    /* renamed from: f */
    public final C68324h mo92681f() {
        if (this.f284262c == null) {
            synchronized (this.f284263d) {
                if (this.f284262c == null) {
                    this.f284262c = mo92678d();
                }
            }
        }
        return this.f284262c;
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f284261b) {
            return null;
        }
        mo92677b();
        return this.f284260a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo92682j() {
        if (!this.f284264e) {
            this.f284264e = true;
            mo92681f().mo17653jN();
            C101896b bVar = (C101896b) this;
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo92681f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f284260a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo92677b();
        mo92682j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo92677b();
        mo92682j();
    }
}
