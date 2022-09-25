package com.google.android.apps.gsa.assistant.settings.features.appactions;

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

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.cd */
/* compiled from: PG */
class C10285cd extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f34850a;

    /* renamed from: c */
    private boolean f34851c;

    /* renamed from: d */
    private volatile C68324h f34852d;

    /* renamed from: e */
    private final Object f34853e = new Object();

    /* renamed from: f */
    private boolean f34854f = false;

    /* renamed from: a */
    private final void mo18338a() {
        if (this.f34850a == null) {
            this.f34850a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f34851c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C68324h mo18339b() {
        throw null;
    }

    /* renamed from: d */
    public final C68324h mo18379d() {
        if (this.f34852d == null) {
            synchronized (this.f34853e) {
                if (this.f34852d == null) {
                    this.f34852d = mo18339b();
                }
            }
        }
        return this.f34852d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo18380f() {
        if (!this.f34854f) {
            this.f34854f = true;
            mo18379d().mo17653jN();
            C10201ag agVar = (C10201ag) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f34851c) {
            return null;
        }
        mo18338a();
        return this.f34850a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo18379d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f34850a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo18338a();
        mo18380f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo18338a();
        mo18380f();
    }
}
