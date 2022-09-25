package com.google.android.apps.search.googleapp.search.suggest.settings;

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

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.settings.l */
/* compiled from: PG */
class C138356l extends Fragment implements C68288b {

    /* renamed from: a */
    private ContextWrapper f376411a;

    /* renamed from: b */
    private boolean f376412b;

    /* renamed from: c */
    private volatile C68324h f376413c;

    /* renamed from: d */
    private final Object f376414d = new Object();

    /* renamed from: e */
    private boolean f376415e = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f376411a == null) {
            this.f376411a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f376412b = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C68324h mo114244a() {
        throw null;
    }

    /* renamed from: b */
    public final C68324h mo114245b() {
        if (this.f376413c == null) {
            synchronized (this.f376414d) {
                if (this.f376413c == null) {
                    this.f376413c = mo114244a();
                }
            }
        }
        return this.f376413c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo114246d() {
        if (!this.f376415e) {
            this.f376415e = true;
            mo114245b().mo17653jN();
            C138352h hVar = (C138352h) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f376412b) {
            return null;
        }
        mo17857e();
        return this.f376411a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo114245b().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f376411a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo114246d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo114246d();
    }
}
