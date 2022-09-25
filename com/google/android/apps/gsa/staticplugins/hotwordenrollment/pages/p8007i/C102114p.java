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

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.i.p */
/* compiled from: PG */
abstract class C102114p extends C101500a implements C68288b {

    /* renamed from: a */
    private ContextWrapper f284862a;

    /* renamed from: b */
    private boolean f284863b;

    /* renamed from: c */
    private volatile C68324h f284864c;

    /* renamed from: d */
    private final Object f284865d = new Object();

    /* renamed from: e */
    private boolean f284866e = false;

    /* renamed from: b */
    private final void mo92872b() {
        if (this.f284862a == null) {
            this.f284862a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f284863b = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C68324h mo92873d() {
        throw null;
    }

    /* renamed from: f */
    public final C68324h mo92879f() {
        if (this.f284864c == null) {
            synchronized (this.f284865d) {
                if (this.f284864c == null) {
                    this.f284864c = mo92873d();
                }
            }
        }
        return this.f284864c;
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f284863b) {
            return null;
        }
        mo92872b();
        return this.f284862a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo92880j() {
        if (!this.f284866e) {
            this.f284866e = true;
            mo92879f().mo17653jN();
            C102100b bVar = (C102100b) this;
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo92879f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f284862a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo92872b();
        mo92880j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo92872b();
        mo92880j();
    }
}
