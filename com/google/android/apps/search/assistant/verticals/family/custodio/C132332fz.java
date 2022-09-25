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

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.fz */
/* compiled from: PG */
class C132332fz extends C47210f implements C68288b {

    /* renamed from: a */
    private ContextWrapper f361231a;

    /* renamed from: c */
    private boolean f361232c;

    /* renamed from: d */
    private volatile C47247a f361233d;

    /* renamed from: e */
    private final Object f361234e = new Object();

    /* renamed from: f */
    private boolean f361235f = false;

    /* renamed from: e */
    private final void mo17857e() {
        if (this.f361231a == null) {
            this.f361231a = new C47252b.C47253a(super.getContext(), (Fragment) this);
            this.f361232c = C68297a.m98634a(super.getContext());
        }
    }

    /* renamed from: a */
    public final C47247a mo110651a() {
        if (this.f361233d == null) {
            synchronized (this.f361234e) {
                if (this.f361233d == null) {
                    this.f361233d = mo110474b();
                }
            }
        }
        return this.f361233d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47247a mo110474b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo110652d() {
        if (!this.f361235f) {
            this.f361235f = true;
            mo110651a().mo17653jN();
            VoiceMatchDeeplinkingFragment voiceMatchDeeplinkingFragment = (VoiceMatchDeeplinkingFragment) this;
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f361232c) {
            return null;
        }
        mo17857e();
        return this.f361231a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo110651a().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f361231a;
        boolean z = true;
        if (!(contextWrapper == null || C68324h.m98668e(contextWrapper) == activity)) {
            z = false;
        }
        C68289c.m98631a(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        mo17857e();
        mo110652d();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo17857e();
        mo110652d();
    }
}
