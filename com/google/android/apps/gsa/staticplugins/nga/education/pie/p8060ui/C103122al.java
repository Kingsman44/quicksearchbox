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

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.ui.al */
/* compiled from: PG */
class C103122al extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f287779a;

    /* renamed from: c */
    private boolean f287780c;

    /* renamed from: d */
    private volatile C68324h f287781d;

    /* renamed from: e */
    private final Object f287782e = new Object();

    /* renamed from: f */
    private boolean f287783f = false;

    /* renamed from: a */
    private final void m170969a() {
        if (this.f287779a == null) {
            this.f287779a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f287780c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C68324h mo93628d() {
        throw null;
    }

    /* renamed from: f */
    public final C68324h mo93629f() {
        if (this.f287781d == null) {
            synchronized (this.f287782e) {
                if (this.f287781d == null) {
                    this.f287781d = mo93628d();
                }
            }
        }
        return this.f287781d;
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f287780c) {
            return null;
        }
        m170969a();
        return this.f287779a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo93630j() {
        if (!this.f287783f) {
            this.f287783f = true;
            mo93629f().mo17653jN();
            C103137b bVar = (C103137b) this;
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo93629f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f287779a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        m170969a();
        mo93630j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        m170969a();
        mo93630j();
    }
}
