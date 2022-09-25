package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9813a;

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

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.f.a.g */
/* compiled from: PG */
class C129408g extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f355343a;

    /* renamed from: c */
    private volatile C47222f f355344c;

    /* renamed from: d */
    private final Object f355345d = new Object();

    /* renamed from: a */
    private final void mo109019a() {
        if (this.f355343a == null) {
            this.f355343a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo109020b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo109024d() {
        if (this.f355344c == null) {
            synchronized (this.f355345d) {
                if (this.f355344c == null) {
                    this.f355344c = mo109020b();
                }
            }
        }
        return this.f355344c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo109025f() {
        C129402b bVar = (C129402b) this;
        ((C129407f) mo109024d().mo17653jN()).mo109023jt();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo109019a();
        return this.f355343a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo109024d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f355343a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo109019a();
        mo109025f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo109019a();
        mo109025f();
    }
}
