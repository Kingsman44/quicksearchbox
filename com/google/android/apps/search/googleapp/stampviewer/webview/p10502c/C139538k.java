package com.google.android.apps.search.googleapp.stampviewer.webview.p10502c;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1629c.p1630a.C19521a;
import com.google.apps.tiktok.inject.p3654a.p3655a.C47189c;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47216a;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import com.google.common.base.C58838bb;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.c.k */
/* compiled from: PG */
class C139538k extends C19521a implements C68288b, C47216a {

    /* renamed from: b */
    private ContextWrapper f379371b;

    /* renamed from: c */
    private volatile C47222f f379372c;

    /* renamed from: d */
    private final Object f379373d = new Object();

    /* renamed from: a */
    private final void mo18360a() {
        if (this.f379371b == null) {
            this.f379371b = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo115036b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo115041d() {
        if (this.f379372c == null) {
            synchronized (this.f379373d) {
                if (this.f379372c == null) {
                    this.f379372c = mo115036b();
                }
            }
        }
        return this.f379372c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo115042f() {
        C139529b bVar = (C139529b) this;
        ((C139537j) mo115041d().mo17653jN()).mo115040jI();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo18360a();
        return this.f379371b;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo115041d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f379371b;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo18360a();
        mo115042f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo18360a();
        mo115042f();
    }
}
