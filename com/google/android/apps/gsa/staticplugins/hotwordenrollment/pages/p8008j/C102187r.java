package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j;

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

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.r */
/* compiled from: PG */
abstract class C102187r extends C101500a implements C68288b {

    /* renamed from: a */
    private ContextWrapper f285068a;

    /* renamed from: b */
    private boolean f285069b;

    /* renamed from: c */
    private volatile C68324h f285070c;

    /* renamed from: d */
    private final Object f285071d = new Object();

    /* renamed from: e */
    private boolean f285072e = false;

    /* renamed from: b */
    private final void mo92915b() {
        if (this.f285068a == null) {
            this.f285068a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f285069b = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C68324h mo92916d() {
        throw null;
    }

    /* renamed from: f */
    public final C68324h mo92933f() {
        if (this.f285070c == null) {
            synchronized (this.f285071d) {
                if (this.f285070c == null) {
                    this.f285070c = mo92916d();
                }
            }
        }
        return this.f285070c;
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f285069b) {
            return null;
        }
        mo92915b();
        return this.f285068a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo92934j() {
        if (!this.f285072e) {
            this.f285072e = true;
            mo92933f().mo17653jN();
            C102156b bVar = (C102156b) this;
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo92933f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f285068a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo92915b();
        mo92934j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo92915b();
        mo92934j();
    }
}
