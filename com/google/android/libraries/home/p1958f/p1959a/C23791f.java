package com.google.android.libraries.home.p1958f.p1959a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.C0260w;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.libraries.home.f.a.f */
/* compiled from: PG */
public class C23791f extends C0260w implements C68288b {

    /* renamed from: a */
    private ContextWrapper f65188a;

    /* renamed from: b */
    private boolean f65189b;

    /* renamed from: c */
    private volatile C68324h f65190c;

    /* renamed from: d */
    private final Object f65191d = new Object();

    /* renamed from: e */
    private boolean f65192e = false;

    /* renamed from: d */
    private final void m44313d() {
        if (this.f65188a == null) {
            this.f65188a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f65189b = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C68324h mo29146a() {
        if (this.f65190c == null) {
            synchronized (this.f65191d) {
                if (this.f65190c == null) {
                    this.f65190c = new C68324h(this);
                }
            }
        }
        return this.f65190c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo29147b() {
        if (!this.f65192e) {
            this.f65192e = true;
            mo29146a().mo17653jN();
            C23797l lVar = (C23797l) this;
        }
    }

    public final Context getContext() {
        if (super.getContext() == null && !this.f65189b) {
            return null;
        }
        m44313d();
        return this.f65188a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo29146a().mo17653jN();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f65188a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        m44313d();
        mo29147b();
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        m44313d();
        mo29147b();
    }
}
