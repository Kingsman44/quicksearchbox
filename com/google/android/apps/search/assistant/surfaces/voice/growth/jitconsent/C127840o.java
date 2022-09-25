package com.google.android.apps.search.assistant.surfaces.voice.growth.jitconsent;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.apps.tiktok.inject.p3654a.p3655a.C47189c;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.jitconsent.o */
/* compiled from: PG */
class C127840o extends C127837l implements C68288b {

    /* renamed from: g */
    private ContextWrapper f351850g;

    /* renamed from: h */
    private boolean f351851h;

    /* renamed from: i */
    private volatile C47247a f351852i;

    /* renamed from: j */
    private final Object f351853j = new Object();

    /* renamed from: k */
    private boolean f351854k = false;

    /* renamed from: b */
    private final void mo108228b() {
        if (this.f351850g == null) {
            this.f351850g = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f351851h = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C47247a mo108229d() {
        throw null;
    }

    /* renamed from: f */
    public final C47247a mo108233f() {
        if (this.f351852i == null) {
            synchronized (this.f351853j) {
                if (this.f351852i == null) {
                    this.f351852i = mo108229d();
                }
            }
        }
        return this.f351852i;
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f351851h) {
            return null;
        }
        mo108228b();
        return this.f351850g;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo108234j() {
        if (!this.f351854k) {
            this.f351854k = true;
            mo108233f().mo17653jN();
            C127826b bVar = (C127826b) this;
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo108233f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f351850g;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo108228b();
        mo108234j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo108228b();
        mo108234j();
    }
}
