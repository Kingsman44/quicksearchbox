package com.google.android.apps.search.googleapp.googleappbrowser.p10305g;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.g.au */
/* compiled from: PG */
class C135974au extends Fragment implements C68288b {

    /* renamed from: a */
    private ContextWrapper f370322a;

    /* renamed from: b */
    private boolean f370323b;

    /* renamed from: c */
    private volatile C68324h f370324c;

    /* renamed from: d */
    private final Object f370325d = new Object();

    /* renamed from: e */
    private boolean f370326e = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f370322a == null) {
            this.f370322a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f370323b = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C68324h mo112657a() {
        throw null;
    }

    /* renamed from: b */
    public final C68324h mo112658b() {
        if (this.f370324c == null) {
            synchronized (this.f370325d) {
                if (this.f370324c == null) {
                    this.f370324c = mo112657a();
                }
            }
        }
        return this.f370324c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo112659d() {
        if (!this.f370326e) {
            this.f370326e = true;
            mo112658b().mo17653jN();
            C135988h hVar = (C135988h) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f370323b) {
            return null;
        }
        mo17857e();
        return this.f370322a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo112658b().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f370322a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo112659d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo112659d();
    }
}
