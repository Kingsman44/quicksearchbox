package com.google.android.apps.search.googleapp.search.voicesearch.settings;

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

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.settings.e */
/* compiled from: PG */
class C138888e extends Fragment implements C68288b {

    /* renamed from: a */
    private ContextWrapper f377774a;

    /* renamed from: b */
    private boolean f377775b;

    /* renamed from: c */
    private volatile C68324h f377776c;

    /* renamed from: d */
    private final Object f377777d = new Object();

    /* renamed from: e */
    private boolean f377778e = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f377774a == null) {
            this.f377774a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f377775b = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C68324h mo114612a() {
        if (this.f377776c == null) {
            synchronized (this.f377777d) {
                if (this.f377776c == null) {
                    this.f377776c = mo114613b();
                }
            }
        }
        return this.f377776c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C68324h mo114613b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo114614d() {
        if (!this.f377778e) {
            this.f377778e = true;
            mo114612a().mo17653jN();
            C138911z zVar = (C138911z) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f377775b) {
            return null;
        }
        mo17857e();
        return this.f377774a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo114612a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f377774a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo114614d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo114614d();
    }
}
