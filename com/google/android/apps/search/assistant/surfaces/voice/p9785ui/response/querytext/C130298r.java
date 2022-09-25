package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.querytext;

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

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.querytext.r */
/* compiled from: PG */
class C130298r extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f357163a;

    /* renamed from: c */
    private volatile C47222f f357164c;

    /* renamed from: d */
    private final Object f357165d = new Object();

    /* renamed from: a */
    private final void m212732a() {
        if (this.f357163a == null) {
            this.f357163a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C47222f mo109627d() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C47222f mo109638f() {
        if (this.f357164c == null) {
            synchronized (this.f357165d) {
                if (this.f357164c == null) {
                    this.f357164c = mo109627d();
                }
            }
        }
        return this.f357164c;
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        m212732a();
        return this.f357163a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo109639j() {
        C130288h hVar = (C130288h) this;
        ((C130296p) mo109638f().mo17653jN()).mo109635kU();
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo109638f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f357163a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        m212732a();
        mo109639j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        m212732a();
        mo109639j();
    }
}
