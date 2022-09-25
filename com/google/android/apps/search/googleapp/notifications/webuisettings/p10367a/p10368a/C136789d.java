package com.google.android.apps.search.googleapp.notifications.webuisettings.p10367a.p10368a;

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

/* renamed from: com.google.android.apps.search.googleapp.notifications.webuisettings.a.a.d */
/* compiled from: PG */
class C136789d extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f372349a;

    /* renamed from: c */
    private boolean f372350c;

    /* renamed from: d */
    private volatile C68324h f372351d;

    /* renamed from: e */
    private final Object f372352e = new Object();

    /* renamed from: f */
    private boolean f372353f = false;

    /* renamed from: a */
    private final void mo113365a() {
        if (this.f372349a == null) {
            this.f372349a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f372350c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C68324h mo113366b() {
        throw null;
    }

    /* renamed from: d */
    public final C68324h mo113367d() {
        if (this.f372351d == null) {
            synchronized (this.f372352e) {
                if (this.f372351d == null) {
                    this.f372351d = mo113366b();
                }
            }
        }
        return this.f372351d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo113368f() {
        if (!this.f372353f) {
            this.f372353f = true;
            mo113367d().mo17653jN();
            C136787b bVar = (C136787b) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f372350c) {
            return null;
        }
        mo113365a();
        return this.f372349a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo113367d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f372349a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo113365a();
        mo113368f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo113365a();
        mo113368f();
    }
}
