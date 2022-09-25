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

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.onboarding.z */
/* compiled from: PG */
class C15454z extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f46346a;

    /* renamed from: c */
    private boolean f46347c;

    /* renamed from: d */
    private volatile C68324h f46348d;

    /* renamed from: e */
    private final Object f46349e = new Object();

    /* renamed from: f */
    private boolean f46350f = false;

    /* renamed from: a */
    private final void m32186a() {
        if (this.f46346a == null) {
            this.f46346a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f46347c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C68324h mo22335d() {
        throw null;
    }

    /* renamed from: f */
    public final C68324h mo22341f() {
        if (this.f46348d == null) {
            synchronized (this.f46349e) {
                if (this.f46348d == null) {
                    this.f46348d = mo22335d();
                }
            }
        }
        return this.f46348d;
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f46347c) {
            return null;
        }
        m32186a();
        return this.f46346a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo22342j() {
        if (!this.f46350f) {
            this.f46350f = true;
            mo22341f().mo17653jN();
            C15446r rVar = (C15446r) this;
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo22341f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f46346a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        m32186a();
        mo22342j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        m32186a();
        mo22342j();
    }
}
