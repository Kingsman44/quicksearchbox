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

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.ui.at */
/* compiled from: PG */
class C103130at extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f287813a;

    /* renamed from: c */
    private boolean f287814c;

    /* renamed from: d */
    private volatile C68324h f287815d;

    /* renamed from: e */
    private final Object f287816e = new Object();

    /* renamed from: f */
    private boolean f287817f = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f287813a == null) {
            this.f287813a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f287814c = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C68324h mo93645a() {
        if (this.f287815d == null) {
            synchronized (this.f287816e) {
                if (this.f287815d == null) {
                    this.f287815d = mo93646b();
                }
            }
        }
        return this.f287815d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C68324h mo93646b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo93647d() {
        if (!this.f287817f) {
            this.f287817f = true;
            mo93645a().mo17653jN();
            C103155br brVar = (C103155br) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f287814c) {
            return null;
        }
        mo17857e();
        return this.f287813a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo93645a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f287813a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo93647d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo93647d();
    }
}
