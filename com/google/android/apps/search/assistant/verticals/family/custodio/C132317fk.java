package com.google.android.apps.search.assistant.verticals.family.custodio;

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

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.fk */
/* compiled from: PG */
class C132317fk extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f361156a;

    /* renamed from: c */
    private boolean f361157c;

    /* renamed from: d */
    private volatile C47247a f361158d;

    /* renamed from: e */
    private final Object f361159e = new Object();

    /* renamed from: f */
    private boolean f361160f = false;

    /* renamed from: a */
    private final void mo110427a() {
        if (this.f361156a == null) {
            this.f361156a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f361157c = C68297a.m98634a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo110428b() {
        throw null;
    }

    /* renamed from: d */
    public final C47247a mo110621d() {
        if (this.f361158d == null) {
            synchronized (this.f361159e) {
                if (this.f361158d == null) {
                    this.f361158d = mo110428b();
                }
            }
        }
        return this.f361158d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo110622f() {
        if (!this.f361160f) {
            this.f361160f = true;
            mo110621d().mo17653jN();
            CustodioMusicSettingsFragment custodioMusicSettingsFragment = (CustodioMusicSettingsFragment) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f361157c) {
            return null;
        }
        mo110427a();
        return this.f361156a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo110621d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f361156a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo110427a();
        mo110622f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo110427a();
        mo110622f();
    }
}
