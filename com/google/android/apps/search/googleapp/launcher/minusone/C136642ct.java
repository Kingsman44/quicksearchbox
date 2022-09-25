package com.google.android.apps.search.googleapp.launcher.minusone;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.apps.tiktok.inject.baseclasses.C47210f;
import com.google.apps.tiktok.inject.p3654a.p3655a.C47189c;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47216a;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import com.google.common.base.C58838bb;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.launcher.minusone.ct */
/* compiled from: PG */
class C136642ct extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f371956a;

    /* renamed from: c */
    private volatile C47222f f371957c;

    /* renamed from: d */
    private final Object f371958d = new Object();

    /* renamed from: a */
    private final void mo113260a() {
        if (this.f371956a == null) {
            this.f371956a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo113261b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo113295d() {
        if (this.f371957c == null) {
            synchronized (this.f371958d) {
                if (this.f371957c == null) {
                    this.f371957c = mo113261b();
                }
            }
        }
        return this.f371957c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo113296f() {
        C136596bc bcVar = (C136596bc) this;
        ((C136599bf) mo113295d().mo17653jN()).mo113263kJ();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo113260a();
        return this.f371956a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo113295d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f371956a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo113260a();
        mo113296f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo113260a();
        mo113296f();
    }
}
