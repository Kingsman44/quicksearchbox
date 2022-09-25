package com.google.android.libraries.search.silk.p3183b;

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

/* renamed from: com.google.android.libraries.search.silk.b.a */
/* compiled from: PG */
class C40647a extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f106660a;

    /* renamed from: c */
    private boolean f106661c;

    /* renamed from: d */
    private volatile C68324h f106662d;

    /* renamed from: e */
    private final Object f106663e = new Object();

    /* renamed from: f */
    private boolean f106664f = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f106660a == null) {
            this.f106660a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f106661c = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C68324h mo42578a() {
        if (this.f106662d == null) {
            synchronized (this.f106663e) {
                if (this.f106662d == null) {
                    this.f106662d = mo42579b();
                }
            }
        }
        return this.f106662d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C68324h mo42579b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo42580d() {
        if (!this.f106664f) {
            this.f106664f = true;
            mo42578a().mo17653jN();
            C40649c cVar = (C40649c) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f106661c) {
            return null;
        }
        mo17857e();
        return this.f106660a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo42578a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f106660a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo42580d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo42580d();
    }
}
