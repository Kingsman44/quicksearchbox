package com.google.android.libraries.search.p3025k.p3027b;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1629c.p1630a.C19521a;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.libraries.search.k.b.a */
/* compiled from: PG */
class C38541a extends C19521a implements C68288b {

    /* renamed from: b */
    private ContextWrapper f101908b;

    /* renamed from: c */
    private boolean f101909c;

    /* renamed from: d */
    private volatile C68324h f101910d;

    /* renamed from: e */
    private final Object f101911e = new Object();

    /* renamed from: f */
    private boolean f101912f = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f101908b == null) {
            this.f101908b = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
            this.f101909c = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C68324h mo18360a() {
        if (this.f101910d == null) {
            synchronized (this.f101911e) {
                if (this.f101910d == null) {
                    this.f101910d = mo41479b();
                }
            }
        }
        return this.f101910d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C68324h mo41479b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo41480d() {
        if (!this.f101912f) {
            this.f101912f = true;
            mo18360a().mo17653jN();
            C38543c cVar = (C38543c) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f101909c) {
            return null;
        }
        mo17857e();
        return this.f101908b;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98638b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo18360a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f101908b;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo41480d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ViewComponentManager$FragmentContextWrapper(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo41480d();
    }
}
