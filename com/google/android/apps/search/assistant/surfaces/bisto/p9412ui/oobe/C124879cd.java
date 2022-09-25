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

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.cd */
/* compiled from: PG */
class C124879cd extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f344554a;

    /* renamed from: c */
    private boolean f344555c;

    /* renamed from: d */
    private volatile C47247a f344556d;

    /* renamed from: e */
    private final Object f344557e = new Object();

    /* renamed from: f */
    private boolean f344558f = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f344554a == null) {
            this.f344554a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f344555c = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C47247a mo106702a() {
        if (this.f344556d == null) {
            synchronized (this.f344557e) {
                if (this.f344556d == null) {
                    this.f344556d = mo106639b();
                }
            }
        }
        return this.f344556d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo106639b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo106703d() {
        if (!this.f344558f) {
            this.f344558f = true;
            mo106702a().mo17653jN();
            UnsupportedLanguageFragment unsupportedLanguageFragment = (UnsupportedLanguageFragment) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f344555c) {
            return null;
        }
        mo17857e();
        return this.f344554a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo106702a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f344554a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo106703d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo106703d();
    }
}
