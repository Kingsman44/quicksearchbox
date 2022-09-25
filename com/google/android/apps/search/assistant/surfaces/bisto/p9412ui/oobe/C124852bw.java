package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.apps.tiktok.inject.baseclasses.C47210f;
import com.google.apps.tiktok.inject.p3654a.p3655a.C47189c;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.bw */
/* compiled from: PG */
class C124852bw extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f344450a;

    /* renamed from: c */
    private boolean f344451c;

    /* renamed from: d */
    private volatile C47247a f344452d;

    /* renamed from: e */
    private final Object f344453e = new Object();

    /* renamed from: f */
    private boolean f344454f = false;

    /* renamed from: a */
    private final void mo106623a() {
        if (this.f344450a == null) {
            this.f344450a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f344451c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo106624b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo106674d() {
        if (this.f344452d == null) {
            synchronized (this.f344453e) {
                if (this.f344452d == null) {
                    this.f344452d = mo106624b();
                }
            }
        }
        return this.f344452d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo106675f() {
        if (!this.f344454f) {
            this.f344454f = true;
            mo106674d().mo17653jN();
            DeviceCustomizeInfoFragment deviceCustomizeInfoFragment = (DeviceCustomizeInfoFragment) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f344451c) {
            return null;
        }
        mo106623a();
        return this.f344450a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo106674d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f344450a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo106623a();
        mo106675f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo106623a();
        mo106675f();
    }
}
