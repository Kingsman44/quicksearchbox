package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8060ui;

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

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.ui.am */
/* compiled from: PG */
class C103123am extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f287784a;

    /* renamed from: c */
    private boolean f287785c;

    /* renamed from: d */
    private volatile C68324h f287786d;

    /* renamed from: e */
    private final Object f287787e = new Object();

    /* renamed from: f */
    private boolean f287788f = false;

    /* renamed from: a */
    private final void mo93683a() {
        if (this.f287784a == null) {
            this.f287784a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f287785c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C68324h mo93631b() {
        throw null;
    }

    /* renamed from: d */
    public final C68324h mo93632d() {
        if (this.f287786d == null) {
            synchronized (this.f287787e) {
                if (this.f287786d == null) {
                    this.f287786d = mo93631b();
                }
            }
        }
        return this.f287786d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo93633f() {
        if (!this.f287788f) {
            this.f287788f = true;
            mo93632d().mo17653jN();
            C103173k kVar = (C103173k) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f287785c) {
            return null;
        }
        mo93683a();
        return this.f287784a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo93632d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f287784a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo93683a();
        mo93633f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo93683a();
        mo93633f();
    }
}
