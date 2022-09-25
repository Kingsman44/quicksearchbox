package com.google.android.apps.search.googleapp.activity;

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

/* renamed from: com.google.android.apps.search.googleapp.activity.av */
/* compiled from: PG */
class C133398av extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f363490a;

    /* renamed from: c */
    private boolean f363491c;

    /* renamed from: d */
    private volatile C68324h f363492d;

    /* renamed from: e */
    private final Object f363493e = new Object();

    /* renamed from: f */
    private boolean f363494f = false;

    /* renamed from: a */
    private final void mo111129a() {
        if (this.f363490a == null) {
            this.f363490a = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f363491c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C68324h mo111125b() {
        throw null;
    }

    /* renamed from: d */
    public final C68324h mo111126d() {
        if (this.f363492d == null) {
            synchronized (this.f363493e) {
                if (this.f363492d == null) {
                    this.f363492d = mo111125b();
                }
            }
        }
        return this.f363492d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo111127f() {
        if (!this.f363494f) {
            this.f363494f = true;
            mo111126d().mo17653jN();
            C133403b bVar = (C133403b) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f363491c) {
            return null;
        }
        mo111129a();
        return this.f363490a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo111126d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f363490a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo111129a();
        mo111127f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo111129a();
        mo111127f();
    }
}
