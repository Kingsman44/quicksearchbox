package com.google.android.libraries.assistant.auto.tng.morris.onboarding;

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

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.onboarding.v */
/* compiled from: PG */
class C15450v extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f46332a;

    /* renamed from: c */
    private boolean f46333c;

    /* renamed from: d */
    private volatile C68324h f46334d;

    /* renamed from: e */
    private final Object f46335e = new Object();

    /* renamed from: f */
    private boolean f46336f = false;

    /* renamed from: a */
    private final void m32172a() {
        if (this.f46332a == null) {
            this.f46332a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f46333c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C68324h mo22317d() {
        throw null;
    }

    /* renamed from: f */
    public final C68324h mo22336f() {
        if (this.f46334d == null) {
            synchronized (this.f46335e) {
                if (this.f46334d == null) {
                    this.f46334d = mo22317d();
                }
            }
        }
        return this.f46334d;
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f46333c) {
            return null;
        }
        m32172a();
        return this.f46332a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo22337j() {
        if (!this.f46336f) {
            this.f46336f = true;
            mo22336f().mo17653jN();
            C15419b bVar = (C15419b) this;
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo22336f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f46332a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        m32172a();
        mo22337j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        m32172a();
        mo22337j();
    }
}
