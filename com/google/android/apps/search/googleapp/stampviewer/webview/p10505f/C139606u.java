package com.google.android.apps.search.googleapp.stampviewer.webview.p10505f;

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

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.f.u */
/* compiled from: PG */
class C139606u extends C47210f implements C68288b, C47216a {

    /* renamed from: a */
    private ContextWrapper f379499a;

    /* renamed from: c */
    private volatile C47222f f379500c;

    /* renamed from: d */
    private final Object f379501d = new Object();

    /* renamed from: a */
    private final void mo115079a() {
        if (this.f379499a == null) {
            this.f379499a = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo115080b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo115090d() {
        if (this.f379500c == null) {
            synchronized (this.f379501d) {
                if (this.f379500c == null) {
                    this.f379500c = mo115080b();
                }
            }
        }
        return this.f379500c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo115091f() {
        C139580c cVar = (C139580c) this;
        ((C139593h) mo115090d().mo17653jN()).mo115083kQ();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo115079a();
        return this.f379499a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo115090d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f379499a;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo115079a();
        mo115091f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo115079a();
        mo115091f();
    }
}
