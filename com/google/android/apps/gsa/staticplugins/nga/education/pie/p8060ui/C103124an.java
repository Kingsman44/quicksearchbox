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

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.ui.an */
/* compiled from: PG */
class C103124an extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f287789a;

    /* renamed from: c */
    private boolean f287790c;

    /* renamed from: d */
    private volatile C68324h f287791d;

    /* renamed from: e */
    private final Object f287792e = new Object();

    /* renamed from: f */
    private boolean f287793f = false;

    /* renamed from: a */
    private final void mo93619a() {
        if (this.f287789a == null) {
            this.f287789a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f287790c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C68324h mo93620b() {
        throw null;
    }

    /* renamed from: d */
    public final C68324h mo93634d() {
        if (this.f287791d == null) {
            synchronized (this.f287792e) {
                if (this.f287791d == null) {
                    this.f287791d = mo93620b();
                }
            }
        }
        return this.f287791d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo93635f() {
        if (!this.f287793f) {
            this.f287793f = true;
            mo93634d().mo17653jN();
            C103112ab abVar = (C103112ab) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f287790c) {
            return null;
        }
        mo93619a();
        return this.f287789a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo93634d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f287789a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo93619a();
        mo93635f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo93619a();
        mo93635f();
    }
}
