package com.google.android.apps.gsa.assistant.settings.features.p540ae;

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

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.g */
/* compiled from: PG */
class C9962g extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f34129a;

    /* renamed from: c */
    private boolean f34130c;

    /* renamed from: d */
    private volatile C68324h f34131d;

    /* renamed from: e */
    private final Object f34132e = new Object();

    /* renamed from: f */
    private boolean f34133f = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f34129a == null) {
            this.f34129a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f34130c = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C68324h mo18162a() {
        if (this.f34131d == null) {
            synchronized (this.f34132e) {
                if (this.f34131d == null) {
                    this.f34131d = mo18139b();
                }
            }
        }
        return this.f34131d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C68324h mo18139b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo18163d() {
        if (!this.f34133f) {
            this.f34133f = true;
            mo18162a().mo17653jN();
            C9943bz bzVar = (C9943bz) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f34130c) {
            return null;
        }
        mo17857e();
        return this.f34129a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo18162a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f34129a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo18163d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo18163d();
    }
}
