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

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.ui.ap */
/* compiled from: PG */
class C103126ap extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f287799a;

    /* renamed from: c */
    private boolean f287800c;

    /* renamed from: d */
    private volatile C68324h f287801d;

    /* renamed from: e */
    private final Object f287802e = new Object();

    /* renamed from: f */
    private boolean f287803f = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f287799a == null) {
            this.f287799a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f287800c = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C68324h mo93638a() {
        if (this.f287801d == null) {
            synchronized (this.f287802e) {
                if (this.f287801d == null) {
                    this.f287801d = mo93639b();
                }
            }
        }
        return this.f287801d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C68324h mo93639b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo93640d() {
        if (!this.f287803f) {
            this.f287803f = true;
            mo93638a().mo17653jN();
            C103133aw awVar = (C103133aw) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f287800c) {
            return null;
        }
        mo17857e();
        return this.f287799a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo93638a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f287799a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo93640d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo93640d();
    }
}
