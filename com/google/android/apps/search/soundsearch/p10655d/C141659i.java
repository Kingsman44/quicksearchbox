package com.google.android.apps.search.soundsearch.p10655d;

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

/* renamed from: com.google.android.apps.search.soundsearch.d.i */
/* compiled from: PG */
class C141659i extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f384497a;

    /* renamed from: c */
    private boolean f384498c;

    /* renamed from: d */
    private volatile C68324h f384499d;

    /* renamed from: e */
    private final Object f384500e = new Object();

    /* renamed from: f */
    private boolean f384501f = false;

    /* renamed from: a */
    private final void mo116631a() {
        if (this.f384497a == null) {
            this.f384497a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f384498c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C68324h mo116632b() {
        throw null;
    }

    /* renamed from: d */
    public final C68324h mo116636d() {
        if (this.f384499d == null) {
            synchronized (this.f384500e) {
                if (this.f384499d == null) {
                    this.f384499d = mo116632b();
                }
            }
        }
        return this.f384499d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo116637f() {
        if (!this.f384501f) {
            this.f384501f = true;
            mo116636d().mo17653jN();
            C141653c cVar = (C141653c) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f384498c) {
            return null;
        }
        mo116631a();
        return this.f384497a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo116636d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f384497a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo116631a();
        mo116637f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo116631a();
        mo116637f();
    }
}
