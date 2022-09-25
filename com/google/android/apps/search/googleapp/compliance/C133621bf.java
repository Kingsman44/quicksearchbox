package com.google.android.apps.search.googleapp.compliance;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1969j.p1970a.p1971a.p1972a.C23928f;
import com.google.apps.tiktok.inject.p3654a.p3655a.C47189c;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.android.p5301b.C68297a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;

/* renamed from: com.google.android.apps.search.googleapp.compliance.bf */
/* compiled from: PG */
class C133621bf extends C23928f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f364001a;

    /* renamed from: b */
    private boolean f364002b;

    /* renamed from: c */
    private volatile C47247a f364003c;

    /* renamed from: d */
    private final Object f364004d = new Object();

    /* renamed from: e */
    private boolean f364005e = false;

    /* renamed from: a */
    private final void mo18360a() {
        if (this.f364001a == null) {
            this.f364001a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f364002b = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo111298b() {
        throw null;
    }

    /* renamed from: f */
    public final C47247a mo111299f() {
        if (this.f364003c == null) {
            synchronized (this.f364004d) {
                if (this.f364003c == null) {
                    this.f364003c = mo111298b();
                }
            }
        }
        return this.f364003c;
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f364002b) {
            return null;
        }
        mo18360a();
        return this.f364001a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo111300j() {
        if (!this.f364005e) {
            this.f364005e = true;
            mo111299f().mo17653jN();
            C133622c cVar = (C133622c) this;
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo111299f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f364001a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo18360a();
        mo111300j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo18360a();
        mo111300j();
    }
}
