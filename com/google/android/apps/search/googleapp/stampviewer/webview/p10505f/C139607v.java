package com.google.android.apps.search.googleapp.stampviewer.webview.p10505f;

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

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.f.v */
/* compiled from: PG */
class C139607v extends C19521a implements C68288b, C47216a {

    /* renamed from: b */
    private ContextWrapper f379502b;

    /* renamed from: c */
    private volatile C47222f f379503c;

    /* renamed from: d */
    private final Object f379504d = new Object();

    /* renamed from: a */
    private final void mo18360a() {
        if (this.f379502b == null) {
            this.f379502b = new C47252b.C47253a(super.getContext(), (Fragment) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C47222f mo115084b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47222f mo115092d() {
        if (this.f379503c == null) {
            synchronized (this.f379504d) {
                if (this.f379503c == null) {
                    this.f379503c = mo115084b();
                }
            }
        }
        return this.f379503c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo115093f() {
        C139595j jVar = (C139595j) this;
        ((C139602q) mo115092d().mo17653jN()).mo115088kR();
    }

    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        mo18360a();
        return this.f379502b;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C47189c.m83940a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo115092d().mo17653jN();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f379502b;
        boolean z = true;
        if (!(contextWrapper == null || C47222f.m84008a(contextWrapper) == activity)) {
            z = false;
        }
        C58838bb.m90884s(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.");
        mo18360a();
        mo115093f();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new C47252b.C47253a(onGetLayoutInflater, (Fragment) this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        mo18360a();
        mo115093f();
    }
}
