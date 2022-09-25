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

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.ui.au */
/* compiled from: PG */
class C103131au extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f287818a;

    /* renamed from: c */
    private boolean f287819c;

    /* renamed from: d */
    private volatile C68324h f287820d;

    /* renamed from: e */
    private final Object f287821e = new Object();

    /* renamed from: f */
    private boolean f287822f = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f287818a == null) {
            this.f287818a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f287819c = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C68324h mo93648a() {
        if (this.f287820d == null) {
            synchronized (this.f287821e) {
                if (this.f287820d == null) {
                    this.f287820d = mo93649b();
                }
            }
        }
        return this.f287820d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C68324h mo93649b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo93650d() {
        if (!this.f287822f) {
            this.f287822f = true;
            mo93648a().mo17653jN();
            C103161bx bxVar = (C103161bx) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f287819c) {
            return null;
        }
        mo17857e();
        return this.f287818a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo93648a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f287818a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo93650d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo93650d();
    }
}
