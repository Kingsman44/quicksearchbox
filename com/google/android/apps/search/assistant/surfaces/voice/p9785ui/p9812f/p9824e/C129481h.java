package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9824e;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.apps.tiktok.inject.baseclasses.C47210f;
import com.google.apps.tiktok.inject.p3654a.p3655a.C47189c;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47216a;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import com.google.common.base.C58838bb;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.f.e.h */
/* compiled from: PG */
class C129481h extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f355487a;

    /* renamed from: c */
    private volatile C47222f f355488c;

    /* renamed from: d */
    private final Object f355489d = new Object();

    /* renamed from: a */
    private final void m211389a() {
        if (this.f355487a == null) {
            this.f355487a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C47222f mo109047d() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C47222f mo109050f() {
        if (this.f355488c == null) {
            synchronized (this.f355489d) {
                if (this.f355488c == null) {
                    this.f355488c = mo109047d();
                }
            }
        }
        return this.f355488c;
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        m211389a();
        return this.f355487a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo109051j() {
        C129476c cVar = (C129476c) this;
        ((C129480g) mo109050f().mo17653jN()).mo109049kd();
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo109050f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f355487a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        m211389a();
        mo109051j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        m211389a();
        mo109051j();
    }
}
