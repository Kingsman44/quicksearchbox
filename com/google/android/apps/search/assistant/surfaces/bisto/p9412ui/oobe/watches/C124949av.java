package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.watches;

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

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.av */
/* compiled from: PG */
class C124949av extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f344762a;

    /* renamed from: c */
    private boolean f344763c;

    /* renamed from: d */
    private volatile C47247a f344764d;

    /* renamed from: e */
    private final Object f344765e = new Object();

    /* renamed from: f */
    private boolean f344766f = false;

    /* renamed from: a */
    private final void mo106729a() {
        if (this.f344762a == null) {
            this.f344762a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f344763c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo106730b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo106747d() {
        if (this.f344764d == null) {
            synchronized (this.f344765e) {
                if (this.f344764d == null) {
                    this.f344764d = mo106730b();
                }
            }
        }
        return this.f344764d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo106748f() {
        if (!this.f344766f) {
            this.f344766f = true;
            mo106747d().mo17653jN();
            ResetAssistantSettingsFragment resetAssistantSettingsFragment = (ResetAssistantSettingsFragment) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f344763c) {
            return null;
        }
        mo106729a();
        return this.f344762a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo106747d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f344762a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo106729a();
        mo106748f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo106729a();
        mo106748f();
    }
}
