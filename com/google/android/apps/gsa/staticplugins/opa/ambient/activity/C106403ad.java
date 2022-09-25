package com.google.android.apps.gsa.staticplugins.opa.ambient.activity;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.activity.ad */
/* compiled from: PG */
class C106403ad extends Fragment implements C68288b {

    /* renamed from: a */
    private ContextWrapper f296806a;

    /* renamed from: b */
    private boolean f296807b;

    /* renamed from: c */
    private volatile C68324h f296808c;

    /* renamed from: d */
    private final Object f296809d = new Object();

    /* renamed from: e */
    private boolean f296810e = false;

    C106403ad() {
    }

    /* renamed from: a */
    private final void mo95505a() {
        if (this.f296806a == null) {
            this.f296806a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f296807b = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: e */
    public final C68324h mo95511e() {
        if (this.f296808c == null) {
            synchronized (this.f296809d) {
                if (this.f296808c == null) {
                    this.f296808c = new C68324h(this);
                }
            }
        }
        return this.f296808c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo95512f() {
        if (!this.f296810e) {
            this.f296810e = true;
            AmbientAssistantFeedbackFragment ambientAssistantFeedbackFragment = (AmbientAssistantFeedbackFragment) this;
            C74178nm nmVar = (C74178nm) mo95511e().mo17653jN();
            ambientAssistantFeedbackFragment.f296773a = nmVar.f207136c.mo69072Y();
            ambientAssistantFeedbackFragment.f296774b = Optional.empty();
            ambientAssistantFeedbackFragment.f296775c = (C90021c) nmVar.f207130a.a.f202006C.mo17428b();
            ambientAssistantFeedbackFragment.f296776d = (C130895ag) nmVar.f207130a.hN.mo17428b();
        }
    }

    public final Context getContext() {
        if (super.getContext() == null && !this.f296807b) {
            return null;
        }
        mo95505a();
        return this.f296806a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo95511e().mo17653jN();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f296806a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo95505a();
        mo95512f();
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public C106403ad(int i) {
        super(i);
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        mo95505a();
        mo95512f();
    }
}
