package com.google.android.apps.search.googleapp.stampviewer.webview;

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

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.ae */
/* compiled from: PG */
class C139518ae extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f379338a;

    /* renamed from: c */
    private volatile C47222f f379339c;

    /* renamed from: d */
    private final Object f379340d = new Object();

    /* renamed from: a */
    private final void m226762a() {
        if (this.f379338a == null) {
            this.f379338a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C47222f mo115024d() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C47222f mo115025f() {
        if (this.f379339c == null) {
            synchronized (this.f379340d) {
                if (this.f379339c == null) {
                    this.f379339c = mo115024d();
                }
            }
        }
        return this.f379339c;
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        m226762a();
        return this.f379338a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo115026j() {
        C139618h hVar = (C139618h) this;
        ((C139668z) mo115025f().mo17653jN()).mo115157jo();
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo115025f().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f379338a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        m226762a();
        mo115026j();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        m226762a();
        mo115026j();
    }
}
