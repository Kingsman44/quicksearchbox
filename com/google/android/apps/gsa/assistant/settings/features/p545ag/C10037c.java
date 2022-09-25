package com.google.android.apps.gsa.assistant.settings.features.p545ag;

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

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ag.c */
/* compiled from: PG */
class C10037c extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f34246a;

    /* renamed from: c */
    private boolean f34247c;

    /* renamed from: d */
    private volatile C68324h f34248d;

    /* renamed from: e */
    private final Object f34249e = new Object();

    /* renamed from: f */
    private boolean f34250f = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f34246a == null) {
            this.f34246a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f34247c = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C68324h mo18197a() {
        if (this.f34248d == null) {
            synchronized (this.f34249e) {
                if (this.f34248d == null) {
                    this.f34248d = mo18198b();
                }
            }
        }
        return this.f34248d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C68324h mo18198b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo18199d() {
        if (!this.f34250f) {
            this.f34250f = true;
            mo18197a().mo17653jN();
            C10041g gVar = (C10041g) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f34247c) {
            return null;
        }
        mo17857e();
        return this.f34246a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo18197a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f34246a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo18199d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo18199d();
    }
}
