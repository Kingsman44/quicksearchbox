package com.google.android.apps.gsa.assistant.settings.features.appactions;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1629c.p1630a.C19521a;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.cc */
/* compiled from: PG */
class C10284cc extends C19521a implements C68288b {

    /* renamed from: b */
    private ContextWrapper f34845b;

    /* renamed from: c */
    private boolean f34846c;

    /* renamed from: d */
    private volatile C68324h f34847d;

    /* renamed from: e */
    private final Object f34848e = new Object();

    /* renamed from: f */
    private boolean f34849f = false;

    /* renamed from: a */
    private final void m25171a() {
        if (this.f34845b == null) {
            this.f34845b = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f34846c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C68324h mo18376d() {
        throw null;
    }

    /* renamed from: f */
    public final C68324h mo18377f() {
        if (this.f34847d == null) {
            synchronized (this.f34848e) {
                if (this.f34847d == null) {
                    this.f34847d = mo18376d();
                }
            }
        }
        return this.f34847d;
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f34846c) {
            return null;
        }
        m25171a();
        return this.f34845b;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo18378j() {
        if (!this.f34849f) {
            this.f34849f = true;
            mo18377f().mo17653jN();
            C10421s sVar = (C10421s) this;
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo18377f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f34845b;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        m25171a();
        mo18378j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        m25171a();
        mo18378j();
    }
}
