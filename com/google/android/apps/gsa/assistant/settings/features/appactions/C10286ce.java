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

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.ce */
/* compiled from: PG */
class C10286ce extends C19521a implements C68288b {

    /* renamed from: b */
    private ContextWrapper f34855b;

    /* renamed from: c */
    private boolean f34856c;

    /* renamed from: d */
    private volatile C68324h f34857d;

    /* renamed from: e */
    private final Object f34858e = new Object();

    /* renamed from: f */
    private boolean f34859f = false;

    /* renamed from: a */
    private final void mo18360a() {
        if (this.f34855b == null) {
            this.f34855b = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f34856c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C68324h mo18361b() {
        throw null;
    }

    /* renamed from: d */
    public final C68324h mo18381d() {
        if (this.f34857d == null) {
            synchronized (this.f34858e) {
                if (this.f34857d == null) {
                    this.f34857d = mo18361b();
                }
            }
        }
        return this.f34857d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo18382f() {
        if (!this.f34859f) {
            this.f34859f = true;
            mo18381d().mo17653jN();
            C10228bd bdVar = (C10228bd) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f34856c) {
            return null;
        }
        mo18360a();
        return this.f34855b;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo18381d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f34855b;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo18360a();
        mo18382f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo18360a();
        mo18382f();
    }
}
