package com.google.android.apps.gsa.assistant.settings.devices.p517a;

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

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.a.e */
/* compiled from: PG */
class C9530e extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f33036a;

    /* renamed from: c */
    private boolean f33037c;

    /* renamed from: d */
    private volatile C68324h f33038d;

    /* renamed from: e */
    private final Object f33039e = new Object();

    /* renamed from: f */
    private boolean f33040f = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f33036a == null) {
            this.f33036a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f33037c = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C68324h mo17854a() {
        if (this.f33038d == null) {
            synchronized (this.f33039e) {
                if (this.f33038d == null) {
                    this.f33038d = mo17855b();
                }
            }
        }
        return this.f33038d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C68324h mo17855b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo17856d() {
        if (!this.f33040f) {
            this.f33040f = true;
            mo17854a().mo17653jN();
            C9534i iVar = (C9534i) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f33037c) {
            return null;
        }
        mo17857e();
        return this.f33036a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo17854a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f33036a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo17856d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo17856d();
    }
}
